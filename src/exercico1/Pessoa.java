package exercico1;

public class Pessoa {

    // Atributos da classe
    private String nome;
    private int idade;
    private String cpf;

    // Construtor
    public Pessoa(String nome, int idade, String cpf) {

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Método para exibir informações
    public void exibirInformacoes() {

        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }

    // Getters e Setters (opcional)
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }
}
