/** 
 *  Handles file data. 
*/ 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileHandler {

	private String fileName;
	private Scanner scnr;
	/** 
	   *writes data to workorders csv file. 
	* 
	* @return void. 
	*/ 
	public void writeData() {
		try
		{
			PrintWriter pr = new PrintWriter(new FileWriter(Main.workOrderFileName));
			pr.println("employee_id,employee_first_name,employee_last_name,clocked_in,customer_first_name,customer_last_name,customer_id,ticket_createdAt,ticket_id,workorder_createdAt");
			for(int i = 0; i < Main.workOrderList.size(); i++)
			{
				pr.println(Main.workOrderList.get(i).getFileData());
			}
			pr.close(); 
		} 
		catch (IOException e)
		{
			System.out.println("Unknown IO Exception"); 
		}
		
		
	}
	/** 
	   *reads in employee file data. 
	* 
	* @return void. 
	*/ 
	public void readEmployeeData(String employeeFileName) {
		try
		{
			Scanner fr = new Scanner(new FileReader(employeeFileName));
			
			while(fr.hasNextLine())
			{   
				
				String line = fr.nextLine(); 
				if(line.startsWith("employee_id"))
				{
					continue; 
				}
				String[] values = line.split(",|\n");
				
				Employee employee = new Employee(values[1],values[2],values[4],values[5],values[3],values[0],values[6], values[7]);
				Main.employeeList.add(employee); 
			}
			
		} 
		catch (FileNotFoundException e)
		{
			
			System.out.println("Unknown IO Exception");
		} 
	}
	/** 
	   *getter for file name. 
	* 
	* @return file name. 
	*/ 
	public String getFileName() {
		return fileName;
	}
	/** 
	   *setter for file name. 
	* 
	* @return void. 
	*/ 
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/** 
	   *getter for scanner. 
	* 
	* @return scanner. 
	*/ 
	public Scanner getScnr() {
		return scnr;
	}
	/** 
	   *setter for scanner. 
	* 
	* @return void. 
	*/ 
	public void setScnr(Scanner scnr) {
		this.scnr = scnr;
	}
	/** 
	   *reads in ticket file data. 
	* 
	* @return void. 
	*/ 
	public void readTicketData(String ticketFileName) {
		try
		{
			Scanner fr = new Scanner(new FileReader(ticketFileName));
			
			while(fr.hasNextLine())
			{   
				
				String line = fr.nextLine(); 
				if(line.startsWith("customer_id"))
				{
					continue; 
				}
				String[] values = line.split(",|\n");
				Customer customer = new Customer(values[1], values[2], values[4], values[5], values[3], values[0], values[6]);
				Ticket ticket = new Ticket(customer, values[8], values[7]);
				Main.ticketList.add(ticket); 
			}
		} 
		catch (FileNotFoundException e)
		{
			
				System.out.println("Unknown IO Exception");
		} 
	
	}
	/** 
	   *writes log file. 
	* 
	* @return void. 
	*/ 
	public void logger(String log) {
		try 
		{
			SimpleDateFormat sm = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
			Date date = new Date();
			String strDate = sm.format(date); 
			
			PrintWriter pr = new PrintWriter(new FileWriter(log, true));
			System.out.println("Loading Employee Data"); 
			System.out.println("Loading Ticket Data");
			System.out.println("Creating Work Orders");
			System.out.println("Writing Work Order Data to File");
			System.out.println("Work Orders Created. Program Exiting");
			pr.println(strDate + " " + "Loading Employee Data"); 
			pr.println(strDate + " " + "Loading Ticket Data");
			pr.println(strDate + " " + "Creating Work Orders"); 
			pr.println(strDate + " " + "Writing Work Order Data to File");
			
		    for(int i = 0; i < Main.workOrderList.size(); i++)
		    {
		    	pr.println(strDate + ": " + Project3.workOrderList.get(i).getInfo());
		    }
			pr.close();
		}
		catch (IOException e)
		{
			System.out.println("Unknown IO Exception");
		}
	
		
	}
}
