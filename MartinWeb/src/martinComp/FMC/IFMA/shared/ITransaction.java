package martinComp.FMC.IFMA.shared;

import java.sql.Connection;
import java.sql.SQLException;

public interface ITransaction<E> {
	// return the results of the any connections
	public E run(Connection conn) throws SQLException;
}
