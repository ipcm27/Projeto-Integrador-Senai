package com.projeto.integrador.controller;

import java.util.List;

import com.projeto.integrador.dao.ChamadoDAO;
import com.projeto.integrador.dao.VeiculoDAO;
import com.projeto.integrador.model.Chamado;
import com.projeto.integrador.model.Veiculo;

public class VeiculoController {
	
	public void salvar(Veiculo veiculo) {
		VeiculoDAO.getInstance().salvar(veiculo);
	}
	
	public void atualizar (Veiculo veicuo) {
		
		VeiculoDAO.getInstance().atualizar(veicuo);
		
	}
	
	public void excluir(int idChamado) throws Exception {
		if (idChamado == 0) {
			throw new Exception();
		}
		VeiculoDAO.getInstance().deletar(idChamado);
		
	}
	
	public List <Veiculo> listar()	{
		return VeiculoDAO.getInstance().listar();
	}
	

}
