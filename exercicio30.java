package Ex_Aritmeticas.aritimeticos;

import java.util.Arrays;

public class exercicio30 {

        public static void main(String[] args) {
            int[] listaNegativos = {10, -5, 3, -2, 8, -1};
            for (int i = 0; i < listaNegativos.length; i++) {
                if (listaNegativos[i] < 0) {
                    listaNegativos[i] = 0;
                }
            }
            System.out.println("Lista sem negativos: " + Arrays.toString(listaNegativos));
        }
    }