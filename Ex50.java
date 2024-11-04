import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o termo inicial: ");
        int termoInicial = leia.nextInt();

        System.out.print("Digite a quantidade de termos da sequencia de numeros primos: ");
        int quantidade = leia.nextInt();

        int contadorPrimos = 0;  // Contador de números primos encontrados
        int numero = termoInicial;  // Começa a verificar a partir do termo inicial

        // Laço que continua até que a quantidade de primos seja atingida
        while (contadorPrimos < quantidade) {
            boolean ehPrimo = true;

            // Verifica se o número é primo
            if (numero < 2) {
                ehPrimo = false; // Números menores que 2 não são primos
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            // Se o número for primo, imprime e incrementa o contador de primos
            if (ehPrimo) {
                System.out.println(numero);
                contadorPrimos++;
            }

            numero++;
        }

        leia.close();
    }
}
