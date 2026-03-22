public class Classes {
    public static void main(String[] args) {
        Employee e1 = new Employee(001, "Ganesh", 25834.25, true);
        System.out.println("Before update-------------------");
        e1.DisplayDetails();
        e1.update_status(false);
        System.out.println("After update--------------------");
        e1.DisplayDetails();
    }
}

class Employee {
    private int emp_id;
    private String emp_name;
    private double emp_salary;
    private boolean emp_Status;

    public Employee(int emp_id, String emp_name, double emp_salary, boolean emp_Status) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.emp_Status = emp_Status;
    }

    void DisplayDetails() {
        System.out.println("Employee ID:" + emp_id);
        System.out.println("Employee Name:" + emp_name);
        System.out.println("Employee Salary:" + emp_salary);
        System.out.println("Employee Status:" + emp_Status);
    }

    void Getname() {
        System.out.println("Employee name : " + emp_name);
    }

    void Getid() {
        System.out.println("Employee id : " + emp_id);
    }

    void Getsalary() {
        System.out.println("Employee salary : " + emp_salary);
    }

    void Getstatus() {
        System.out.println("Employee status : " + emp_Status);
    }

    void update_salary(double newsal) {
        this.emp_salary = newsal;
    }

    void update_status(boolean newstatus) {
        this.emp_Status = newstatus;
    }
    void speak(){
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("kevin16");
        
        voice.allocate();
        voice.speak("Hello Ganesh, Java is speaking now!");
        voice.deallocate();
    }

}

class Voice {
    void allocate() {
        // Placeholder for voice resource allocation
    }

    void deallocate() {
        // Placeholder for voice resource cleanup
    }

    void speak(String text) {
        System.out.println(text);
    }
}

class VoiceManager {
    private static final VoiceManager INSTANCE = new VoiceManager();

    static VoiceManager getInstance() {
        return INSTANCE;
    }

    Voice getVoice(String name) {
        return new Voice();
    }
}