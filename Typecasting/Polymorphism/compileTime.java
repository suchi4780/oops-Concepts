package polymorphism;


public class compileTime{

  public String Connect(String a, String b){
      return a + b;
  }

  public String Connect(String a, String b, String c){
      return a + b + c;
  }

  public String Connect(String a, String b, int c){
      return a + b + c;
  }

  public double Connect(int a, double b){
      return a + b;
  }

  public static void main(String[] args) {
  compileTime c = new compileTime();

  System.out.println("Concate Hello and World : "+ c.Connect("Hello", "World"));
  System.out.println("Concate Hello, keerthi and k j : "+ c.Connect("Hello", "Keerthi", "K J"));
  System.out.println("Concate keerthi, Age and 21 : "+ c.Connect("keerthi","Age", 22));
  System.out.println("Add 10 + 20 : "+ c.Connect(10, 20));

  }

}
