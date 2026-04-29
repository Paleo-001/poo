package Biblioteca;

public class Bibliotecario extends Participante{
    private String setorResponsavel;

    public Bibliotecario(String nome, String email, String setor){
        super(nome, email);
        this.setorResponsavel = setor;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Setor responsável: " + setorResponsavel);
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }
}
