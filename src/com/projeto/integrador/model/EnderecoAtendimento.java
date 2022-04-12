package com.projeto.integrador.model;

public class EnderecoAtendimento {
	private int id;
	private String uf;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	private String cep;

	
	public EnderecoAtendimento(int id, String uf, String cidade, String bairro, String rua, int numero, String cep,
			int distanciaSede) {
		super();
		this.id = id;
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		
	}

	public int getId() {
		return id;
	}

	public String getUf() {
		return uf;
	}

	public String getCidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	public String getCep() {
		return cep;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}


}
