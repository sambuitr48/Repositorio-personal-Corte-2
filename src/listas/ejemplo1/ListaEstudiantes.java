package listas.ejemplo1;

import java.util.ArrayList;

class ListaEstudiantes {

    private ArrayList<Estudiante> lista;

    public ListaEstudiantes() {
        this.lista = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.lista.add(estudiante);
    }

    public void eliminarEstudiante(int posicion) {
        this.lista.remove(posicion);
    }

    public Estudiante getEstudiante(int posicion) {
        return this.lista.get(posicion);
    }

    public int getTamano() {
        return this.lista.size();
    }

    public void imprimirEstudiantes() {
        for (Estudiante estudiante : this.lista) {
            System.out.println(estudiante);
        }
    }

}