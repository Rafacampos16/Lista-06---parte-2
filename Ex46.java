import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leia.nextInt();
        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false; // Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) { // testar se o número é divisível por qualquer valor de 2 até a raiz quadrada do número 
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println("O numero " + numero + " e primo.");
        } else {
            System.out.println("O numero " + numero + " nao e primo.");
        }

        leia.close();
    }
}

//46) Solicite ao usuário um número e verifique se este número é primo ou não.
