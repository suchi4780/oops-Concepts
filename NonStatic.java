public class NonStatic {
    
    int num;
    String name;

    {
        num = 10;
        name = "Hi I'm Suchith";
    }

    public void display() {
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }

    public static void main(String[] args) {
        NonStatic obj = new NonStatic();
        obj.display();
    }
}