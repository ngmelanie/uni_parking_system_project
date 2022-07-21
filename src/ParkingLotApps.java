import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.text.*;


public class ParkingLotApps {

	public static void main(String[] args){
	
		new ParkingLotGUI();
		new ReadFile();

		//create array for person
		//ArrayList<Person> personList = new ArrayList<Person>();
		
		
		
		// creating instance
		ParkingLot parkingLot = new ParkingLot();
		
		// declare variable
		String user = "";
		
		// scanner input
		Scanner sc = new Scanner (System.in);
		
		
		// ask user to type in the vehicle that he wants to park
		System.out.print("Please enter bus, car,lorry or motorcycle a vehicle (enter 0 to exit): ");
		user = sc.next();
		
		// continue asking user for input until user enters zero
		while(!user.equals("0")){
			if (user.equals("Bus") || user.equals("bus")) {

				Bus b = new Bus();
				
				if(parkingLot.parkVehicle()){
					// vehicle parked
					// success message
					System.out.println("\nNot allowed to park bus in UKM");
					
					// ask user to enter other input
					System.out.print("Please enter bus, car, lorry, or motorcycle to park a vehicle (enter 0 to exit): ");
					user = sc.next();
				} 
					
			} else if(user.equals("Car") || user.equals("car")){
				// creating instance
				Car c = new Car();
				
				if(parkingLot.parkVehicle()){
					// vehicle parked
					System.out.println("\nThe car is parked.");
					
					// ask user to enter other input
					System.out.print("Please enter bus, car, lorry, or motorcycle to park a vehicle (enter 0 to exit): ");
					user = sc.next();
				} 
					
			} else if(user.equals("Motorcycle") || user.equals("motorcycle")){
				// creating instance
				Motorcycle m = new Motorcycle();
				
				if(parkingLot.parkVehicle()){
					// vehicle parked
					System.out.println("\nThe motorcycle has been parked successfully.");
					
					// ask user to enter other input
					System.out.print("Please enter bus, car, lorry, or motorcycle to park a vehicle (enter 0 to exit): ");
					user = sc.next();
					
				}
			} else {
				// failure message
				System.out.println("\nInvalid input.");
				
				// ask user to re-enter input
				System.out.print("\nPlease enter bus, car, or motorcycle to park a vehicle (enter 0 to exit): ");
				user = sc.next();
			}
			
			// terminating program
			if(user.equals("0")){
				System.out.print("\nProgram terminated");
				break;
			}
		} 		
	} 


	
}