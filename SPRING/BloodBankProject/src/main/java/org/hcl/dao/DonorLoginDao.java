package org.hcl.dao;

import org.hcl.entities.User;

public interface DonorLoginDao {
	public boolean insert(User user);

	public User verifyUser(User user);

}
