package es.submanager.SubManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubViewerController {
	
	@GetMapping("/")
	public String mostrarHome() {
		return "subViewer/index";
	}

}
