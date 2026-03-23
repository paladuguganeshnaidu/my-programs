class Student{
    String Name;
    private int age;
    private int marks1,marks2,marks3;
    int average;
    Student(String Name,int age,int marks1,int marks2,int marks3){
        this.Name=Name;
        this.age=age;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    Student(String Name,int age){
        this.Name=Name;
        this.age=age;
    }

    void display(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+age);
        System.out.println("Average Marks: "+average);
    }
}
public class A {
    public static void main(String[] args) {
        Student s1=new Student("Ganesh Naidu", 20, 85, 90, 95);
        s1.display();
        Student s2=new Student("Ganesh",20);
        s2.display();
    }
}