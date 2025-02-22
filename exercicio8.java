package Revisao;
import java.util.*;
public class exercicio8 {
    public static void exercicio8() {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º nome: ");
            nomes.add(sc.next());
        }
        Collections.sort(nomes);
        System.out.println("Nomes em ordem alfabética: " + nomes);
    }
}
