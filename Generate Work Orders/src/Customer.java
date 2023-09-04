/** 
 *  creates customer object. 
*/ 
public class Customer extends Person implements DataHandler{
	
	private String customerId;
	private String accountNumber; 
	//constructor
	Customer(String firstName, String lastname, String address, String phoneNumber, String email, String customerId, String accountNumber) {
		super(firstName, lastname, address, phoneNumber, email);
		
		this.customerId = customerId; 
		this.accountNumber = accountNumber; 
	}
	/** 
	   *gets customerId. 
	* 
	* @return customerId. 
	*/ 
	public String getCustomerId() {
		return customerId;
	}
	/** 
	   *setter for customerId. 
	* 
	* @return void. 
	*/ 
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/** 
	   *getter for account number. 
	* 
	* @return accountNumber. 
	*/ 
	public String getAccountNumber() {
		return accountNumber;
	}
	/** 
	   *setter for accountNumber. 
	* 
	* @return void. 
	*/ 
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/** 
	   *gets file data in String data type for workorders file. 
	* 
	* @return concatenated string. 
	*/ 
	@Override
	public String getFileData() {
		
		return super.getFileData() + "," + customerId;
	}
	/** 
	   *gets log data in String data type for log file. 
	* 
	* @return concatenated string. 
	*/ 
	@Override
	public String getInfo() {
		
		return  "Customer Info: Customer Name:"  + super.getInfo() + "\t" + "Customer ID: "+ customerId + " " + "Account Number: " + accountNumber + " Created At: ";
	}
}
