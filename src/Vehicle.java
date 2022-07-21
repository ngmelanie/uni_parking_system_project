
public class Vehicle {
	
	public String typeOfVehicle;
	public boolean parkVehicle;
	protected String NumberPlate;
	
	public Vehicle (){

	}
	
	public Vehicle(String numP, String tVeh){
		NumberPlate = numP;
		typeOfVehicle = tVeh;
	}
	
	public String setNumberPlate (String numP){
		return NumberPlate;
	}
	
	public String setTypeOfVehicle (String tVeh){
		return typeOfVehicle;
	}
	
	public String getNumberPlate(){
		return NumberPlate;
	}
	
	public String getTypeOfVehicle(){
		return typeOfVehicle;
	}
	
	public boolean getParkVehicle(){
		return parkVehicle;
	}
	
	public String toString(){
		return 	"This vehicle " + getTypeOfVehicle() + " has the number plate " + getNumberPlate();
	}

	public void display(){
		System.out.println("This vehicle " + getTypeOfVehicle() + " has the number plate " + getNumberPlate());
	}
}

class Car extends Vehicle {
	public Car(){
		
	}
	public Car(String numP, String tVeh){
		super (numP, "Car");
	}
	public boolean parkVehicle(Car c) {
		
		return false;
	}
	
	public void display(){
		super.display();
		System.out.println("Car can park at general lot");
	}
}

class Motorcycle extends Vehicle {
	public Motorcycle(){
		
	}
	public Motorcycle (String numP, String tVeh){
		super (numP, "Motorcycle");
	}
	public boolean parkVehicle(Motorcycle m) {
		
		return false;
	}
	public void display(){
		super.display();
		System.out.println("Motorcycle can park at motorcycle lot.");
	}
}
	
	
class Bus extends Vehicle {
	public Bus(){
		
	}
		
	public Bus (String numP, String tVeh){
		super (numP, "Bus");
	}
	public boolean parkVehicle(Bus b) {
		
		return false;
	}
	public void display(){
		System.out.println("Not allowed to park a bus in UKM");
	}
}
	
class Lorry extends Vehicle {
	public Lorry(){
		
	}
	
	public Lorry (String numP, String tVeh){
		super (numP, "Lorry");
	}
	public boolean parkVehicle(Lorry l) {
		
		return false;
	}
	public void display(){
		System.out.println("Not allowed to park a lorry in UKM");
	}
}



