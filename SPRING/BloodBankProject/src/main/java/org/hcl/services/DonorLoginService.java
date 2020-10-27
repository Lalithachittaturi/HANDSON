package org.hcl.services;

import org.hcl.entities.User;

public interface DonorLoginService {
	public boolean insertUser(User user);
	public User verifyUser(User user);

}
