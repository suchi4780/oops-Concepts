class single{
    int id=14;
}
class Student extends single{
    int age=22;
    public static void main(String[] args) {
        Student s1 = new Student();
        
        System.out.println("Student id is:"+s1.id);
        System.out.println("Student age is:"+s1.age);
        
    }
}