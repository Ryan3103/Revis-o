package Ex_Aritmeticas.aritimeticos;

public class exercicio28 {
        public static void main(String[] args) {
            int[][] matriz3x3 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            int maior = matriz3x3[0][0];
            for (int[] linha : matriz3x3) {
                for (int num : linha) {
                    if (num > maior) {
                        maior = num;
                    }
                }
            }
            System.out.println("Maior elemento: " + maior);
        }
    }