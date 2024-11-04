import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequencia de numeros primos: ");
        int quantidade = leia.nextInt();

        int contadorPrimos = 0;  // Contador de números primos encontrados
        int numero = 2;  // Começa a verificar a partir de 2, o primeiro número primo

        while (contadorPrimos < quantidade) {
            boolean ehPrimo = true;

            // Verifica se o número é primo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            // Se o número for primo, exibe e incrementa o contador de primos
            if (ehPrimo) {
                System.out.println(numero);
                contadorPrimos++;
            }

            numero++;
        }

        leia.close();
    }
}
/*Solicite ao usuário a quantidade de termos da sequência de números primos e
imprima o resultado.*/
