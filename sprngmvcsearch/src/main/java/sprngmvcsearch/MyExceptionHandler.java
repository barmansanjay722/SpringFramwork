package sprngmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	
	// Handling exception in our spring MVC
	
		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
		public String exceptionHandlerNull()
		{
			return "null_page";
		}
		
		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value = Exception.class)
		public String GenericExceptionHandling(Model m)
		{
			m.addAttribute("msg","Exception has occured");
			return "null_page";
		}
		
}
