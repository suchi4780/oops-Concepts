class specialization{
  public static void main(String[] args) {
      Animal a = new Dog(); //Upcasting
          
          Animal a1 = new Birds(); 
              a1.play();
              a.play();

      
  }
}

class Animal{
  void play(){
      System.out.println("Animals will Play");
  }
}

class Dog extends Animal{
  void play(){
      System.out.println("Dog will bark");
  }
}

class Birds extends Animal{
  void play(){
      System.out.println("Birds will fly");
  }
}

