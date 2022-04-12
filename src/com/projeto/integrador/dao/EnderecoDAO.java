package com.projeto.integrador.dao;
import java.util.ArrayList;
import java.util.List;
import com.projeto.integrador.model.EnderecoAtendimento;

public class EnderecoDAO {
	
	

			
			private static EnderecoDAO  instance;
			private List<EnderecoAtendimento> listaEnderecos = new ArrayList<>();
			
			public static EnderecoDAO getInstance() {
				if (instance == null){
					instance = new EnderecoDAO();
				}
				return instance;
				
			}
			
			public void salvar(EnderecoAtendimento endereco) {
				listaEnderecos.add(endereco);
			}
			
			public void atualizar(EnderecoAtendimento endereco) {
				listaEnderecos.set(endereco.getId(),endereco);
			}
			
			public void deletar(int idEndereco) {
				listaEnderecos.remove(idEndereco);
			}
			
			public List<EnderecoAtendimento> listar() {
				 return listaEnderecos;
			}

}