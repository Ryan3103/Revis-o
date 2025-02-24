package Ex_Aritmeticas.aritimeticos;

public class exercicio26 {

        public static void main(String[] args) {
            int[][] matriz3x3 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            for (int[] linha : matriz3x3) {
                for (int num : linha) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }