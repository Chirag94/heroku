package springfrommaven;
import genrepavkage.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;  
@RestController
public class controllermain {
	@RequestMapping( value="/main",method=RequestMethod.GET)
	public genre hello() {
	return new genre(1,"ASD", "Metal");
	}
	@PostMapping( value="/main")
	public genre newMethod() {
	return new genre(2,"ASD", "Metal");
	}
	
	

}
