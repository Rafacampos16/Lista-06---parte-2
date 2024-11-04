public class Ex47 {
    public static void main(String[] args) {
		System.out.println("Numeros primos de 1 ate 100:");

        for (int numero = 2; numero <= 100; numero++) {
            boolean ehPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(numero);
            }
        }
    }
}

//Imprima somente os números primos existentes na faixa de um 1 até 100.
