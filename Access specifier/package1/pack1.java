// same class

package package1;
class class1{
    public String publicVar="PUBLIC";
    private String privateVar="PRIVATE";
    protected String protectedVar="PROTECTED";
    String defaultVar="DEFAULT";

    public void method(){
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        
    }
}

public class pack1{
    public static void main(String[] args) {
        class1 c1=new class1();
        c1.method();
}

}