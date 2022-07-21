

import java.util.Scanner;
import java.io.*;


public class ReadFile {
	public ReadFile(){
		File file = new File ("FTSMList.txt");
		file.getAbsoluteFile();
		//new ParkingLotGUI();
	try {
  	  	//File file = new File ("FTSMList.txt");
		Scanner input = new Scanner(file);
		String name = input.nextLine();
		String status = input.nextLine();
		String matric = input.nextLine();
		String numP = input.nextLine();
		String vehicleType = input.nextLine();
		//String vehicleStatus = input.nextLine();
		
		System.out.printf("Name : %n" + "Status : %n" + "Matric : %n" +
							"Number Plate : %n" + "Vehicle Type : %n" + "Vehicle Status : %n"
							, name, status, matric, numP, vehicleType);
		
	  } 
       catch (FileNotFoundException E) {
    	   System.out.printf("ERROR: %s\n", E);
       }
	}
}
