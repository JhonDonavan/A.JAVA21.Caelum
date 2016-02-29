package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.Connectionjdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDAO {

		private Connection connection;
		
		public FuncionarioDAO(){
			this.connection = new ConnectionFactory().getConnection();
		}
		
		public void adicionaFuncionario(Funcionario funcionario){
			String sql = "insert into funcionarios " +
							"(nome, usuario, senha)" +
							"values(?,?,?)";
			//preparar inserção no banco
			
			try{
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1,funcionario.getNome());
				stmt.setString(2, funcionario.getUsuario());
				stmt.setString(3, funcionario.getSenha());
				stmt.execute();
				stmt.close();
			} catch(SQLException e){
				throw new RuntimeException(e); 
			}
		}
		
		public void removeFuncionario(long remover){
			String sql = "delete from funcionarios  where id = ? ";
			
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setLong(1, remover);
				
				stmt.execute();
				stmt.close();
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
		}
		
		
}
