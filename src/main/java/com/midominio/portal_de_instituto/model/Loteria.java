package com.midominio.portal_de_instituto.model;

public class Loteria {
	
	private String pais;
	private int max;
	private int cantidad;
	
	public Loteria(String pais, int max, int cantidad) {
		this.pais = pais;
		this.max = max;
		this.cantidad = cantidad;
	}

	public String getPais() {
		return pais;
	}

	public int getMax() {
		return max;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	
	
	

}
