package Customer;

public class Contact { 
    public String customerName; 
    public String email; 
    public String phoneNumber; 
    public String address; 
 
	public Contact(String customerName, String email, String phoneNumber, String address) { 
		  this.customerName = customerName; 
		  this.email = email; 
		  this.phoneNumber = phoneNumber; 
		  this.address = address; 
	 } 
	
	public String getCustomerName() { 
		return customerName; 
	} 
	
	public void setCustomerName(String customerName) { 
		this.customerName = customerName; 
	} 
	
	public String getEmail() { 
		return email; 
	} 
	
	public void setEmail(String email) { 
		this.email = email; 
	} 
	
	public String getPhoneNumber() { 
		return phoneNumber; 
	} 
	
	public void setPhoneNumber(String phoneNumber) { 
		this.phoneNumber = phoneNumber; 
	} 
	
	public String getAddress() { 
		return address; 
	} 
	
	public void setAddress(String address) { 
		this.address = address; 
	} 

	@Override 
	public String toString() { 
		return customerName + " " + email +" " + phoneNumber + " " + address ; 
	} 
}
