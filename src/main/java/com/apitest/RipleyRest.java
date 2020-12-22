package com.apitest;



import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.apitest.model.PersonaRipley;

@RestController
public class RipleyRest {
	
	//@CrossOrigin(origins = "https://wizardly-mirzakhani-ad4a1b.netlify.app")
	@CrossOrigin(origins = "hppt://localhost:3000")
	@PostMapping("/cliente")
	public PersonaRipley consultaCLientes(@RequestParam String rut) {
			
	ArrayList<PersonaRipley> cliente = new ArrayList<PersonaRipley>();
	
	PersonaRipley cliente1 = new PersonaRipley();
	PersonaRipley cliente2 = new PersonaRipley();
	PersonaRipley cliente3 = new PersonaRipley();

	PersonaRipley cliente4 = new PersonaRipley();

	cliente1.Empleado("Jaime", "Cortes","13353951-3" ,"04/03/1975");
	cliente2.Empleado("Maycohol", "Coccio","15561309-2","01/10/1984");
	cliente3.Empleado("Michelle", "Batarce","21312474-9","18/11/1995");
	cliente4.Empleado("test","Test","para pruebas 155613092,13353951-3,213124749","18/11/3000");
	
	cliente.add(cliente1);
	cliente.add(cliente2);
	cliente.add(cliente3);
	cliente.add(cliente4);
	
	
	
	if(rut.equals("15561309-2") || rut.equals("155613092")) {
		System.out.println("segundo rut" + rut);
		return cliente.get(1);
	}else if(rut.equals("13353951-3") || rut.equals("133539513")) {
		return cliente.get(0);
	}else if(rut.equals("21312474-9") || rut.equals("213124749")) {
		return cliente.get(2);
	}
		return cliente.get(3);
	
	

	
	
	}

}
