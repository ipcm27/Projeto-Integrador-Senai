package com.projeto.integrador.dao;
import java.util.ArrayList;
import java.util.List;

import com.projeto.integrador.model.Colaborador;

public class ColaboradorDAO {

		
		private static ColaboradorDAO instance;
		private List<Colaborador> listaColaboradores = new ArrayList<>();
		
		public ColaboradorDAO getInstance() {
			if (instance == null){
				instance = new ColaboradorDAO();
			}
			return instance;
			
		}
		
		public void salvar(Colaborador colaborador) {
			listaColaboradores.add(colaborador);
		}
		
		public void atualizar(Colaborador colaborador) {
			listaColaboradores.set(colaborador.getId(),colaborador);
		}
		
		public void deletar(int idColaborador) {
			listaColaboradores.remove(idColaborador);
		}
		
		public List<Colaborador> listar() {
			 return listaColaboradores;
		}

	}

