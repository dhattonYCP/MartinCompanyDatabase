package martinComp.FMC.IFMA.shared;

import java.io.Serializable;

public class BrotherData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String lastName;
	private String firstName;
	private String position;
	private String pledgeClass;
	private String GPA;
	
	public BrotherData(){
		lastName = null;
		firstName = null;
		position = null;
		pledgeClass = null;
		GPA = null;
	}
	public BrotherData( String lastName, String firstName, String position, String pledgeClass, String GPA){
		this.lastName = lastName;
		this.firstName = firstName;
		this.position = position;
		this.pledgeClass = pledgeClass;
		this.GPA = GPA;
	}
	public void setId(int id) {
		this.id = id;		
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setPosition(String position){
		this.position = position;
	}
	public void setPledgeClass(String pledgeClass){
		this.pledgeClass = pledgeClass;
	}
	public void setGPA(String GPA){
		this.GPA = GPA;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getPosition(){
		return this.position;
	}
	public String getPledgeClass(){
		return this.pledgeClass;
	}
	public String getGPA(){
		return this.GPA;
	}
	public int getId(){
		return this.id;
	}
	public void setAs(BrotherData e) {
		this.id = e.getId();
		this.firstName = e.getFirstName();
		this.lastName = e.getLastName();
		this.pledgeClass = e.getPledgeClass();
		this.position = e.getPosition();
		this.GPA = e.getGPA();
		
	}
	
}
