class ScannerTool {
    String target;
    void scan() {
        System.out.println("Scanning target: " + target);
    }
}
class PortScanner extends ScannerTool {
    @Override
    void scan() {
        System.out.println("Scanning ports on: " + target);
    }
}
class DirScanner extends ScannerTool {
    @Override
    void scan() {
        System.out.println("Scanning directories on: " + target);
    }
}
public class MainTool {
    public static void main(String[] args) {
        ScannerTool tool
        tool = new PortScanner();
        tool.target = "example.com";
        tool.scan();
        tool = new DirScanner();
        tool.target = "example.com";
        tool.scan();
    }
}

