public class Ex30 {
	
	public static void main (String[] args) {
	   // Laço externo para os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Imprime o número inicial da linha
            System.out.print(i + ", ");
            
            // Laço para alternar entre ímpares e pares nas linhas
            if (i % 2 != 0) { // Se i é ímpar
                for (int j = 1; j <= (2 * i - 1); j += 2) {
                    System.out.print(j + " ");
                }
            } else { // Se i é par
                for (int j = 2; j <= 2 * i; j += 2) {
                    System.out.print(j + " ");
                }
            }
            
            // Pula para a próxima linha
            System.out.println();
        }
    }
}

/*30) Escreva um programa em Java que imprima sequência 6:
1, 1
2, 2 4
3, 1 3 5
4, 2 4 6 8
5, 1 3 5 7 9
6, 2 4 6 8 10 12
7, 1 3 5 7 9 11 13
8, 2 4 6 8 10 12 14 16
9, 1 3 5 7 9 11 13 15 17
10, 2 4 6 8 10 12 14 16 18 20
*/
