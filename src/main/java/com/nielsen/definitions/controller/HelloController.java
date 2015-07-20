package com.nielsen.definitions.controller;

import com.nielsen.definitions.model.ValidVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {

	private static final String template = "Hello, %s!";
	
	private static final String template2 = "Greetings, %s!";

	@RequestMapping(value = "/{version}/hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello(
			@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name,
			@PathVariable ValidVersion version) {
		return String.format(template, name);
	}

	@RequestMapping(value = "/{version}/greetings", method = RequestMethod.GET)
	public @ResponseBody String greetings(
			@RequestParam(value = "name", required = false, defaultValue = "Friend") String name,
			@PathVariable ValidVersion version) {
		//Added a comment
		return String.format(template2, name);
	}	
	
}
