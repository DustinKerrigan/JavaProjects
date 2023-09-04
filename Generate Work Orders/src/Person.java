/** 
 *  Creates person parent object. 
*/ 
public class Person implements DataHandler{
	
	private String firstName; 
	private String lastName; 
	private String address; 
	private String phoneNumber; 
	private String email; 
	//constructor
	Person(String firstName, String lastName, String address, String phoneNumber, String email){
		
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.address = address; 
		this.phoneNumber = phoneNumber; 
		this.email = email; 
	}
	/** 
	   *getter for first name. 
	* 
	* @return first name. 
	*/ 
	public String getFirstName() {
		return firstName;
	}
	/** 
	   *setter for first name. 
	* 
	* @return void. 
	*/ 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/** 
	   *getter for last name. 
	* 
	* @return last name. 
	*/ 
	public String getLastname() {
		return lastName;
	}
	/** 
	   *setter for last name. 
	* 
	* @return void. 
	*/ 
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	/** 
	   *getter for address. 
	* 
	* @return address. 
	*/ 
	public String getAddress() {
		return address;
	}
	/** 
	   *setter for address. 
	* 
	* @return void. 
	*/ 
	public void setAddress(String address) {
		this.address = address;
	}
	/** 
	   *getter for phone number. 
	* 
	* @return phone number. 
	*/ 
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/** 
	   *setter for phone number. 
	* 
	* @return void. 
	*/ 
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/** 
	   *getter for email. 
	* 
	* @return email. 
	*/ 
	public String getEmail() {
		return email;
	}
	/** 
	   *setter for email. 
	* 
	* @return void. 
	*/ 
	public void setEmail(String email) {
		this.email = email;
	}
	/** 
	   *gets info in String data type for log file. 
	* 
	* @return concatenated string. 
	*/  
	public String getInfo() {
		
		return firstName + "," + lastName + "\t";
	}
	/** 
	   *gets file data in String data type for workorder file. 
	* 
	* @return concatenated string. 
	*/ 
	public String getFileData() {
		
		return firstName + "," + lastName;
	}

}
