package com.projeto.integrador.model;

public class Veiculo {

	private int id;
	private String modelo;
	private boolean isDisponível;
	private Double quilometragemAtual;
	private Double consumoKmL;
	
	public Veiculo(int id, String modelo, boolean isDisponível, Double quilometragemAtual, Double consumoKmL) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.isDisponível = isDisponível;
		this.quilometragemAtual = quilometragemAtual;
		this.consumoKmL = consumoKmL;
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

	public Double getQuilometragemAtual() {
		return quilometragemAtual;
	}

	public Double getConsumoKmL() {
		return consumoKmL;
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

	public void setQuilometragemAtual(Double quilometragemAtual) {
		this.quilometragemAtual = quilometragemAtual;
	}

	public void setConsumoKmL(Double consumoKmL) {
		this.consumoKmL = consumoKmL;
	}
	
	
	
	

	
	
}
