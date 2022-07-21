import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.*;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.filechooser.*;
import javax.swing.table.DefaultTableModel;

public class ParkingLotGUI extends JFrame implements ActionListener {  	  		
	JFrame frame;
	JTable table;
	
	public ParkingLotGUI() {
		
//-----------------------create frame and its attributes----------------------------------------
		frame = new JFrame("UKM FTSM Car Park");
		frame.setSize(800,300);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//-----------------------create table with columns-----------------------------------------------
		table = new JTable();
		Object[] columns = {"Name","Status","Matric","Number Plate","Vehicle","Parked or Unparked"};
        DefaultTableModel list = new DefaultTableModel();
        list.setColumnIdentifiers(columns);
        table.setModel(list);
        table.setRowHeight(40);
        
//-----------------------create labels and spaces for user input----------------------------------
        JLabel L1 = new JLabel ("Name :");
	    JLabel L2 = new JLabel ("Matric :");
	    JLabel L3 = new JLabel ("Status :");
	    JLabel L4 = new JLabel ("Number Plate :");
	    JLabel L5 = new JLabel ("Type of Vehicle :");
	    JLabel L6 = new JLabel ("Park or Unpark? :");
	    
	    JTextField t1 = new JTextField(10);
	    JTextField t2 = new JTextField (10);   
	    JTextField t4 = new JTextField (10);
	    
	    //buttons for action (park, unpark(remove car), edit details)
		JButton b2 = new JButton ("ENTER");
		JButton b3 = new JButton ("EDIT");
		JButton b4 = new JButton ("REMOVE");
		JButton b5 = new JButton ("CLEAR");
		
		//checkboxes for status and type of vehicle
		JCheckBox cStatus1 = new JCheckBox ("Student");
		JCheckBox cStatus2 = new JCheckBox ("Staff");
		JCheckBox cStatus3 = new JCheckBox ("Management Staff");
		JCheckBox cStatus4 = new JCheckBox ("Visitor");
		
		JCheckBox cVehicle1 = new JCheckBox ("Car");
	    JCheckBox cVehicle2 = new JCheckBox ("Motorcycle");
	    JCheckBox cVehicle3 = new JCheckBox ("Lorry");
	    JCheckBox cVehicle4 = new JCheckBox ("Bus");
		
	    JCheckBox cPark = new JCheckBox ("Park");
	    JCheckBox cUnpark = new JCheckBox ("Unpark");
        
	   
//------------------------Set location and size for labels, textfields, and checkboxes------------
	    L1.setBounds(140, 20, 100, 25);
	    L2.setBounds(140, 50, 100, 25);
	    L3.setBounds(140, 80,  50, 25);
	    L4.setBounds(140, 110, 85, 25);
	    L5.setBounds(140, 140, 95, 25);
	    L6.setBounds(140, 170, 100, 25);
	    
	    t1.setBounds(260, 20, 180, 25);
	    t2.setBounds(260, 50, 180, 25);
	    t4.setBounds(260, 110, 180, 25);

	    cStatus1.setBounds(250, 80, 80, 25);
	    cStatus2.setBounds(330, 80, 80, 25);
	    cStatus3.setBounds(410, 80, 140, 25);
	    cStatus4.setBounds(550, 80, 80, 25);
	    
	    cVehicle1.setBounds(250, 140, 80, 25);  
	    cVehicle2.setBounds(330, 140, 90, 25); 
	    cVehicle3.setBounds(420, 140, 80, 25);
	    cVehicle4.setBounds(510, 140, 80, 25);
	    
	    cPark.setBounds( 270, 170, 80, 25);
	    cUnpark.setBounds( 350, 170, 80, 25);
	    
	    b2.setBounds(200, 200, 90, 25);  
	    b3.setBounds(300, 200, 90, 25); 
	    b4.setBounds(400, 200, 90, 25);
	    b5.setBounds(500, 200, 90, 25);
	  
//--------------------------------create JScrollPane-------------------------------------------
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(20, 250, 750, 200);
        frame.setLayout(null);
        frame.add(pane);
        
 //----------------add in labels, textfields,buttons and checkboxes---------------------
        frame.add(L1);			frame.add(cStatus1);			
        frame.add(L2);			frame.add(cStatus2);			frame.add(b2);
        frame.add(L3);			frame.add(cStatus3);			frame.add(b3);
        frame.add(L4);			frame.add(cStatus4);			frame.add(b4);
        frame.add(L5);											frame.add(b5);
        frame.add(L6);			frame.add(cVehicle1);
        frame.add(t1);			frame.add(cVehicle2);			frame.add(cPark);
        frame.add(t2);			frame.add(cVehicle3);			frame.add(cUnpark);
        frame.add(t4);			frame.add(cVehicle4);
         
//-----------------------------------------------park a car------------------------------------------------------        
         cVehicle1.addActionListener(e->{
         	if (e.getSource()==cVehicle1 && cStatus1.isSelected()) {
         		JOptionPane.showMessageDialog(null,"You can only park car at General Lot");
         	}
         	else if(e.getSource()==cVehicle1 && cStatus2.isSelected()) {
      		    JOptionPane.showMessageDialog(null,"You can park car at Staff Lot");
      	    }
         	else if (e.getSource()==cVehicle1 && cStatus3.isSelected()) {
         		JOptionPane.showMessageDialog(null,"You can park car at reserved Management Lot");
         	}
         	else if (e.getSource()==cVehicle1 && cStatus4.isSelected()) {
         		JOptionPane.showMessageDialog(null, "You can only park car at General Lot");
         	}

          });
//-----------------------------------------------park a motorcycle-----------------------------------------------
         cVehicle2.addActionListener(e->{
      	  if(e.getSource()==cVehicle2 && cStatus1.isSelected()) {
      		   JOptionPane.showMessageDialog(null,  "You can only park motor at Motorcycle Lot");
      	  }
      	  else if(e.getSource()==cVehicle2 && cStatus2.isSelected()) {
      		   JOptionPane.showMessageDialog(null,"You can park motor at Motorcycle Lot");
   		   }
      	  else if(e.getSource()==cVehicle2 && cStatus3.isSelected()) {
     		   JOptionPane.showMessageDialog(null,"You can park motor at the Motorcycle Lot or reserved Management Lot");
      	   }
      	  else if (e.getSource()==cVehicle2 && cStatus4.isSelected()) {
      		  JOptionPane.showMessageDialog(null, "You can only park motor at Motorcycle Lot");
      	   }
      	
      	 });
//-----------------------------------------------park a lorry-----------------------------------------------------        
         cVehicle3.addActionListener(e->{   
         if(e.getSource()==cVehicle3) {
      		   JOptionPane.showMessageDialog(null,"Not allowed to park a lorry in UKM")	;
      		   }});
//-----------------------------------------------park a bus---------------------------------------------------------
         cVehicle4.addActionListener(e->{
      	   if(e.getSource()==cVehicle4) {
      		   JOptionPane.showMessageDialog(null,"Not allowed to park a bus in UKM")	;
      		   }
         });     
        
//-------------------transfer data from user inputs to list------------------------------------------------
          Object[] row = new Object[6];
          b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             
                row[0] = t1.getText();
                row[2] = t2.getText();
                row[3] = t4.getText();
           
                
              if (cStatus1.isSelected()) {
            	  row[1]=cStatus1.getText();
              }
              else if (cStatus2.isSelected()){
            	  row[1]=cStatus2.getText();
              }
              else if (cStatus3.isSelected()){
            	  row[1] = cStatus3.getText();
              }
              else if (cStatus4.isSelected()) {
            	  row[1] = cStatus4.getText();
              }
              else {
            	  JOptionPane.showMessageDialog(null,"Please select your Status (Only one)");
            	  row[1] = "N/A";
              }  
              //vehicle
              		if (cVehicle1.isSelected()) {
              			row[4]=cVehicle1.getText();
              		}
              		else if (cVehicle2.isSelected()){
              			row[4]=cVehicle2.getText();
              		}
              		else if (cVehicle3.isSelected()){
              			row[4] = cVehicle3.getText();
              		}
              		else if (cVehicle4.isSelected()) {
              			row[4] = cVehicle4.getText();
              		}
              		else {
              			JOptionPane.showMessageDialog(null,"Please select a vehicle (Only one)");
              			row[4] = "N/A";
              		}  
              				//Park or unpark vehicle
              				if (cPark.isSelected()) {
              					row[5] = cPark.getText();
              				}
              				else if (cUnpark.isSelected()) {
              					row[5] = cUnpark.getText();
              				}
              				else {
              					row[5] = "Registered";
              				}
        
                list.addRow(row);
           
            }
        });
        

