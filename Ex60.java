import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Solicita os dois primeiros termos da sequência de Ricci
        System.out.print("Digite o primeiro termo da sequencia de Ricci: ");
        int primeiroTermo = leia.nextInt();

        System.out.print("Digite o segundo termo da sequencia de Ricci: ");
        int segundoTermo = leia.nextInt();

        // Solicita um número para verificar
        System.out.print("Digite um numero para verificar se pertence a sequencia de Ricci: ");
        int numeroParaVerificar = leia.nextInt();

        // Verifica se o número pertence à sequência de Ricci
        if (pertenceSequenciaRicci(primeiroTermo, segundoTermo, numeroParaVerificar)) {
            System.out.println(numeroParaVerificar + " pertence a sequência de Ricci.");
        } else {
            System.out.println(numeroParaVerificar + " não pertence a sequência de Ricci.");
        }

        leia.close();
    }

    public static boolean pertenceSequenciaRicci(int a, int b, int numero) {
        // Verifica se o número informado é igual a algum dos dois primeiros termos
        if (numero == a || numero == b) {
            return true;
        }

        // Gera a sequência até que o número seja encontrado ou ultrapasse o número
        while (b < numero) {
            int proximoTermo = a + b; // Calcula o próximo termo
            a = b;                     // Atualiza os termos
            b = proximoTermo;

            // Verifica se o número pertence à sequência
            if (b == numero) {
                return true;
            }
        }
        return false; // O número não pertence à sequência
    }
}
