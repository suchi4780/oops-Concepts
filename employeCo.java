public class employeCo {
    employeCo(String name) {
        System.out.println(name);
    }
    employeCo(double salary) {
        System.out.println(salary);
    }
    employeCo(String name, double salary) {
        System.out.println(name);
        System.out.println(salary);
    }
    employeCo(double salary, String name) {
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        employeCo e1 = new employeCo("Suchi");
        new employeCo(100000);
        new employeCo("Suchi", 100000);
        new employeCo(100000, "Suchi");  
    }
}
