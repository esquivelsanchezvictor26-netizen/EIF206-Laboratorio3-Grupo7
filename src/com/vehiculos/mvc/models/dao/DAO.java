package com.vehiculos.mvc.models.dao;

import java.util.ArrayList;

public interface DAO<T>{
	
	
	//OBTENER DATOS
	
	public ArrayList<T> all();
	public T find(int id);
	
	
	
	//EJECUTAR OPERACIONES
	
	public boolean store(T item);
	public boolean update(T item, int id);
	public boolean destroy(int id);
	
}
