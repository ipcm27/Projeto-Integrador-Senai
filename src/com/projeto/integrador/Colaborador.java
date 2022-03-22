package com.projeto.integrador;

public class Colaborador {

	private int id;
	public String nome;
	private boolean isHablitado;
	
	
	public Colaborador(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	
	}
	
	public Colaborador(int id, String nome, boolean isHablitado) {
		super();
		this.id = id;
		this.nome = nome;
		this.isHablitado = isHablitado;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public boolean isHablitado() {
		return isHablitado;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setHablitado(boolean isHablitado) {
		this.isHablitado = isHablitado;
	}
	
	

}
