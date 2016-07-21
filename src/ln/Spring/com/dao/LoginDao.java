package ln.Spring.com.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import ln.Spring.com.pojos.User;

@Configuration
@Repository
public interface LoginDao {

	User validateUser(User user);

	User addUser(User user);

}
