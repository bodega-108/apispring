package com.apitest.model;

public class PersonaRipley {
	
	private String nombre;
	private String apellido;
	private String rut;
	
	private String fechaNacimiento;
	private String ruts;
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}

	
	public void Empleado(String nombre,String apellido, String rut,String fechaNacimiento) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut=rut;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	

	
}
