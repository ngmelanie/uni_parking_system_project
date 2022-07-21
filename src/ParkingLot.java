
public class ParkingLot {
	
	 	public String typeLot;
	    public int capacity;
	    int carsParked;
	    static int parkingLotsCount=0;
	    public boolean parkVehicle;

	    

	    public ParkingLot()
	    {
	        typeLot = " ";
	        capacity = 0;
	        carsParked = 0;
	        parkingLotsCount++;
	    }

	    public ParkingLot(String t, int cap)
	    {
	        typeLot = t;
	        capacity = cap;
	        carsParked = 0;
	        parkingLotsCount++;
	    }     

	    public void setTypeLot(String n)
	    {
	        typeLot = n;
	    }
	    public String getTypeLot()
	    {
	        return typeLot;
	    }
	    public void setCapacity(int c)
	    {
	        capacity = c;
	    }
	    public int getCapacity()
	    {
	        return capacity;
	    }
	    public int getCarsParked()
	    {
	        return carsParked;
	    }
	    public boolean parkVehicle() {
			
			return parkVehicle;
		}
	   
	    public void parkCar(int number, String status)
	    {
	    	String student = null;
	    	String managementstaff = null;
	    	String staff = null;
	    	
	        if (status==student)
	        {
	            if (carsParked < capacity )
	                carsParked += number;
	        }
	        else if (status == managementstaff) 
	        {
	        	if (carsParked < capacity )
	                carsParked += number;
	        }
	    }
	    public void removeCar(int type)
	    {
	        if (type==1) 
	            carsParked --;
	    }
	   
	    public void display()
	    {
	        System.out.println("TypeLot: "+ typeLot);
	        System.out.println("Capacity: "+capacity);
	        System.out.println("Number of carsParked: "+carsParked);
	        if ( (capacity-carsParked) >= 0)
	            System.out.println("Available Space: "+(capacity-carsParked)+" cars");
	        else
	            System.out.println("Parking Lot full!");
	        System.out.println();

	    }
	  
	
	
	

class generalLot extends ParkingLot {
	public generalLot(String t, int cap)
    {
        super (t, cap);
    }     
	public boolean parkVehicle(Car c) {
		
		return false;
	}
	public void display(){
		super.display();
	}
}

class motorcycleLot extends ParkingLot {
	int motorsCap;

	public motorcycleLot(String t, int mCap)
    {
        motorsCap = mCap;
    }     
	public boolean parkVehicle(Motorcycle m) {
		
		return false;
	}
	public void display(){
		super.display();
	}
}

class staffLot extends ParkingLot {
	int staffCap;

	public staffLot(String t, int sCap)
    {
        staffCap = sCap;
    }     
	public boolean parkVehicle(Motorcycle m) {
		
		return false;
	}
	public boolean parkVehicle(Car c) {
		
		return false;
	}
	public void display(){
		super.display();
	}
}

class managerLot extends ParkingLot {
	int managerCap;
	
	public managerLot(String t, int mgCap)
    {
        managerCap = mgCap;
    }     
	public boolean parkVehicle(Motorcycle m) {
		
		return false;
	}
	public boolean parkVehicle(Car c) {
		
		return false;
	}
	public void display(){
		super.display();
	}
}


}