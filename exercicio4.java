package Revisao;
import java.util.*;
public class exercicio4 {
    public static void exercicio4() {
        Random rand = new Random();
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(rand.nextInt(100) + 1);
        }
        System.out.println("Lista gerada: " + numeros);
        System.out.println("Maior número: " + Collections.max(numeros));
        System.out.println("Menor número: " + Collections.min(numeros));
    }
}
