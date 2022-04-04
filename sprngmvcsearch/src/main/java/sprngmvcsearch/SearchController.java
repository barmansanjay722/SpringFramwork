package sprngmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	// path variable
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName)
	{
		System.out.println(userId);
		System.out.println(userName);
		return "home";
	}

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("going to home view");
		//processing area..
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		String url = "https://www.google.com/search?q="+query;
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		
		return redirectView;
	}
	
//	// Handling exception in our spring MVC
//	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
//	public String exceptionHandlerNull()
//	{
//		return "null_page";
//	}
//	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = Exception.class)
//	public String GenericExceptionHandling(Model m)
//	{
//		m.addAttribute("msg","Exception has occured");
//		return "null_page";
//	}
}