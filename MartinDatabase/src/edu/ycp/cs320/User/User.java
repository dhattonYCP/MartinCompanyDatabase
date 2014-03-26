package edu.ycp.cs320.User;
import java.util.ArrayList;
public class User {
	
	
	private ArrayList<String> user;
	public User(String username){
		user.add(username);
	}

	public String getUsername() {
		return user.get(user.size() - 1);
	}

}