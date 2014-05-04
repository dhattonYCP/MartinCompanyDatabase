package martinComp.FMC.IFMA.model;

public class BrotherData {
	private int id;
	private String lastName;
	private String firstName;
	private String position;
	private String pledgeClass;
	private double GPA;
	
	public BrotherData(){
		lastName = null;
		firstName = null;
		position = null;
		pledgeClass = null;
		GPA = 0.0;
	}
	public BrotherData(int id, String lastName, String firstName, String position, String pledgeClass, double GPA){
		this.lastName = lastName;
		this.firstName = firstName;
		this.position = position;
		this.pledgeClass = pledgeClass;
		this.GPA = GPA;
		this.id = id;
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
	public void setGPA(double GPA){
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
	public double getGPA(){
		return this.GPA;
	}
	public int getId(){
		return this.id;
	}
	
}
