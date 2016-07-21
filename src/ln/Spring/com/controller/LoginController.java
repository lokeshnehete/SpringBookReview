package ln.Spring.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ln.Spring.com.pojos.User;
import ln.Spring.com.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	public LoginController() {
		System.out.println("LoginController Called");
	}

	
	/*@RequestMapping(value="/login",method=RequestMethod.POST)
	public User validateUser(User user1)
	{
		System.out.println("username = "+user1.getUsername());
		User u=loginservice.valiateUser(user1);
		return u;	
	}*/
	
	 @RequestMapping(value="/login", method=RequestMethod.POST)
	    public String submitForm(@Validated User user, BindingResult result, Model m) {
	        if(result.hasErrors()) {
	            return "login";
	        }
	         
	        m.addAttribute("message", "Successfully saved person: " + user.toString());
	        return "Welcome";
	    }
	@RequestMapping(value="/register")
	 public String addUser(@ModelAttribute User user) {
		loginservice.addUser(user);
		
		return "redirect:/";
	 }
}
