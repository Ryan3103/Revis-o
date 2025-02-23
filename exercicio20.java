package Revisao;
import java.util.Scanner;
public class exercicio20 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int[4][4];
            int somaLinha, somaColuna;

            System.out.println("Digite os elementos da matriz 4x4:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.printf("Elemento [%d,%d]: ", i + 1, j + 1);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nSoma de cada linha:");
            for (int i = 0; i < 4; i++) {
                somaLinha = 0;
                for (int j = 0; j < 4; j++) {
                    somaLinha += matriz[i][j];
                }
                System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
            }

            System.out.println("\nSoma de cada coluna:");
            for (int j = 0; j < 4; j++) {
                somaColuna = 0;
                for (int i = 0; i < 4; i++) {
                    somaColuna += matriz[i][j];
                }
                System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna);
            }

            scanner.close();
        }
    }