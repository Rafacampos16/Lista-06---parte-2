import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequencia de numeros primos: ");
        int quantidade = leia.nextInt();

        int[] primos = new int[quantidade]; //array que armazena ate o numero da qntd
        int contadorPrimos = 0;
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

            // Se o número for primo, armazena na lista
            if (ehPrimo) {
                primos[contadorPrimos] = numero;
                contadorPrimos++;
            }

            numero++;
        }

        // Imprime a sequência de números primos do final para o início
        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(primos[i]);
        }

        leia.close();
    }
}
/*) Solicite ao usuário a quantidade de termos da sequência de números primos
e imprima a sequência do final para o início.
*/
