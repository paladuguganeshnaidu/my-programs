class Vechicle{
	int wheels;
	String Type;
	void type_intial(String i){this.Type=i;}
	void display(){wheels=4;Type="Goods";System.out.println("Wheels: "+wheels+"\nType: "+Type);}
}



class Car extends Vechicle{
	Car(int n,String s){this.wheels=n;this.Type=s;}
	Car(int n){this.wheels=n;this.Type="Default - Goods ";}
void display()
{System.out.println("\n\ndisplay funtion overloaded.");System.out.println("This a Car:");System.out.println("Wheels: "+wheels+"\nType: "+Type);}}



class Bus extends Vechicle{void display(){System.out.println("This is Bus Class");System.out.println("Wheels: "+wheels+"\nType: "+Type );}}



public class Inheri_Overlaod_Override{
	public static void main(String[] args){Vechicle vechi=new Vechicle();vechi.display();Vechicle car1=new Car(6,"Passenger");car1.display();Car car2=new Car(16);car2.display();}
}

