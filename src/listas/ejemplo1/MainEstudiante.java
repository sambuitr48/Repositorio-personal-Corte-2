package listas.ejemplo1;

public class MainEstudiante {
    public static void main(String[] args) {
        ListaEstudiantes lista = new ListaEstudiantes();

        lista.agregarEstudiante(new Estudiante("Juan", 18));
        lista.agregarEstudiante(new Estudiante("María", 20));
        lista.agregarEstudiante(new Estudiante("Pedro", 22));

        System.out.println("Lista de estudiantes:");
        lista.imprimirEstudiantes();

        System.out.println("Eliminando al estudiante en la posición 1");
        lista.eliminarEstudiante(1);

        System.out.println("Lista de estudiantes actualizada:");
        lista.imprimirEstudiantes();

        System.out.println("El estudiante en la posición 0 es:");
        System.out.println(lista.getEstudiante(0));
    }
}
