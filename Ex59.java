import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Solicita os dois primeiros termos da sequência de Ricci
        System.out.print("Digite o primeiro termo da sequencia de Ricci: ");
        int primeiroTermo = leia.nextInt();

        System.out.print("Digite o segundo termo da sequencia de Ricci: ");
        int segundoTermo = leia.nextInt();

        // Solicita a quantidade de termos a serem gerados
        System.out.print("Digite a quantidade de termos que deseja gerar: ");
        int quantidadeTermos = leia.nextInt();

        // Imprime os dois primeiros termos
        System.out.println("Sequência de Ricci:");
        System.out.println(primeiroTermo);
        System.out.println(segundoTermo);

        // Gera e imprime os próximos termos da sequência
        for (int i = 2; i < quantidadeTermos; i++) { // Começa de 2 porque já temos os dois primeiros termos
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.println(proximoTermo);

            // Atualiza os termos para o próximo cálculo
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        leia.close();
    }
}
