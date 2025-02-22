package Revisao;

import java.util.*;

public class exercicio2 {
    public static void exercicio2() {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            soma += sc.nextInt();
        }
        System.out.println("Soma dos números: " + soma);
    }
}