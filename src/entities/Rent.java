package entities;

public class Rent {

	private String name;
	private String email; 
	
	public Rent() {
		
	}
	
	public Rent(String name, String email) {
		
		this.name = name;
		this.email = email;
		
	}
	
	public void setName(String name ) {
		
		this.name = name; 
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setEmail (String email ) {
		
		this.email = email; 
		
	}
	
	public String getEmail () {
		
		return email; 
		
	}
	
	public String toString() {
		
		return name + ", " + email; 
		
	}
}
