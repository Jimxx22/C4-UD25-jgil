package com.c4.ud25.service;

import java.util.List;

import com.c4.ud25.dto.Empleado;

public interface IEmpleadoService {
	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un video CREATE
	
	public Empleado empleadoXID(String dni); //Leer datos de un video READ
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del video UPDATE
	
	public void eliminarEmpleado(String dni);// Elimina el video DELETE
}
