package com.projeto.integrador.controller;


import java.util.List;

import com.projeto.integrador.dao.ChamadoDAO;
import com.projeto.integrador.dao.EnderecoDAO;
import com.projeto.integrador.model.Chamado;
import com.projeto.integrador.model.Endereco;

public class EnderecoController {
	
	public void salvar(Endereco endereco) {
		EnderecoDAO.getInstance().salvar(endereco);
	}
	
	public void atualizar (Endereco endereco) {
		EnderecoDAO.getInstance().atualizar(endereco);
	}
	
	public void excluir(int idChamado) throws Exception {
		if (idChamado == 0) {
			throw new Exception();
		}
		EnderecoDAO.getInstance().deletar(idChamado);
		
	}
	
	public List <Endereco> listar()	{
		return EnderecoDAO.getInstance().listar();
	}
	

}
