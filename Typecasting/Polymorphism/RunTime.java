package polymorphism;
class Employee {
  void work(){
      System.out.println("Working");
  }
}

class Developer extends Employee {
  @Override
public void work(){
      System.out.println("Develop App");
  }
}

class Tester extends Employee{
  @Override
  public void work(){
      System.out.println("Testing App");
  }
}

public class RunTime{
  public static void main(String[] args) {
      Employee e = new Developer();
     e.work();

     Employee e1 = new Tester();
         e1.work();

  }
}
