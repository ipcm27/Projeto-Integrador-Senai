package com.projeto.integrador.dao;
import java.util.ArrayList;
import java.util.List;
import com.projeto.integrador.model.Veiculo;

public class VeiculoDAO {
	
				
				private static VeiculoDAO  instance;
				private List<Veiculo> listaVeiculos = new ArrayList<>();
				
				public static VeiculoDAO getInstance() {
					if (instance == null){
						instance = new VeiculoDAO();
					}
					return instance;
					
				}
				
				public void salvar(Veiculo veiculo) {
					listaVeiculos.add(veiculo);
				}
				
				public void atualizar(Veiculo veiculo) {
					listaVeiculos.set(veiculo.getId(),veiculo);
				}
				
				public void deletar(int idVeiculo) {
					listaVeiculos.remove(idVeiculo);
				}
				
				public List<Veiculo> listar() {
					 return listaVeiculos;
				}


	}

