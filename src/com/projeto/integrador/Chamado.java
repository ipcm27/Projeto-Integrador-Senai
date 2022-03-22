package com.projeto.integrador;

public class Chamado {
	
	private int idChamado;
	private Colaborador colaborador;
	private Veiculo veiculo;
	private Endereco endereco;
	private int distanciaPercorrida;
	private boolean concluido;
	
	public Chamado(int idChamado, Colaborador colaborador, Veiculo veiculo, int distanciaPercorrida,
			boolean concluido) {
		super();
		this.idChamado = idChamado;
		this.colaborador = colaborador;
		this.veiculo = veiculo;
		this.distanciaPercorrida = distanciaPercorrida;
		this.concluido = concluido;
	}

	public int getIdChamado() {
		return idChamado;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public int getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void setDistanciaPercorrida(int distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
	
	
	public int calcularDistancia(Endereco endereco) {
		
		int distancia = endereco.getDistanciaSede();
		this.setDistanciaPercorrida(distancia);
		return distancia;
	}
	
	
	
}
