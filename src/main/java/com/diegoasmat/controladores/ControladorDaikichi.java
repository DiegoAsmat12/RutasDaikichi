package com.diegoasmat.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ControladorDaikichi {
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String index(){
		return "¡Bienvenido!";
	}
	
	@RequestMapping(value="/today", method=RequestMethod.GET)
	public String today() {
		return "¡Hoy encontrarás suerte en todos tus esfuerzos!";
	}
	
	@RequestMapping(value="/tomorrow",method=RequestMethod.GET)
	public String tomorrow() {
		return "¡Mañana, una oportunidad aparecerá, así que debes estar listo para recibir nuevas ideas!";
	}
}
