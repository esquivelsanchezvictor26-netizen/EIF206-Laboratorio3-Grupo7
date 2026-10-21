package com.vehiculos.mvc.controllers;

public interface Controller<T> {

	//VISTAS
	
	public void index();
	public void edit(int id);
	public void show(int id);
	public void create();
	
	public Object[][] getData();
	public String[] getColumns();
	
	
	//MODELOS
	
	public void store(T item);
	public void update(T item, int id);
	public void destroy(int id);
}
