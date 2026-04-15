package Heranca;

public class Professor extends Pessoa {
    private String area;

    public Professor(String nome, String cpf, String area) {
        super(nome, cpf);
        this.area = area;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Área: " + area);
    }
}