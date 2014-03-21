package edu.ycp.cs320.db.model;

public class MemberData {
	private String lastName;
	private String firstName;
	private String email;
	private String phoneNumber;
	private String companyName;
	private String position;
		
	public MemberData() {
		lastName = null;
		firstName = null;
		email = null;
		phoneNumber = null;
		companyName = null;
		position = null;	
	}

	/**
	 * @param args
	 */
	public void setAll(String lastName, String firstName, String email, String phoneNumber, String companyName, String position){
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
		this.position = position;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getEmail(){
		return email;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public String getCompanyName(){
		return companyName;
	}
	public String getPosition(){
		return position;
	}

}
