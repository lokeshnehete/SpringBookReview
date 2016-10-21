package ln.Spring.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import ln.Spring.com.pojos.User;


@Repository
public class LoginDaoImp implements LoginDao  {
	
	@Override
	public User validateUser(User user) {
		
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	    Query query = session.createQuery("from User u where u.username= :username and password = :password")
				.setParameter("username", user.getUsername()).setParameter("password", user.getPassword());
		t.commit();
		@SuppressWarnings("unchecked")
		List<User> result = query.list();
		
	
		User user3=null;
		if(result!=null)
		for (User user2 : result) {
			System.out.println(user2.getUsername());
			user3=user2;
		}	
		return user3;
	}

	@Override
	public User addUser(User user) {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction t=session.beginTransaction();
	  
	    session.save(user);
	    t.commit();
	    session.close(); 
		return user;
		
	}
	
}
