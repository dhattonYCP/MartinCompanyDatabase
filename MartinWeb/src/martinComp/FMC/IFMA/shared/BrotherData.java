package martinComp.FMC.IFMA.shared;

public class BrotherData {
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
	
}
