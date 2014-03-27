package martinComp.FMC.IFMA.model;
public class Sort{
	private SortType sortType;
	
	public Sort(SortType sortType) {
		this.sortType = sortType;
	}

	public char[] getArray() {
		return sortType.getSequence().toCharArray();
	}


}
