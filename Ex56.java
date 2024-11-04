public class Ex56 {
    public static void main(String[] args) {
        System.out.println("Numeros perfeitos na faixa de 1 a 900:");

        for (int numero = 1; numero <= 900; numero++) {
            int somaDivisores = 0;

            // Calcula a soma dos divisores próprios do número
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    somaDivisores += i;
                }
            }

            // Verifica se o número é perfeito
            if (somaDivisores == numero) {
                System.out.println(numero);
            }
        }
    }
}
