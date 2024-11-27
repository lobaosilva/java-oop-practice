package exercico2;

public class Main {

    public static void main(String[] args) {

        // Criando uma instância da Calculadora
        Calculadora calculadora = new Calculadora();

        // Exemplos de operações
        double num1 = 10;
        double num2 = 5;
        double num3 = 0; // Exemplo de divisor zero

        // Chamando os métodos da Calculadora e exibindo os resultados
        System.out.println("Resultados das Operações:");
        System.out.println("Soma: " + calculadora.somar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));
        System.out.println("Divisão (válida): " + calculadora.dividir(num1, num2));
        System.out.println("Divisão (por zero): " + calculadora.dividir(num1, num3));
    }
}
