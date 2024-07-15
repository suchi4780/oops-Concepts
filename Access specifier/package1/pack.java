// same package outside of the class
package package1;
class class1{
    public String publicVar="PUBLIC";
    private String privateVar="PRIVATE";
    protected String protectedVar="PROTECTED";
    String defaultVar="DEFAULT";

}    

public class pack{
    public static void main(String[] args) {
        class1 c1=new class1();

        System.out.println(c1.publicVar);
      // System.out.println(c1.privateVar);
        System.out.println(c1.protectedVar);
        System.out.println(c1.defaultVar);
        
}

}