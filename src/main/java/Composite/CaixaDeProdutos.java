package Composite;

import java.util.ArrayList;
import java.util.List;

public class CaixaDeProdutos implements ItemComercial{
    private String nomeCaixa;
    private List<ItemComercial> itens = new ArrayList<>();

    public CaixaDeProdutos(String nomeCaixa){
        this.nomeCaixa = nomeCaixa;
    }

    public void adicionarItem(ItemComercial item){
        itens.add(item);
    }

    @Override
    public double calcularPreco(){
        double precoTotal = 0.0;
        for(ItemComercial item:itens){
            precoTotal += item.calcularPreco();
        }
        return precoTotal;
    }

    @Override
    public void exibirDetalhes(String indentacao){
        System.out.printf("%s[Caixa] %s\n",indentacao,nomeCaixa);
        for (ItemComercial item:itens){
            item.exibirDetalhes(indentacao + "    ");
        }
    }

}
