public class Main{
    public static void main(String[] args) {
        Student s1 = new Student("John", 12345, 5.5);
        s1.displayInfo();
        s1.updateGPA(11.0);
        System.out.println("Updated GPA: " + s1.getGPA());

    }
}

class Student {
    private String name;
    private int studentId;
    private double gpa;
    private String college;

    public Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + studentId + ", GPA: " + gpa);
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 10.0) {
            this.gpa = newGPA;
            System.out.println(name + "'s GPA updated to: " + newGPA);
        } else if (newGPA > 10.0) {
            System.out.println("Invalid GPA!");
        }
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGPA() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setName(String name,String college) {
        this.name = name;
        this.college = college;
    }
}