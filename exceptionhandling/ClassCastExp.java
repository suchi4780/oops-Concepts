
public class ClassCastExp{
  public static void main(String[] args) 
  {
    Father f = new Son();
    try{
      
      Son s = (Son)f;
      System.out.println(f.age);
      System.out.println(s.sonAge);

    }catch(ClassCastException e){
      e.printStackTrace();
      System.out.println(e.getMessage());
  }
}
}
class Father{
  int age = 55;
}

class Son extends Father{
  int sonAge = 25;
}




