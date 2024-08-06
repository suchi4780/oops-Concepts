package nonPrimitive;

class upcasting{
  public static void main(String[] args) {
      Father f = new Son();

  Son s = (Son)f;
     f = new Daughter();

      System.out.println(f.age);
      System.out.println(s.sonAge);
  }
}

class Father{
  int age = 55;
}

class Son extends Father{
  int sonAge = 25;
}

class Daughter extends Father{
  int dAge = 21;
}


