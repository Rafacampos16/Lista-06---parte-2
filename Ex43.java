import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
			
		int inteiros = 7;
			
		for (int j = 1; j <= inteiros; j++){
        System.out.print("Entre com o numero " + j + " : ");
        int numero = leia.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " e: " + fatorial + "\n");
		}
	}
}

/*Solicite ao usuário 7 números inteiros e para cada leitura informar o fatorial
desse número.
Solicite ao usuário 7 números inteiros e para cada leitura informar o fatorial
desse número.
*/
