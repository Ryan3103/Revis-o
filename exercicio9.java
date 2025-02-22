package Revisao;
import java.util.*;
public class exercicio9 {
    public static void exercicio9() {
        Scanner sc = new Scanner(System.in);
        List<String> elementos = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento: ");
            elementos.add(sc.next());
        }
        Collections.reverse(elementos);
        System.out.println("Lista na ordem inversa: " + elementos);
    }
}
