package Ex_Aritmeticas.aritimeticos;

public class exercicio27 {
        public static void main(String[] args) {
            int[][] matriz4x4 = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };
            int somaMatriz = 0;
            for (int[] linha : matriz4x4) {
                for (int num : linha) {
                    somaMatriz += num;
                }
            }
            System.out.println("Soma da matriz 4x4: " + somaMatriz);
        }
    }