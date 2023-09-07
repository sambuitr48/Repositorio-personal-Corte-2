package java_interfaces.ejemplo2;

public class MainCar {
    public static void main(String[] args) {
        ICar car1 = new Car("Toyota", "Corolla", 2023, 4, "Blanco", 200000);
        ICar car2 = new Car("Honda", "Civic", 2022, 5, "Negro", 250000);

        System.out.println("Información del carro 1:");
        System.out.println("Marca: " + car1.getBrand());
        System.out.println("Modelo: " + car1.getModel());
        System.out.println("Año: " + car1.getYear());
        System.out.println("Número de puertas: " + car1.getNumDoors());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Precio: " + car1.getPrice());

        System.out.println("\nInformación del carro 2:");
        System.out.println("Marca: " + car2.getBrand());
        System.out.println("Modelo: " + car2.getModel());
        System.out.println("Año: " + car2.getYear());
        System.out.println("Número de puertas: " + car2.getNumDoors());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Precio: " + car2.getPrice());
    }
    }

