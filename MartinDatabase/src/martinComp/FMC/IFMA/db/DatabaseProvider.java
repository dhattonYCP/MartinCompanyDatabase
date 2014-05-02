package martinComp.FMC.IFMA.db;

public class DatabaseProvider {
	public static IDatabase instance;
	public static void setInstance(IDatabase db){
		instance = db;
	}
	public static IDatabase getInstance(){
		if(instance == null){
			throw new IllegalStateException ("No database Instance");
		}
		return instance;
	}
}
