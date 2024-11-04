import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leia.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " e: " + fatorial);
        
        leia.close();
    }
}

/*41) Solicite ao usuário um número e mostre o fatorial do número informado*/
