package Revisao;

import java.util.Scanner;
public class exercicio19 {


    public class MatrizTransposta {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int[3][3];

            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("Elemento [%d,%d]: ", i + 1, j + 1);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nMatriz Transposta:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%3d ", matriz[j][i]);
                }
                System.out.println();
            }
            scanner.close();
        }
    }

}