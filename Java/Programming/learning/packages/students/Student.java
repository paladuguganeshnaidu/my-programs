public class Student {
    private final String name;
    private final int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getDetails() {
        return "Student: " + name + " | Roll No: " + rollNo;
    }

    public void study() {
        System.out.println(name + " is studying data structures.");
    }
}
