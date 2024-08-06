import java.util.Scanner;

public class ArithematicExp{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the two  number");

    int num1=sc.nextInt();
    int num2=sc.nextInt();
      
    try{
      int result=num1/num2;
      System.out.println(result);
    }
    catch(ArithmeticException e){
      System.out.println("Number can not be divided by zero");
      e.printStackTrace();
      System.out.println(e.getMessage());
    }
  }
}