import java.util.Scanner;

public class Ex61 {
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
            System.out.print(numerador + "/" + denominador);
            if (i < termos) {
                System.out.print(" + ");
            }

            // Soma os termos
            soma += (double) numerador / denominador;

            // Incrementa o numerador e o denominador
            numerador += 2;
            denominador += 2;
        }

        // Exibe a soma dos termos
        System.out.println("\nSoma dos termos: " + soma);
    }
}
