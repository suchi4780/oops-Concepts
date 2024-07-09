public class nonstaticBlock {
    {
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
        nonstaticBlock s = new nonstaticBlock();
        System.out.println("hi");
    }
     {
        System.out.println("hi world");
    }
     {
        System.out.println("welcome");
    }
}
