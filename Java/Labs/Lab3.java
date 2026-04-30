// Develop a java program showcasing method overloading with a base class phone, by a call method 
// & 2 sub classes camera phone & smart phone, that inherit from the base class & enhance its features.
// The program should demonstrate & print the results of these enhancements.

class Phone {
    public void call(String number) {
        System.out.println("Basic Phone: Calling " + number + "...");
    }
    
    public void call(String number, String contactName) {
        System.out.println("Basic Phone: Calling " + contactName + " at " + number + "...");
    }
}

class CameraPhone extends Phone {
    public void takePhoto() {
        System.out.println("Camera Phone: Taking a picture...");
    }
    
    @Override
    public void call(String number) {
        System.out.println("Camera Phone: Calling " + number + " with high quality audio...");
    }
}
class SmartPhone extends Phone {
    public void browseInternet(String url) {
        System.out.println("Smart Phone: Browsing " + url + "...");
    }
    @Override
    public void call(String number) {
        System.out.println("Smart Phone: Video calling " + number + " over 5G/LTE...");
    }
}
public class Lab3 {
    public static void main(String[] args) {
        System.out.println("--- Testing Base Class (Phone) ---");
        Phone basicPhone = new Phone();
        basicPhone.call("123-456-7890"); 
        basicPhone.call("123-456-7890", "Alice"); 
        System.out.println("\n--- Testing Camera Phone ---");
        CameraPhone cameraPhone = new CameraPhone();
        cameraPhone.call("987-654-3210"); 
        cameraPhone.call("987-654-3210", "Bob");
        cameraPhone.takePhoto();
        System.out.println("\n--- Testing Smart Phone ---");
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call("555-555-5555");
        smartPhone.call("555-555-5555", "Charlie");
        smartPhone.browseInternet("www.google.com"); 
    }
}
