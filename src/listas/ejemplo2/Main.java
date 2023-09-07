package listas.ejemplo2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Crea una lista de nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Agrega nombres a la lista
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Luis");

        // Imprime la lista de nombres
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}