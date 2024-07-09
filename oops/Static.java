
public class Static {

    static {
        int a=10;
     System.out.println(a);
    }
    static int b;
    static{
        b= 15;
    }
    public static void sum(){
        System.out.println(b);
    }
    public static void main(String[] args) {
        sum();
    }
}
