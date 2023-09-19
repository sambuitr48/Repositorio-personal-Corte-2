package claseEnum;

public enum Direccion {
    NORTE, SUR, ESTE, OESTE
}
class Main{
    public static void main(String[] args) {
        Direccion miDireccion = Direccion.NORTE;
        System.out.println(miDireccion);
    }
}
