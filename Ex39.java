import java.util.Scanner;

public class Ex39 {
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
            } else if (termos > 50) {
                // Se o valor for maior que 50, informa o limite
                System.out.println("Por favor, insira um valor de termos menor ou igual a 50.");
                continue;
            } else {
                // Imprime a sequência e calcula a soma
                double soma = 0; // Inicializa a soma

                for (int i = 1; i <= termos; i++) {
                    double fracao = (double) i / (51 - i); // Calcula a fração i/(51-i)
                    soma += fracao; // Acumula a soma

                    // Imprime a fração
                    System.out.print(i + "/" + (51 - i));

                    if (i < termos) {
                        System.out.print(" + "); // Formata a saída
                    }
                }

                System.out.println(); // Pula para a próxima linha
                System.out.printf("Soma da sequência: %.2f%n", soma); // Imprime a soma com duas casas decimais
            }
        }

        leia.close();
    }
}


/*37) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1/50 + 2/49, 3/48 + ... + 50/1. Exemplo com entrada de 50
termos. Apresentar a soma desta sequência no final.


*/
