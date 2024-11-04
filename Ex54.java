import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        // Solicita o termo inicial e o termo final
        System.out.print("Digite o termo inicial: ");
        int termoInicial = leia.nextInt();
        
        System.out.print("Digite o termo final: ");
        int termoFinal = leia.nextInt();
        
        System.out.println("Numeros da sequência de Fibonacci do termo " + termoInicial + " ao termo " + termoFinal + ":");
        
        int primeiro = 0, segundo = 1;
        int termoAtual = 0;
        
        // Gera a sequência de Fibonacci até o termo final
        for (int i = 0; i <= termoFinal; i++) {
            if (i == termoAtual) {
                if (i >= termoInicial) {
                    System.out.print(segundo + (i < termoFinal ? ", " : ""));
                }
                termoAtual++;
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        
        leia.close();
    }
}
