/** 
 *  Creates Ticket object to store in list. 
*/ 
public class Ticket implements DataHandler{
	
	private Customer customer; 
	private String createdAt; 
	private String ticketId; 
	//constructor
	Ticket(Customer customer, String createdAt, String ticketId){
		this.customer = customer;
		this.createdAt = createdAt; 
		this.ticketId = ticketId; 
	}
	/** 
	   *getter for customer. 
	* 
	* @return customer. 
	*/ 
	public Customer getCustomer() {
		return customer;
	}
	/** 
	   *setter for employee. 
	* 
	* @return void. 
	*/ 
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/** 
	   *getter for createdAt time. 
	* 
	* @return createdAt. 
	*/ 
	public String getCreatedAt() {
		return createdAt;
	}
	/** 
	   *setter for createdAt. 
	* 
	* @return void. 
	*/ 
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	/** 
	   *getter for ticketID. 
	* 
	* @return ticketID. 
	*/ 
	public String getTicketId() {
		return ticketId;
	}
	/** 
	   *setter for ticketID. 
	* 
	* @return void. 
	*/ 
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	/** 
	   *gets info in String data type for log file. 
	* 
	* @return concatenated string. 
	*/ 
	public String getInfo(){
		
		return customer.getInfo() + createdAt + " " + "Ticket ID: "+ ticketId + " ";
	}
	/** 
	   *gets fileData in String data type for workorder file. 
	* 
	* @return concatenated string. 
	*/ 
	public String getFileData(){
		
		return customer.getFileData() + "," + createdAt + "," + ticketId;
	}

}
