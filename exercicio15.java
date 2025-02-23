package Revisao;
import java.util.Scanner;
public class exercicio15 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int[3][3];
            int somaDiagonalSecundaria = 0;

            // Preenchendo a matriz
            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("Elemento [%d,%d]: ", i + 1, j + 1);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Calculando a soma da diagonal secundária
            for (int i = 0; i < 3; i++) {
                somaDiagonalSecundaria += matriz[i][2 - i];
            }

            System.out.println("\nSoma da diagonal secundária: " + somaDiagonalSecundaria);
            scanner.close();
        }
    }

