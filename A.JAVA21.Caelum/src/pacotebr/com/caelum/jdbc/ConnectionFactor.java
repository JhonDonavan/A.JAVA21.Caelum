package pacotebr.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Metodo  getConnection para retornar uma nova conexão
public class ConnectionFactor {
	
	public Connection getConnection(){
		try{
			return  DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/TesteJDBC","postgres", "postgres");
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
		
	}
}
