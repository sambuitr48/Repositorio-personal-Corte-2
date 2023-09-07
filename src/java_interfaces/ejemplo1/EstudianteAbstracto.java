package java_interfaces.ejemplo1;

abstract class EstudianteAbstracto implements Estudiante {

    private String nombre;

    public EstudianteAbstracto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
