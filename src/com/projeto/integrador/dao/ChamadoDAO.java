package com.projeto.integrador.dao;

import java.util.ArrayList;
import java.util.List;

import com.projeto.integrador.model.Chamado;

public class ChamadoDAO {
	
	private static ChamadoDAO instance;
	private List<Chamado> listaChamados = new ArrayList<>();
	
	public ChamadoDAO getInstance() {
		if (instance == null){
			instance = new ChamadoDAO();
		}
		return instance;
		
	}
	
	public void salvar(Chamado chamado) {
		listaChamados.add(chamado);
	}
	
	public void atualizar(Chamado chamado) {
		listaChamados.set(chamado.getIdChamado(),chamado)
	}
	
	public void deletar(int idChamado) {
		listaChamados.remove(idChamado);
	}
	
	public List<Chamado> listar() {
		 return listaChamados;
	}

}
