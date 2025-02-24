package Ex_Aritmeticas.aritimeticos;

public class exercicio22 {
        public static void main(String[] args) {
            int[] numeros = {1, 2, 3, 4, 5};
            int soma = 0;
            for (int num : numeros) {
                soma += num;
            }
            System.out.println("Soma: " + soma);
        }
    }