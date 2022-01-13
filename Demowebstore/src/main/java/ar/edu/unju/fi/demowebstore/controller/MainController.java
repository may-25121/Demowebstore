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
	
	@RequestMapping({"/login"})
	public String getLoginPage(Model model) {
		return "login";
	}
	
	@RequestMapping({"/admin"})
	public String getAdminPage(Model model) {
		return "adminprincipal";
	}

	@RequestMapping({"/listarempleados"})
	public String getListarEmpleadoPage(Model model) {
		return "listarempleados";
	}
	
	
	@RequestMapping({"/listaroficinas"})
	public String getListarOficinaPage(Model model) {
		return "listaroficinas";
	}
	
}
