package Revisao;
import java.util.*;
public class exercicio3 {
    public static void exercicio3() {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            soma += sc.nextInt();
        }
        System.out.println("Média dos números: " + (soma / 6.0));
    }
}
