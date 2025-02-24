package Ex_Aritmeticas.aritimeticos;

import java.util.Arrays;

public class exercicio29 {

        public static void main(String[] args) {
            int[][] matriz4x4 = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };
            int[] somaColunas = new int[4];
            for (int[] linha : matriz4x4) {
                for (int j = 0; j < linha.length; j++) {
                    somaColunas[j] += linha[j];
                }
            }
            System.out.println("Soma de cada coluna: " + Arrays.toString(somaColunas));
        }
    }