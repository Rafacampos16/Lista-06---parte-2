import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
         
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de termos da sequencia de Fibonacci: ");
        int n = leia.nextInt();

        int primeiro = 0, segundo = 1;
        
        System.out.println("Sequencia de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        
        leia.close();
    }
}
