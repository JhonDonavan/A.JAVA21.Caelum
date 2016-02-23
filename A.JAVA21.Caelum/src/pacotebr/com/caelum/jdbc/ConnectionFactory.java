package pacotebr.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Metodo  getConnection para retornar uma nova conexão
public class ConnectionFactory {
	
	public Connection getConnection(){
		try{
			return  DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/A.JAVA21.Caelum","postgres", "postgres");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
		
	}
}
