package org.hcl.dao;

import javax.transaction.Transactional;

import org.hcl.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UsersDaoImpl implements UsersDao {
	@Autowired

	SessionFactory factory;
	@Override
	public boolean insert(User user) {
		boolean b=false;
		Session session=factory.openSession();
		Integer i=(Integer)session.save(user);
		if(i==user.getUid())
			b=true;
		session.close();
		return b;
	}
	@Override
	public User verifyUser(User user) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession(); 
		System.out.println(user.getUserName()); 
		System.out.println(user.getPassword()); 
		String query="from org.hcl.entities.User u where u.username=:username and u.password=:password";
		User verifiedUser = (User) session.createQuery(query).
				setParameter("email", user.getUserName()).
				setParameter("password", user.getPassword()).uniqueResult(); 
		if(verifiedUser!=null) { 
			System.out.println(verifiedUser.getUserName()); 
			return verifiedUser; }
		else { 

			return null;
		}
	}
}
