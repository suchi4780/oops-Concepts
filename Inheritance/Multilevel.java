class multilevels{  
    void read(){System.out.println("reading...");}  
    }  
    class student extends multilevels{  
    void code(){System.out.println("coding...");}  
    }  
    class employee extends student{  
    void test(){System.out.println("testing...");}  
    }  
    class Multilevel{  
    public static void main(String args[]){ 
     
    employee d=new employee();  
    d.read();  
    d.code();  
    d.test();  
    }}  