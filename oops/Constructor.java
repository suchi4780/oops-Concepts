public class Constructor {
    String brand;
    double cost;
    Constructor(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }
    public static void main(String[] args) {
        Constructor c = new Constructor("pulsar", 120000);
        System.out.println("brand : "+ c.brand + "cost : "+ c.cost);
        Constructor c1 = new Constructor("honda", 100000);
        System.out.println("brand : "+ c1.brand + "cost : "+ c1.cost);
    }
}
