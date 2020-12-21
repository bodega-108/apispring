package com.apitest;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apitest.dao.PersonaRipleyDao;
import com.apitest.model.PersonaRipley;

@RestController
public class RipleyRest {
	

	//@CrossOrigin(origins = "http://localhost:3000")
	@CrossOrigin(origins = "https://wizardly-mirzakhani-ad4a1b.netlify.app/")
	@PostMapping("/saldo")
	public PersonaRipley personaRipley(@RequestParam String rut) {
		
		//Generar Nombres
		PersonaRipleyDao persona_dao = new PersonaRipleyDao();
		String[] resultado_nombre = persona_dao.obtenerDato();
		persona_dao.fechaNacimiento();
		
		//Generar Saldo
		double saldo = persona_dao.saldo();
		
		//Generar Fecha de nacimiento
		String fecha = persona_dao.fechaNacimiento();
		
		//Setear Datos
		PersonaRipley persona = new PersonaRipley();
		persona.setNombre(resultado_nombre[0]);
		persona.setApellido(resultado_nombre[1]);
		persona.setSaldo(saldo);
		persona.setRut(rut);
		persona.setFechaNacimiento(fecha);
		System.out.println(resultado_nombre[0]+ " y el saldo es " + persona.getSaldo());
		
		return persona;
	}
}
