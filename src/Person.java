
public class Person {
	protected String name;
	protected String matric;
	protected String status;
	
	public Person(){
		
	}
	
	public Person(String n,String m, String stat){
		name = new String(n);
		status = stat;
		matric = m;
	}
	public String setName(){
		return name;
	}
	public String setStatus(){
		return status;
	}
	public String setMatric(){
		return matric;
	}
	public String getName(){
		return name;
	}
	public String getMatric(){
		return matric;
	}
	
	public String getStatus(){
		return status;
	}
	
	public String toString(){
		return 	"This person is " + name + " with status " + status;
	}

	public void display(){
		System.out.println("This person is " + getName() + " a " + getStatus() + " with matric number " +getMatric());
	}
	
	
}

//---------------------------------------------Student----------------------------------------------------------------------
class Student extends Person {
	public Student (String n, String m, String stat) {
		super (n, m, stat);
	}
	public void display(){
		System.out.println("This person is " + getName() + " a " + getStatus() + " with matric number " +getMatric());
	}
}

//---------------------------------------------Visitor---------------------------------------------------------------------------
class Visitor extends Person {
	public Visitor (String n, String stat) {
		name = n;
		status = stat;
	}
	public void display(){
		System.out.println("This person is " + getName() + " a " + getStatus() );
	}
}

//---------------------------------------------Staff----------------------------------------------------------------------------
class Staff extends Person implements Management {
	private String position;
	
	public Staff (String n,String m, String stat, String post ) {
		super (n, m, stat);
		position = post;
		position = new String(post);
	}
	public String getPosition(){
		return position;
	}
	public void display(){
		super.display();
		System.out.println("This person holds the position as the " + getPosition());
	}
}

//----------------------------------------------Staff that are part of the Management team at FTSM--------------------------------
interface Management{

	String getStatus();
	String getPosition();
	void display();
}
