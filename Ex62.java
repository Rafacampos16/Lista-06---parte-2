import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Solicita a quantidade de termos
        System.out.print("Digite a quantidade de termos da sequencia: ");
        int termos = leia.nextInt();

        double soma = 0;
        int numerador = 2;
        int denominador = 1;

        System.out.print("Sequencia: ");

        for (int i = 1; i <= termos; i++) {
            // Se o índice for ímpar, usa sinal positivo, se for par, usa sinal negativo
            if (i % 2 != 0) {
                // Primeiro termo ou termos positivos
                if (i > 1) {
                    System.out.print(" + ");
                }
                System.out.print(numerador + "/" + denominador);
                soma += (double) numerador / denominador;
            } else {
                // Termos negativos
                System.out.print(" - " + numerador + "/" + denominador);
                soma -= (double) numerador / denominador;
            }

            // Incrementa o numerador e o denominador
            numerador += 2;
            denominador += 2;
        }

        // Exibe a soma dos termos
        System.out.println("\nSoma dos termos: " + soma);
    }
}
