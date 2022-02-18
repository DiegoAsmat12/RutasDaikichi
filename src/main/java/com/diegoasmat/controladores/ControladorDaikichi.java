package com.diegoasmat.controladores;

import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/travel/{ciudad}", method = RequestMethod.GET)
	public String viaje(@PathVariable("ciudad")String ciudad) {
		return "¡Felicitaciones! ¡Pronto viajaras a "+ciudad+"!";
	}
	
	@RequestMapping(value="/lotto/{numero}", method = RequestMethod.GET)
	public String lotto(@PathVariable("numero")int numero) {
		if(numero%2==0) {
			return "Harás un viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras.";
		}
		return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos.";
	}
}
