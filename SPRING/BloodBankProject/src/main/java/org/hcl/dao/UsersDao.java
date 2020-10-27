package org.hcl.dao;

import org.hcl.entities.donorblooddetails;
import org.hcl.entities.User;

public interface UsersDao {
	public boolean insert(User user);

	public User verifyUser(User user);
	
}