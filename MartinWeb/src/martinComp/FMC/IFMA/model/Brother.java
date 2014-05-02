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
	public String getLastName(String lastName){
		return lastName;
	}
	public String getFirstName(String firstName){
		return firstName;
	}
	public String getPosition(String position){
		return position;
	}
	public String getPledgeClass(String pledgeClass){
		return pledgeClass;
	}
	public double getGPA(double GPA){
		return GPA;
	}
}
