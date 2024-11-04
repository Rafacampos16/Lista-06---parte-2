import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequencia de fatoriais: ");
        int qntd = leia.nextInt();

        for (int numero = qntd; numero >= 1; numero--) {
            int fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " e: " + fatorial);
        }

        leia.close();
    }
}

/*Solicite ao usuário a quantidade de termos da sequência de fatoriais e imprima a
sequência do final para o início.
*/
