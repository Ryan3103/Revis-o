package Revisao;
import java.util.Scanner;
public class exercicio13 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int[3][3];
            int maiorElemento = Integer.MIN_VALUE;

            // Preenchendo a matriz
            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("Elemento [%d,%d]: ", i + 1, j + 1);
                    matriz[i][j] = scanner.nextInt();
                    if (matriz[i][j] > maiorElemento) {
                        maiorElemento = matriz[i][j]; // Atualiza o maior número
                    }
                }
            }

            System.out.println("\nMaior elemento da matriz: " + maiorElemento);
            scanner.close();
        }
    }
