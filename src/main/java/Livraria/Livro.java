package Livraria;

public class Livro {
    private int id;
    private final String titulo;
    private final String  autor;
    private final int ano;
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public int getId(){ return id; }
    public String getTitulo(){ return titulo; }
    public String getAutor(){ return autor; }
    public int getAno() { return ano; }
    public void setId(int id){ this.id = id; }
}
