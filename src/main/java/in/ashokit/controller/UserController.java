package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binding.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public ModelAndView loadForm() {
				
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("user",new User());
		mav.setViewName("userView");
		return mav;
		
	}
	
	@PostMapping("/user")
	public ModelAndView handleSubmit(User user) {
		System.out.println(user);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg","User Saved");
		
		mav.setViewName("userView");
		return mav;
		
	}

}
