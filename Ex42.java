
public class Ex42 {
	
	public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++) {
            int fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " e: " + fatorial);
        }
    }
}


/*Construa um programa para mostrar o fatorial dos números inteiros na
faixa de 1 a 10.
*/