//-----------------------------clears textfields and unchecks boxes---------------------------------------------------------------          
          b5.addActionListener(new ActionListener(){
        	    public void actionPerformed(ActionEvent e){
        	        t1.setText("");
        	        t2.setText("");
        	        t4.setText("");
        	        cStatus1.setSelected(false);
        	        cStatus2.setSelected(false);
        	        cStatus3.setSelected(false);
        	        cStatus4.setSelected(false);
        	        cVehicle1.setSelected(false);
        	        cVehicle2.setSelected(false);
        	        cVehicle3.setSelected(false);
        	        cVehicle4.setSelected(false);
        	        cPark.setSelected(false);
        	        cUnpark.setSelected(false);
        	    }
        	});
//----------------------remove data from list---------------------------------------------------------------
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            
                int x = table.getSelectedRow();
                if(x >= 0){
                    list.removeRow(x);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        
        
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            
            int x = table.getSelectedRow();
            
            t1.setText(list.getValueAt(x, 0).toString());
            t2.setText(list.getValueAt(x, 2).toString());
            t4.setText(list.getValueAt(x, 3).toString());
            
            
        }
        });
        
//-------------------------------------edit details--------------------------------------------------
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             
                int x = table.getSelectedRow();
                
                if(x >= 0) 
                {
                   list.setValueAt(t1.getText(), x, 0);
                   list.setValueAt(t2.getText(), x, 2);
                   list.setValueAt(t4.getText(), x, 3);
                   if (cStatus1.isSelected()) {
                 	  row[1]=cStatus1.getText();
                 	  list.setValueAt(cStatus1.getText(), x, 1);
                   }
                   else if (cStatus2.isSelected()){
                 	  row[1]=cStatus2.getText();
                 	  list.setValueAt(cStatus2.getText(), x, 1);
                   }
                   else if (cStatus3.isSelected()){
                 	  row[1] = cStatus3.getText();
                 	  list.setValueAt(cStatus3.getText(), x, 1);
                   }
                   else if (cStatus4.isSelected()) {
                 	  row[1] = cStatus4.getText();
                 	  list.setValueAt(cStatus4.getText(), x, 1);
                   }
                   else 
                	   list.setValueAt("N/A", x, 1);
                   
                   		//vehicle type
                   		if (cVehicle1.isSelected()) {
                   			row[4]=cVehicle1.getText();
                   			list.setValueAt(cVehicle1.getText(), x, 4);
                   		}
                   		else if (cVehicle2.isSelected()){
                   			row[4]=cVehicle2.getText();
                   			list.setValueAt(cVehicle2.getText(), x, 4);
                   		}
                   		else if (cVehicle3.isSelected()){
                   			row[4] = cVehicle3.getText();
                   			list.setValueAt(cVehicle3.getText(), x, 4);
                   		}
                   		else if (cVehicle4.isSelected()) {
                   			row[4] = cVehicle4.getText();
                   			list.setValueAt(cVehicle4.getText(), x, 4);
                   		}
                   		else 
                   			list.setValueAt("N/A", x, 4);
                   
                   				//Park or unpark
                   				if (cPark.isSelected()) {
                   					row[5]=cPark.getText();
                   					list.setValueAt(cPark.getText(), x, 5);
                   				}
                   				else if (cUnpark.isSelected()){
                   					row[5]=cUnpark.getText();
                   					list.setValueAt(cUnpark.getText(), x, 5);
                   				}
                   				else
                   					list.setValueAt("Registered", x, 5);
                	}
                 else{
                    System.out.println("The information is updated");
                }
            }
        });
        

       frame.setVisible(true);
  
        
