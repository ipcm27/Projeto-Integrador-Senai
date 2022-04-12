package com.projeto.integrador.model;

public class Colaborador {

	private int id;
	public String nome;
	private String cpf;
	private boolean isHablitado;
	
	

	
	public Colaborador(int id, String nome, String cpf, boolean isHablitado) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.isHablitado = isHablitado;
	}
	
	public Colaborador(int id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	
	}
	
	public Colaborador() {
		// TODO Auto-generated constructor stub
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
