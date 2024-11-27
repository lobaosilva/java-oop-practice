# **Exercício: Métodos com Retorno**

Este repositório apresenta uma implementação simples de uma **Calculadora** em Java, com métodos básicos para operações matemáticas e um exemplo de uso prático.    
A solução destaca conceitos fundamentais de programação orientada a objetos, tratamento de erros e boas práticas de modularidade.

---

## 📝 **Enunciado do Exercício**

Implemente uma classe chamada **`Calculadora`**, que deve conter os seguintes métodos:

1. **`somar`:** Retorna a soma de dois números.
2. **`subtrair`:** Retorna a diferença entre dois números.
3. **`multiplicar`:** Retorna o produto de dois números.
4. **`dividir`:** Retorna o quociente entre dois números. Caso o divisor seja `0`, retorne `0` e exiba uma mensagem de erro.

Na **classe principal (`Main`)**, crie uma instância da `Calculadora`, teste todos os métodos com valores de exemplo e exiba os resultados no console.

---

## 💻 **Código Fonte**

### **Classe `Calculadora`**

```java
public class Calculadora {
    // Método para somar dois números
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair dois números
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dois números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dois números, com tratamento para divisor zero
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }
        return a / b;
    }
}
```

---

### **Classe Principal (`Main`)**

```java
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da Calculadora
        Calculadora calculadora = new Calculadora();

        // Exemplos de operações
        double num1 = 10;
        double num2 = 5;
        double num3 = 0; // Exemplo de divisor zero

        // Exibindo os resultados das operações
        System.out.println("Resultados das Operações:");
        System.out.println("Soma: " + calculadora.somar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));
        System.out.println("Divisão (válida): " + calculadora.dividir(num1, num2));
        System.out.println("Divisão (por zero): " + calculadora.dividir(num1, num3));
    }
}
```

---

## 📊 **Exemplo de Saída no Console**

Com os valores `num1 = 10`, `num2 = 5` e `num3 = 0`:

```yaml
Resultados das Operações:
Soma: 15.0
Subtração: 5.0
Multiplicação: 50.0
Divisão (válida): 2.0
Erro: Divisão por zero não é permitida.
Divisão (por zero): 0.0
```

---

## 🔍 **Explicação Técnica**

### **Classe `Calculadora`:**
- **Modularidade**: Cada operação é implementada em um método separado.
- **Tratamento de Erros**: O método `dividir` evita divisões inválidas ao verificar se o divisor é `0`, exibindo uma mensagem de erro apropriada.
- **Reutilização**: Métodos independentes podem ser facilmente integrados em projetos maiores.

### **Classe Principal (`Main`):**
- **Teste Prático**: Os métodos da `Calculadora` são chamados com valores de exemplo para demonstrar suas funcionalidades.
- **Saída Organizada**: Resultados das operações são exibidos de forma clara e direta no console.

---

## 🚀 **Benefícios do Exercício**

- **Fundamentos de OOP**: Explora encapsulamento e modularidade.
- **Boas Práticas**: Inclui validação e tratamento de erros.
- **Flexibilidade**: A classe `Calculadora` pode ser facilmente expandida para operações mais complexas.

---

## 📈 **Possíveis Melhorias**

1. **Novos Métodos**:  
   Adicione funcionalidades como:
    - Potência (`a^b`).
    - Raiz quadrada.
    - Cálculo de porcentagem.

2. **Interatividade**:  
   Desenvolva uma interface para que o usuário escolha as operações e insira os números.

3. **Testes Automatizados**:  
   Escreva testes unitários para validar automaticamente os métodos.

---

## 🌟 **Conclusão**

Esta implementação simples de uma **Calculadora** em Java demonstra como organizar a lógica matemática em métodos reutilizáveis, além de destacar a importância do tratamento de erros.

A abordagem modular facilita a manutenção e a escalabilidade, tornando o código uma base sólida para projetos futuros. ✨  