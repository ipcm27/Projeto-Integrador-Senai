package com.projeto.integrador.model;

public class Veiculo {

	private int id;
	private String modelo;
	private boolean isDisponível;
	
	public Veiculo(int id, String modelo) {
		super();
		this.id = id;
		this.modelo = modelo;
		
	}

	
	public Veiculo(int id, String modelo, boolean isDisponível) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.isDisponível = isDisponível;
	}

	
	public int getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean isDisponível() {
		return isDisponível;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setDisponível(boolean isDisponível) {
		this.isDisponível = isDisponível;
	}

	
	
}
