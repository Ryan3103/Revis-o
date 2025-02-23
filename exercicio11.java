package Revisao;
import java.util.*;
public class exercicio11 {



        public static void exercicio11() {
            Scanner sc = new Scanner(System.in);
            List<Integer> numeros = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o " + (i+1) + "º número: ");
                numeros.add(sc.nextInt());
            }
            System.out.println("Números digitados: " + numeros);
        }
}
