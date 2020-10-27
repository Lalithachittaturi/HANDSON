package org.hcl.services;

import org.hcl.entities.User;

public interface RequesterLogin {
	public boolean insertUser(User user);
	public User verifyUser(User user);


}
