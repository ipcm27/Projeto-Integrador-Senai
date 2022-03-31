package com.projeto.integrador.dao;
import java.util.ArrayList;
import java.util.List;
import com.projeto.integrador.model.Endereco;

public class EnderecoDAO {
	
	

			
			private static EnderecoDAO  instance;
			private List<Endereco> listaEnderecos = new ArrayList<>();
			
			public EnderecoDAO getInstance() {
				if (instance == null){
					instance = new EnderecoDAO();
				}
				return instance;
				
			}
			
			public void salvar(Endereco colaborador) {
				listaEnderecos.add(colaborador);
			}
			
			public void atualizar(Endereco endereco) {
				listaEnderecos.set(endereco.getId(),endereco);
			}
			
			public void deletar(int idEndereco) {
				listaEnderecos.remove(idEndereco);
			}
			
			public List<Endereco> listar() {
				 return listaEnderecos;
			}

		}



}
