package Revisao;
import java.util.*;
public class exercicio10 {
    public static void exercicio10() {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista1 = new ArrayList<>(), lista2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Lista 1 - Digite o " + (i+1) + "º número: ");
            lista1.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Lista 2 - Digite o " + (i+1) + "º número: ");
            lista2.add(sc.nextInt());
        }
        lista1.addAll(lista2);
        System.out.println("Lista combinada: " + lista1);
    }
}
