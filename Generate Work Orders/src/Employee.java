/** 
 *  creates employee object. 
*/ 
public class Employee extends Person implements DataHandler{
	
	private String employeeId; 
	private String clockedIn;
	private String hiredDate; 
	//constructor
	Employee(String firstName, String lastname, String address, String phoneNumber, String email, String employeeId, String clockedIn, String hiredDate){
		super(firstName, lastname, address, phoneNumber, email);
		
		this.employeeId = employeeId; 
		this.clockedIn = clockedIn; 
		this.hiredDate = hiredDate; 
	}
	/** 
	   *gets employee data. 
	* 
	* @return employeeId. 
	*/ 
	public String getEmployeeId() {
		return employeeId;
	}
	/** 
	   *setter for employeeId. 
	* 
	* @return void. 
	*/ 
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/** 
	   *gets time clocked in. 
	* 
	* @return clocked in time. 
	*/ 
	public String getClockedIn() {
		return clockedIn;
	}
	/** 
	   *sets clocked in date in. 
	* 
	* @return void. 
	*/ 
	public void setClockedIn(String clockedIn) {
		this.clockedIn = clockedIn;
	}
	/** 
	   *getter for date hired. 
	* 
	* @return date hired. 
	*/ 
	public String getHiredDate() {
		return hiredDate;
	}
	/** 
	   *setter for date hired. 
	* 
	* @return void. 
	*/ 
	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}
	/** 
	   *gets log data in String data type for log file. 
	* 
	* @return concatenated string. 
	*/ 
	@Override
	public String getInfo(){
		
		return "Employee Info: " + "Employee Name: "  + super.getInfo() + "\t" + "Employee ID: " + employeeId + "\t" + "Time Clocked In: "+ clockedIn;
	}
	/** 
	   *gets file data in String data type for workorder file. 
	* 
	* @return concatenated string. 
	*/ 
	@Override
	public String getFileData(){
		
		return employeeId + "," + super.getFileData() + "," + clockedIn;
	}

	
}
