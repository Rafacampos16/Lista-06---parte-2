import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int termos;

        while (true) {
            System.out.print("Digite a quantidade de termos (negativo para nova entrada, zero para sair): ");
            termos = leia.nextInt();

            if (termos < 0) {
                // Se o valor for negativo, solicita nova entrada
                continue;
            } else if (termos == 0) {
                // Se o valor for zero, finaliza o programa
                System.out.println("Programa finalizado.");
                break;
            } else {
                // Imprime a sequência de termos
                for (int i = 1; i <= termos; i++) {
                    System.out.print(i);
                    System.out.print(", "); // Imprime o número positivo

                    System.out.print(-i); // Imprime o número negativo
                    if (i < termos) {
                        System.out.print(", "); // Formata a saída para não ter vírgula no final
                    }
                }
                System.out.println(); // Pula para a próxima linha
            }
        }

        leia.close();
    }
}

/*) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1, -1, 2, -2, 3, -3, ...


*/
