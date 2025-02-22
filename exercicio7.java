package Revisao;
import java.util.*;
public class exercicio7 {
    public static void exercicio7() {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros.add(sc.nextInt());
        }
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }

}
