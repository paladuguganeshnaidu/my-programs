class Scanner{
    Scanner(String ip){
        System.out.println("Scanner constructor called with input: " + ip);
    }
    void scan(){
        System.out.println("Scanning...");
    }
}
class Service extends Scanner{
    Service(String ip){
        super(ip);
        String Command="nmap -sP " + ip;
        System.out.println("Service constructor called with command: " + Command);
    }
}
class NetworkScanner extends Service{
    NetworkScanner(String ip){
        super(ip);
        System.out.println("NetworkScanner constructor called");
    }
}
public class Super {
    public static void main(String[] args) {
        NetworkScanner networkScanner = new NetworkScanner("192.168.1.1");
    }
    
}
