package ln.Spring.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ln.Spring.com.dao.LoginDao;
import ln.Spring.com.pojos.User;

@Service
public class LoginServiceImp implements LoginService {

	@Autowired 
	private LoginDao logindao;
	
	@Override
	public User valiateUser(User user) {
		System.out.println(user.getUsername());
		return logindao.validateUser(user);
	}

	@Override
	public User addUser(User user) {
		
		return logindao.addUser(user);
	}

}
