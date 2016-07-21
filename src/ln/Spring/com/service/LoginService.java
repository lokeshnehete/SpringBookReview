package ln.Spring.com.service;

import org.springframework.stereotype.Service;
import ln.Spring.com.pojos.User;

@Service
public interface LoginService {
	public User valiateUser(User user);

	public User addUser(User user);

	
}
