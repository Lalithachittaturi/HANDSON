package org.hcl.services;

import javax.transaction.Transactional;

import org.hcl.dao.UsersDao;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DonorLoginServiceImpl implements DonorLoginService {
	@Autowired
	UsersDao dao;
	@Override
	@Transactional
	public boolean insertUser(User user) {
		boolean b=dao.insert(user);
		return b;
	}
	@Override
	@Transactional
	public User verifyUser(User user) {
		// TODO Auto-generated method stub
		return dao.verifyUser(user);
	}
}

