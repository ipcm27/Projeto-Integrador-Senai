package com.projeto.integrador.controller;

import java.util.List;

import com.projeto.integrador.dao.ChamadoDAO;
import com.projeto.integrador.dao.ColaboradorDAO;
import com.projeto.integrador.model.Colaborador;


public class ColaboradorController {
	
	public void salvar(Colaborador colaborador) {
		ColaboradorDAO.getInstance().salvar(colaborador);
	}
	
	public void atualizar (Colaborador colaborador) {
		ColaboradorDAO.getInstance().atualizar(colaborador);
		
	}
	
	public void excluir(int idChamado) throws Exception {
		if (idChamado == 0) {
			throw new Exception();
		}
		ColaboradorDAO.getInstance().deletar(idChamado);
		
	}
	
	public List <Colaborador> listar()	{
		return ColaboradorDAO.getInstance().listar();
	}
	

}
