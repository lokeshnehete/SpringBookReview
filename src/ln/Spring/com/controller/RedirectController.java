package ln.Spring.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	@RequestMapping("/{uri}")
	public String redirect( @PathVariable("uri") String uri )
	{
		return uri;
	}
}