//----------------------------------------Write to File---------------------------------------------------------------------------
       File file = new File ("FTSMList.txt");
       b2.addActionListener(new ActionListener(){
     	 
     	 //if(e.getSource()==b2) {
    	   public void actionPerformed(ActionEvent e){ 		 
    		   File file = new File ("FTSMList.txt");
     		try {
     		String name = t1.getText();
     	    String natric = t2.getText();
     	    String status;
     	    String numP = t4.getText();
     	    String tVeh;
     	    String vehicleStatus;
     	    
     	    	FileWriter fileWriter = new FileWriter (file);
     	    
     	   if (cStatus1.isSelected()) {
         	  status = cStatus1.getText();
           }
           else if (cStatus2.isSelected()){
         	  status = cStatus2.getText();
           }
           else if (cStatus3.isSelected()){
         	  status = cStatus3.getText();
           }
           else if (cStatus4.isSelected()) {
         	  status = cStatus4.getText();
           }
           else {
         	  status = "N/A";
           }  
     	   		//vehicle
           		if (cVehicle1.isSelected()) {
           			tVeh = cVehicle1.getText();
           		}
           		else if (cVehicle2.isSelected()){
           			tVeh = cVehicle2.getText();
           		}
           		else if (cVehicle3.isSelected()){
           			tVeh = cVehicle3.getText();
           		}
           		else if (cVehicle4.isSelected()) {
           			tVeh = cVehicle4.getText();
           		}
           		else {
           			tVeh = "N/A";
           		}  
           				//Park or unpark vehicle
           				if (cPark.isSelected()) {
           					vehicleStatus = cPark.getText();
           				}
           				else if (cUnpark.isSelected()) {
           					vehicleStatus = cUnpark.getText();
           					
           				}
           				else {
           					vehicleStatus = "Registered";
           					
           				}
           		//file.println();
     
     	   //FileWriter fileWriter = new FileWriter (file);
     	   
     	
     	   fileWriter.close();
     }
     	   catch (IOException E){
     		   System.out.println("Somethings wrong");
     	   }
     	 }
     	 
       });
       
//-----------------------------------------Read from File-----------------------------------------------------      
       b2.addActionListener(new ActionListener(){
    
      public void actionPerformed(ActionEvent e) throws NullPointerException{ 	
       String line = null;
       try {
    	Scanner sc = new Scanner(file);
    	FileReader fileReader = new FileReader (file);
    	
    	BufferedReader bufferedReader = new BufferedReader (fileReader);
    	
    	
    	while ((line = bufferedReader.readLine()) != null) {
		String name = sc.nextLine();
		String status = sc.nextLine();
		String matric = sc.nextLine();
		String numP = sc.nextLine();
		String tVeh = sc.nextLine();
	
		
		System.out.printf("Name : %n" + "Status : %n" + "Matric : %n" +
							"Number Plate : %n" + "Vehicle Type : %n" + "Vehicle Status : %n"
							, name, status, matric, numP, tVeh );
    	}
    	bufferedReader.close();
	  } 
       catch (FileNotFoundException E) {
    	   System.out.printf("Unable to open file FTSMList.txt");
    	   
       }
      // catch (IOException E) {
    	//   System.out.println("Error reading file " + file);
      // }
 catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

     
}
	
     });
	 };
}