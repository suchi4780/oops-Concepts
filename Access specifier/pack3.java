import package1.pack2;
class class3 extends pack2{
    public void method3(){
        System.out.println(publicVar);
       // System.out.println(privateVar);
        System.out.println(protectedVar);
       // System.out.println(defaultVar);

    }
 }
public class pack3 {
    public static void main(String[] args) {
    class3 c3 = new class3();
    c3.method3();
    }
}