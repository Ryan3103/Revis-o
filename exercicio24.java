package Ex_Aritmeticas.aritimeticos;

public class exercicio24 {

        public static void main(String[] args) {
            int[] listaNumeros = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
            for (int num : listaNumeros) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
        }
    }