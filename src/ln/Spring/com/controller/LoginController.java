package ln.Spring.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ln.Spring.com.pojos.User;
import ln.Spring.com.service.LoginService;



@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private HttpServletRequest request;
	
	public LoginController() {
		System.out.println("LoginController Called");
	}
	
	@RequestMapping("/")
	public String WelcomeUser()
	{
		System.out.println("Successfully Launched");
		return "loginPage";
	}
	
	 @RequestMapping(value="/login", method=RequestMethod.POST)
	 public String validateUser(@Validated User user, BindingResult result, Model m) {
	     User u=loginservice.valiateUser(user);
	      
		 if(u==null){
			 return "loginPage";
		 }else{
			 System.out.println("username = "+u.getUsername());
			
			 session = request.getSession();
		     session.setAttribute("user", u);
		     System.out.println(session.getAttribute("user"));
			 System.out.println("Session: "+request.getSession().getAttributeNames().nextElement());
			 System.out.println("Session Time: "+request.getSession().getCreationTime());
			 
			 if(u.getRole().equals("user")){
				 return "welcomePage";
			 }else{
				 return "dashboard";
			 }
		}	 
	}
	 
	@RequestMapping(value="/register")
	 public String addUser(@ModelAttribute User user) {
		loginservice.addUser(user);
		return "loginPage";	
	 }			
}
