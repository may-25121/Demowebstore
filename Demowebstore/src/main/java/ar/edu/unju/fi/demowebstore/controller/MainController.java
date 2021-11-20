/**
 * 
 */
package ar.edu.unju.fi.demowebstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author User
 *
 */
@Controller
public class MainController {
	
	@RequestMapping({"/main","home"})
	public String getPrincipalPage(Model model) {
		return "main";
	}

}
