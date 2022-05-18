package demo2.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project1 {

	@GetMapping(value = "/spring")
	String Message(){
		return "welcome to spring";
	}
}
