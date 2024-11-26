# **Exercício: Criação de Classes e Atributos**

Este exercício apresenta os conceitos básicos de modelagem de objetos com Java, focando na criação de classes, atributos e métodos. O objetivo é implementar uma classe `Pessoa` com atributos básicos e um método para exibir suas informações.

---

## 📝 **Enunciado**

Crie uma classe chamada **`Pessoa`** com os seguintes atributos:

- **`nome`**: Nome da pessoa (String).
- **`idade`**: Idade da pessoa (int).
- **`cpf`**: CPF da pessoa (String).

Implemente o método **`exibirInformacoes`**, que exibe os valores desses atributos no console.

---

## 💡 **Solução**

### **Classe `Pessoa`**

```java
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
```

### **Classe Principal para Teste**

```java
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Ana Souza", 28, "123.456.789-00");

        // Exibindo as informações
        pessoa1.exibirInformacoes();
    }
}
```

---

## 📖 **Explicação do Código**

1. **Encapsulamento:**
    - Os atributos da classe `Pessoa` são **privados** (`private`) para proteger os dados.
    - O acesso aos atributos é controlado por meio de métodos (getters e setters).

2. **Construtor:**
    - Facilita a inicialização dos atributos ao criar um objeto.
    - Recebe os valores necessários para `nome`, `idade` e `cpf`.

3. **Método `exibirInformacoes`:**
    - Um método simples que exibe os valores dos atributos no console com o uso de `System.out.println()`.

4. **Classe `Main`:**
    - Serve como ponto de entrada para o programa.
    - Demonstra o uso da classe `Pessoa` ao instanciar um objeto e chamar o método `exibirInformacoes`.

---

## ✅ **Saída no Console**

Ao executar o programa, a saída será:

```yaml
Informações da Pessoa:
Nome: Ana Souza
Idade: 28
CPF: 123.456.789-00
```

---

## 🚀 **Por que Este Exercício é Importante?**

- **Introdução à modelagem de objetos:** Representa entidades do mundo real usando classes e atributos.
- **Encapsulamento:** Promove segurança e organização ao proteger os dados.
- **Reutilização de Código:** A classe `Pessoa` pode ser reutilizada em aplicações mais complexas.

---

## 🔧 **Melhorias Futuras**

1. **Validação de Dados:**
    - Verificar se a idade é positiva.
    - Validar o formato do CPF.

2. **Novos Métodos:**
    - Adicionar funcionalidades como `verificarMaioridade` ou `atualizarDados`.

3. **Interface Gráfica:**
    - Exibir os dados de forma visual para melhorar a usabilidade.

---

## 🌟 **Conclusão**

Este exercício é um ponto de partida essencial para entender os conceitos básicos de Orientação a Objetos com Java. Ele enfatiza a importância de uma boa organização do código e do uso correto de construtores, métodos e encapsulamento.

Explore, pratique e leve seu aprendizado ao próximo nível! 🎯