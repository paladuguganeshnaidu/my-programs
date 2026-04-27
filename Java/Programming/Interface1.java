class Person{
    String name;
    String Dept;
    char Sec;
    Double cgpa;
    Person(String name,String Dept,char Sec,Double cgpa){
        this.name=name;
        this.Dept=Dept;
        this.Sec=Sec;
        this.cgpa=cgpa;
    }
    
}
public class Interface1 {
    Person p1=new Person("Alice", "Computer Science", 'A', 3.8);
    Person p2=new Person("Bob", "Mathematics", 'B', 3.6);
    Person p3=new Person("Charlie", "Physics", 'A', 3.9);
    Person p4=new Person("David", "Chemistry", 'B', 3.7);
    
}
