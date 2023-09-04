/* 
*  Author: Dustin Kerrigan 
*  Title  : Generating Work Orders.
*  
*  Creates workorders for employees given tickets.
*/ 
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/** 
 *  Calls methods and declares global variables. 
*/ 
public class Project3 {

	public static String employeeFileName;
	public static String ticketFileName; 
	public static String workOrderFileName;
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public static ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
	
	public static void main(String[] args) {
		
		System.out.println("Work Order Generator "); 
		
		employeeFileName = "employee_data.csv";
		ticketFileName = "ticket_data.csv";
		workOrderFileName = "workorder_data.csv";
		
		FileHandler fh = new FileHandler(); //creates file handler object to call all methods
		
		fh.readEmployeeData(employeeFileName); 
		fh.readTicketData(ticketFileName);
		createWorkOrders();	
		fh.writeData(); 
		fh.logger("log.txt");
	
	}
	/** 
	   *Creates workorders. 
	* 
	* @return void. 
	*/ 
	public static void createWorkOrders(){
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
		
		Date date = new Date();
		
		String createdAt = formatter.format(date); 
		
		int j = 0;
		for(int i = 0; i < ticketList.size(); i++)
		{
			if(j >= 100)
			{
				j = 0;
			}
			WorkOrder workOrder = new WorkOrder(employeeList.get(j),ticketList.get(i), createdAt);
			workOrderList.add(workOrder);
			j++;
		}
		
	}
}
