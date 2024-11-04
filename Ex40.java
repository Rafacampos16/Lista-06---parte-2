import java.util.Scanner;

public class Ex40 {
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
                // Calcula a quantidade de termos para a sequência
                int metade = termos / 2;

                // Imprime a sequência de termos
                for (int i = 1; i <= termos; i++) {
                    if (i <= metade) {
                        System.out.print(i); // Imprime a parte crescente
                    } else {
                        System.out.print((termos - i + 1)); // Imprime a parte decrescente
                    }

                    if (i < termos) {
                        System.out.print(", "); // Formata a saída
                    }
                }
                System.out.println(); // Pula para a próxima linha
            }
        }

        leia.close();
    }
}

/*
 * Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1, 2, 3, ..., 10, 10, 9, 8, ..., 1. Exemplo com entrada de 20
termos
  */
