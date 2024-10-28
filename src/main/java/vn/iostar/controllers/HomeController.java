package vn.iostar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@Controller
public class HomeController {

	@GetMapping(value="/")
	public String index()
	{
		return "web/home";
	}
	
	
}
