package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@RestController()
public class HomeController
{

	//public static final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();
	
	
	@RequestMapping("/index.html")
	public ModelAndView welcomePage()
	{
		return new ModelAndView("index");

	}
	

	@RequestMapping(path = "/index.html" , method=RequestMethod.POST )
	public ModelAndView process(WebRequest request) {
			
			
		 int centimeterValue = Integer.valueOf(request.getParameter("centimeterValue"));
	     int meterValue = Integer.valueOf(request.getParameter("meterValue"));
		 int mileValue = Integer.valueOf(request.getParameter("mileValue"));
		
		 
		String output = String.valueOf(centimeterValue * 100);
		String one = String.valueOf(meterValue* 10);
		 
		System.out.println("Foot value is = " + centimeterValue);
		System.out.println("Yard value is = " + meterValue);
		System.out.println("Mile value is = " + mileValue);
		
	
		ModelAndView view = new ModelAndView();
		Map<String, String> message = new HashMap<String, String>();
		

		message.put("output", String.valueOf(output));
		message.put("one", String.valueOf(one));
		message.put("mileValue", String.valueOf(mileValue));
		
		
		view.setViewName("/result");
		
		
		view.addObject("message",message);
		
		
		
		return view;
	}	
	
}
