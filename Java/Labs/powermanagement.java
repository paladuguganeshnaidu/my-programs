//Create a java program that model electronic devices (smartphones,laptops & tablets) using a common interface for power management,the program should allow user to interact with devices & control their power states
//Lab-6
public interface powermanagement {
    public void powerOn();
    public void powerOff();
    public boolean isPowerOn();
    public void recharge();
    
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        Laptop laptop = new Laptop();
        Tablet tablet = new Tablet();
        phone.powerOn();
        System.out.println("Smartphone power state: " + phone.isPowerOn());
        phone.recharge();
        phone.makecalls();
        phone.sendmessages();
        phone.powerOff();
        laptop.powerOn();
        laptop.powerOff();
        tablet.powerOn();
        tablet.recharge();
    }
}
class Smartphone implements powermanagement{
    boolean flag=false;
    @Override
    public void powerOn() {
        System.out.println("Smartphone has been turned on");
        flag=true;
    }
    @Override
    public void powerOff() {
        System.out.println("Smartphone has been turned off");
        flag=false;
    }
    @Override
    public boolean isPowerOn() {
        return flag;
    }
    @Override
    public void recharge() {
        System.out.println("Smartphone is being recharged");
    }
    public void makecalls(){
        if (isPowerOn()) {
            System.out.println("Smartphone is making calls");
        }else{
            System.out.println("Smartphone is not powered on");
        }
    }
    public void sendmessages(){
        if (isPowerOn()) {
            System.out.println("Smartphone is sending messages");
        }else{
            System.out.println("Smartphone is not powered on");
        }
    }
}

class Laptop implements powermanagement{
    boolean flag=false;
    @Override
    public void powerOn() {
        System.out.println("Laptop has been turned on");
        flag=true;
    }
    @Override
    public void powerOff() {
        System.out.println("Laptop has been turned off");
        flag = false;
    }
    @Override
    public boolean isPowerOn() {
        return flag;
    }
    @Override
    public void recharge() {
        System.out.println("Laptop is being recharged");
    }
    public void AccessInternet(){
        if (isPowerOn()) {
            System.out.println("Laptop is accessing the internet");
        }else{
            System.out.println("Laptop is not powered on");
        }
    }
}
class Tablet implements powermanagement{
    boolean flag=false;
    @Override
    public void powerOn() {
        System.out.println("Tablet has been turned on");
        flag=true;
    }
    @Override
    public void powerOff() {
        System.out.println("Tablet has been turned off");
        flag = false;
    }
    @Override
    public boolean isPowerOn() {
        return flag;
    }
    @Override
    public void recharge() {
        System.out.println("Tablet is being recharged");
    }
}
