/** 
 *  Creates workOrder object to store in list. 
*/ 
public class WorkOrder implements DataHandler{

	private Employee employee; 
	private String createdAt;
	private Ticket ticket; 
	//constructor
	WorkOrder(Employee employee, Ticket ticket, String createdAt){
		this.employee = employee; 
		this.ticket = ticket; 
		this.createdAt = createdAt; 
	}
	/** 
	   *getter for employee. 
	* 
	* @return employee. 
	*/ 
	public Employee getEmployee() {
		return employee;
	}
	/** 
	   *setter for employee. 
	* 
	* @return void. 
	*/ 
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	/** 
	   *getter for created at time. 
	* 
	* @return createdAt. 
	*/ 
	public String getCreatedAt() {
		return createdAt;
	}
	/** 
	   *setter for created at. 
	* 
	* @return void. 
	*/ 
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	/** 
	   *getter for ticket. 
	* 
	* @return ticket. 
	*/ 
	public Ticket getTicket() {
		return ticket;
	}
	/** 
	   *setter for ticket. 
	* 
	* @return void. 
	*/ 
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	/** 
	   *gets info in String data type for log file. 
	* 
	* @return concatenated string. 
	*/ 
	public String getInfo(){
		
		return employee.getInfo() + "\t"  + ticket.getInfo() +"Workorder Info: " + "Created At: " + createdAt + " ";
	}
	/** 
	   *Creates gets file data in String type for workorder file. 
	* 
	* @return concatenated string. 
	*/ 
	public String getFileData(){
		
		return employee.getFileData() + "," + ticket.getFileData() + "," + createdAt;
	}
}
