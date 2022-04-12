package com.projeto.integrador.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.projeto.integrador.model.Colaborador;
import com.projeto.integrador.util.ConnectionUtil;

public class ColaboradorDAO {

		
		private static ColaboradorDAO instance;
		private List<Colaborador> listaColaboradores = new ArrayList<>();
		private Connection connection = ConnectionUtil.getConnection();
		
		public static ColaboradorDAO getInstance() {
			if (instance == null){
				instance = new ColaboradorDAO();
			}
			return instance;
			
		}
		
		public void salvar(Colaborador colaborador) {
			listaColaboradores.add(colaborador);
			try {
			String sql = "insert into colaborador (id, nome,cpf,isHabilitado) values (?, ?, ?, ?);";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, colaborador.getId());
			pstmt.setString(2, colaborador.getNome());
			pstmt.setString(3, colaborador.getCpf());
			pstmt.setBoolean(4, colaborador.isHablitado());
			} catch (SQLException e){
				e.printStackTrace();
			
			}
		}
		
		public void atualizar(Colaborador colaborador) {
			listaColaboradores.set(colaborador.getId(),colaborador);
			try {
				String sql = "update colaborador set nome = ?, set isHabilitado = ? where id = ?";
				PreparedStatement pstmt = connection.prepareStatement(sql);
				
				pstmt.setString(1, colaborador.getNome());
				pstmt.setString(2, colaborador.getCpf());
				pstmt.setBoolean(3, colaborador.isHablitado());
				pstmt.setInt(4, colaborador.getId());
			} catch (SQLException e){
				e.printStackTrace();
			
			}
		}
		
		public void deletar(int idColaborador) {
			listaColaboradores.remove(idColaborador);
			try {
				String sql = "delete from colaborador where id = ?";
				PreparedStatement pstmt = connection.prepareStatement(sql);
				pstmt.setInt(1, idColaborador);
				pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public List<Colaborador> listar() {
			List<Colaborador> listaColaboradores= new ArrayList<>();
			 try {
					String sql = "select * from colaborador";
					Statement stmt = connection.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						Colaborador c = new Colaborador();
						c.setId(rs.getInt("id"));
						c.setNome(rs.getString("nome"));
						c.setCpf(rs.getString("cpf"));
					
						listaColaboradores.add(c);
					}
			 } catch (SQLException e) {
					e.printStackTrace();
				}
				return listaColaboradores;
				}
}
				

		

