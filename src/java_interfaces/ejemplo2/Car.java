package java_interfaces.ejemplo2;
    public class Car implements ICar {
        private String brand;
        private String model;
        private int year;
        private int numDoors;
        private String color;
        private double price;

        public Car(String brand, String model, int year, int numDoors, String color, double price) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.numDoors = numDoors;
            this.color = color;
            this.price = price;
        }

        @Override
        public String getBrand() {
            return brand;
        }

        @Override
        public String getModel() {
            return model;
        }

        @Override
        public int getYear() {
            return year;
        }

        @Override
        public int getNumDoors() {
            return numDoors;
        }

        @Override
        public String getColor() {
            return color;
        }

        @Override
        public double getPrice() {
            return price;
        }
    }