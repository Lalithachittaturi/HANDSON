package org.hcl.services;

import javax.transaction.Transactional;

import org.hcl.dao.UsersDao;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RequesterLoginImpl implements RequesterLogin {
	@Autowired
	UsersDao dao;
	@Override
	@Transactional
	public boolean insertUser(User user) {
		boolean b=dao.insert(user);
		return b;
	}

	@Override
	public User verifyUser(User user) {
		return dao.verifyUser(user);
	}
	
}
