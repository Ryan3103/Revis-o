package Revisao;
import java.util.*;
public class exercicio6 {
    public static void exercicio6() {
        Random rand = new Random();
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(rand.nextInt(100) + 1);
        }
        System.out.println("Lista original: " + numeros);
        numeros.removeIf(n -> n % 2 != 0);
        System.out.println("Lista sem ímpares: " + numeros);
    }
}
