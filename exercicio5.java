package Revisao;
import java.util.*;
public class exercicio5 {
    public static void exercicio5() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(rand.nextInt(100) + 1);
        }
        System.out.println("Lista gerada: " + numeros);
        System.out.print("Digite um número para verificar se está na lista: ");
        int num = sc.nextInt();
        System.out.println(numeros.contains(num) ? "Número encontrado!" : "Número não encontrado.");
    }
}
