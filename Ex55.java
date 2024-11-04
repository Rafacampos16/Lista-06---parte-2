import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = leia.nextInt();

        int somaDivisores = 0;

        // Calcula a soma dos divisores próprios do número
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        // Verifica se a soma dos divisores é igual ao número
        if (somaDivisores == numero) {
            System.out.println(numero + " e um numero perfeito.");
        } else {
            System.out.println(numero + " nao e um numero perfeito.");
        }

        leia.close();
    }
}
