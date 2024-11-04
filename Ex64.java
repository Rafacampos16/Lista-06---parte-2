import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Solicita a quantidade de termos
        System.out.print("Digite a quantidade de termos da sequencia: ");
        int termos = leia.nextInt();

        int[] fibonacci = new int[termos];
        int[] primos = new int[termos];
        double soma = 0;

        // Gerar sequência de Fibonacci
        fibonacci[0] = 1;
        if (termos > 1) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < termos; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Gerar sequência de números primos
        int contadorPrimos = 0;
        int numero = 2;
        while (contadorPrimos < termos) {
            if (ehPrimo(numero)) {
                primos[contadorPrimos] = numero;
                contadorPrimos++;
            }
            numero++;
        }

        // Imprimir a sequência alternando os sinais e calcular a soma
        System.out.print("Sequencia: ");
        for (int i = 0; i < termos; i++) {
            if (i % 2 == 0) {  // Termos com sinal positivo
                if (i > 0) {
                    System.out.print(" + ");
                }
                System.out.print(fibonacci[i] + "/" + primos[i]);
                soma += (double) fibonacci[i] / primos[i];
            } else {  // Termos com sinal negativo
                System.out.print(" - " + fibonacci[i] + "/" + primos[i]);
                soma -= (double) fibonacci[i] / primos[i];
            }
        }

        // Exibir a soma dos termos
        System.out.println("\nSoma dos termos: " + soma);
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
