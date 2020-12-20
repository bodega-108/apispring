package com.apitest.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.apitest.model.PersonaRipley;

public class PersonaRipleyDao {
		String[] nombres = {"Eduardo","Cesar","Miguel","Linmar","Carlos","Maria","Jaime","Maycohol"};
		String[] apellidos = {"Sagredo","Quintero","Gonzales","Lobo","Caro","Luxy"};
		
		
	public String[] obtenerDato(){
		
		//Obtenemos un nombre random		
		double nombre_seleccionado = Math.floor(Math.random()*nombres.length);
		
		//Obtenemos un apellido random
		double apellido_seleccionado = Math.floor(Math.random()*apellidos.length);
		
		//Instanciamos Objeto Persona
		PersonaRipley persona_info = new PersonaRipley();
		
		//Seteo de datos
		persona_info.setNombre(this.nombres[(int) nombre_seleccionado]);
		persona_info.setApellido(this.apellidos[(int) apellido_seleccionado]);
		
		System.out.println("Nombre generado " + persona_info.getNombre());
		String[] nombre_producido = {this.nombres[(int) nombre_seleccionado],this.apellidos[(int) apellido_seleccionado]};
		
		return nombre_producido;
	}
	
	public double saldo() {
		
		//Numero base random
		double a = Math.floor(Math.random()*9);
		
		
		//Multiplicador random
		double b = Math.floor(Math.random()*9);
		
		PersonaRipley saldo_personal = new PersonaRipley();
		
		double deuda = a * b * 100;
		
		double saldo_final = deuda;
		
		
		return saldo_final ;
		
	}
	
	public String fechaNacimiento() {
		int year =   (int) Math.floor(Math.random()*89 + 10);
		System.out.println(year);
		String fechaNacimiento = "19/12/19" + year;
		return fechaNacimiento;
	}
	
}
