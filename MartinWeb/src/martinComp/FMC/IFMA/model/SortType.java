package martinComp.FMC.IFMA.model;

public enum SortType {
	ASCEND_ALPHA	("ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
	DESCEND_ALPHA	("ZYXWVUTSRQPONMLKJIHGFEDCBA"),
	ASCEND_NUM		("0123456789"),
	DESCEND_NUM		("9876543210");
	private String sequence;
	SortType(String sequence){
		this.sequence = sequence;
	}
	public String getSequence(){return sequence;}
	

}
