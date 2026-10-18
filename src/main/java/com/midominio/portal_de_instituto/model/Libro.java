package com.midominio.portal_de_instituto.model;

public class Libro {
	
	private int id;
	private String titulo;
	private String autor;
	private int numeroEjemplares;
	private String genero;
	
	private static int nextId = 1;

	public Libro(int id, String titulo, String autor,int numeroEjemplares, String genero) {
		id = nextId++;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroEjemplares = numeroEjemplares;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	public String getGenero() {
		return genero;
	}
	
	
	
	

}
