package com.vehiculos.mvc.models.vo;

public class Vehiculo {

	private int id;
	private int idPropietario;
	private String placa;
	private Propietario propietario;
	
	
	public Vehiculo( int idPropietario, String placa) {
		this.id = 0;
		this.idPropietario = idPropietario;
		this.placa = placa;
		this.propietario = null;
	}

	public Vehiculo(int id, int idPropietario, String placa, Propietario propietario) {
		
		this.id = id;
		this.idPropietario = idPropietario;
		this.placa = placa;
		this.propietario = propietario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(int idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", idPropietario=" + idPropietario + ", placa=" + placa + ", propietario="
				+ propietario + "]";
	}

 
	
	
	
	
}

