package martinComp.FMC.IFMA.model;

public class Brother {
	private String lastName;
	private String firstName;
	private String position;
	private String pledgeClass;
	private double GPA;
	
	public Brother(){
		lastName = null;
		firstName = null;
		position = null;
		pledgeClass = null;
		GPA = 0.0;
	}
	public void setLastName(String lastName){
		this.lastName= lastName;
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
		return lastName;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getPosition(){
		return position;
	}
	public String getPledgeClass(){
		return pledgeClass;
	}
	public double getGPA(){
		return GPA;
	}
}
