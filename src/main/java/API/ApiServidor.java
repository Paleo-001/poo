package API;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;

public class ApiServidor {
    static ArrayList<Veiculo> frota = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        frota.add(new Carro("Ham","Rampage",4));
        frota.add(new Carro("Honda","Civic",4));

        HttpServer servidor = HttpServer.create(new InetSocketAddress(8060),0);

        servidor.createContext("/api/frota", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                exchange.getResponseHeaders().add("Access-Control-Allow-Origin","*");
                exchange.getResponseHeaders().add("Access-Control-Allow-Methods","GET, POST, OPTIONS");
                String metodo = exchange.getRequestMethod();
                if ("GET".equals(metodo)){
                    exchange.getResponseHeaders().add("Content-Type","application/json; charset=UTF-8");
                    StringBuilder jsonResponse = new StringBuilder("[");
                    for (int i = 0; i < frota.size(); i++){
                        jsonResponse.append(frota.get(i).toJson());
                        if (i < frota.size() -1) jsonResponse.append(",");
                    }
                    jsonResponse.append("]");

                    enviarResposta(exchange, 200, jsonResponse.toString());
                } else if ("POST".equals(metodo)) {
                    InputStreamReader isr = new InputStreamReader(exchange.getRequestBody(),"utf-8");
                    BufferedReader br = new BufferedReader(isr);
                    String jsonRecebido = br.readLine();
                    String dadosLimpos = jsonRecebido.replace("{","").replace("}","").replace("\"","");
                    String[] partes = dadosLimpos.split(",");
                    String novaMarca = partes[0].split(":")[1];
                    String novoModelo = partes[1].split(":")[1];
                    int novasPortas = Integer.parseInt(partes[2].split(":")[1]);
                    frota.add(new Carro(novaMarca,novoModelo,novasPortas));
                    enviarResposta(exchange, 201, "{\"status:\":\"Criado com sucesso!\"}");
                } else if ("OPTIONS".equals(metodo)) {
                    exchange.sendResponseHeaders(204, -1);
                }
            }
        });
        servidor.setExecutor(null);
        servidor.start();
        System.out.println("Servidor rodando e aceitando GET e POST em http://localhost:8060/api/frota");
    }
    private static void enviarResposta(HttpExchange exchange, int statusCode, String resposta) throws IOException{
        byte[] responseBytes = resposta.getBytes("UTF-8");
        exchange.sendResponseHeaders(statusCode,responseBytes.length);
        OutputStream os = exchange.getResponseBody();
        os.write(responseBytes);
        os.close();
    }
}
