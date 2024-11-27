package exercico2;

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
