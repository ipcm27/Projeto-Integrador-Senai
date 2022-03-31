package com.projeto.integrador.controller;
import java.util.List;

import com.projeto.integrador.model.Chamado;
import com.projeto.integrador.dao.ChamadoDAO;

public class ChamadoController {
	
	public void salvar(Chamado chamado){
	
		ChamadoDAO.getInstance().salvar(chamado);
	}
	
	public void atualizar (Chamado chamado) {
		ChamadoDAO.getInstance().atualizar(chamado);
		
	}
	
	public void excluir(int idChamado) throws Exception {
		if (idChamado == 0) {
			throw new Exception();
		}
		ChamadoDAO.getInstance().deletar(idChamado);
		
	}
	
	public List <Chamado> listar()	{
		return ChamadoDAO.getInstance().listar();
	}
}
