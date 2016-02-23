package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import br.com.caelum.Connectionjdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDAO {
	private Connection connection;
	
		public ContatoDAO(){
			this.connection  = new ConnectionFactory().getConnection();
		}
		
		public void adiciona (Contato contato){
			String sql = "insert into contatos" +
					"(nome, email, endereco, dataNascimento)" + 
					"values (?,?,?,?)";
			try {
				//prepare statement para inserção
				PreparedStatement stmt = connection.prepareStatement(sql);
				//seta os valores
				stmt.setString(1, contato.getNome());
				stmt.setString(2, contato.getEmail());
				stmt.setString(3,contato.getEmail());
				stmt.setDate(4, new Date( 
						contato.getDataNascimento().getTimeInMillis())); 
				
				stmt.execute();
				stmt.close();
			} catch (SQLException e){
				throw new RuntimeException(e);
			}
		}
}
