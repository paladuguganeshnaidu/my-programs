package Programming.learning.packages.teachers;

public class Teacher {
    private final String name;
    private final String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getDetails() {
        return "Teacher: " + name + " | Subject: " + subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }
}
