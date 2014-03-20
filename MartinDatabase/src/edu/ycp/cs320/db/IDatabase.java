package edu.ycp.cs320.db;
import java.sql.SQLException;

import edu.ycp.cs320.db.model.MemberData;

public interface IDatabase {

	public MemberData retrieveData(RequestHandler request) throws SQLException;
	public void sendData(RequestHandler request) throws SQLException;
	
}