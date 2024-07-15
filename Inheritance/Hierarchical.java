
class hierarchicalcls{  
    void read(){System.out.println("reading...");}  
    }  
    class student extends hierarchicalcls{  
    void code(){System.out.println("coding...");}  
    }  
    class employee extends hierarchicalcls{  
    void test(){System.out.println("testing...");}  
    }  
    class Hierarchical{  
    public static void main(String args[]){
     
    student s=new student();  
    employee e=new employee();
    
    s.read();  
    s.code();  
    e.test();

    }
}  
    