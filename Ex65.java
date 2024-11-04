import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Solicita a quantidade de termos
        System.out.print("Digite a quantidade de termos da sequencia: ");
        int termos = leia.nextInt();

        int[] primos = new int[termos];
        double soma = 0;

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
            int fatorial = calculaFatorial(i + 1); // Fatorial de (i+1)
            if (i % 2 == 0) {  // Termos com sinal negativo
                if (i > 0) {
                    System.out.print(" - ");
                }
                System.out.print(fatorial + "/" + primos[i]);
                soma -= (double) fatorial / primos[i];
            } else {  // Termos com sinal positivo
                System.out.print(" + " + fatorial + "/" + primos[i]);
                soma += (double) fatorial / primos[i];
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

    // Função para calcular o fatorial de um número
    public static int calculaFatorial(int n) {
        int fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
