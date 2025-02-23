package Revisao;

import java.util.Scanner;

public class exercicio16 {


    public class MatrizIdentidade {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o tamanho da matriz identidade: ");
            int n = scanner.nextInt();

            int[][] matrizIdentidade = new int[n][n];

            System.out.println("\nMatriz Identidade:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        matrizIdentidade[i][j] = 1;
                    } else {
                        matrizIdentidade[i][j] = 0;
                    }
                    System.out.printf("%3d ", matrizIdentidade[i][j]);
                }
                System.out.println();
            }
            scanner.close();
        }
    }

}
