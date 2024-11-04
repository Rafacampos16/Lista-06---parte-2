import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        // Solicita um número inteiro ao usuário
        System.out.print("Digite um numero inteiro: ");
        int numero = leia.nextInt();
        
        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(numero + " nao pertence a sequencia de Fibonacci.");
        }
        
        leia.close();
    }
    
    // Método para verificar se um número é parte da sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        int primeiro = 0, segundo = 1;
        
        // Se o número for 0 ou 1, é parte da sequência
        if (n == primeiro || n == segundo) {
            return true;
        }
        
        // Gera os números de Fibonacci até que o último número seja maior ou igual a n
        while (segundo < n) {
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        
        // Verifica se o último número gerado é igual ao número fornecido
        return segundo == n;
    }
}
