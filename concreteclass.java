class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class concreteclass {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Corolla", 2022);
        Car myCar2 = new Car("Honda", "Civic", 2023);

        myCar1.displayDetails();
        myCar2.displayDetails();

        myCar1.setYear(2024);
        System.out.println("Updated year of myCar1: " + myCar1.getYear());

        myCar2.setYear(2025);
        System.out.println("Updated year of myCar2: " + myCar2.getYear());
    }
}