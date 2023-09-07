package java_interfaces.ejemplo1;

public class MainEstudiante {
    public static void main(String[] args) {
        EstudiantePregrado estudiantePregrado = new EstudiantePregrado("Juan Pérez");
        System.out.println(estudiantePregrado.getNombre()); // Imprime "Juan Pérez"

        EstudiantePostgrado estudiantePostgrado = new EstudiantePostgrado("María González");
        System.out.println(estudiantePostgrado.getNombre()); // Imprime "María González"
    }
}
