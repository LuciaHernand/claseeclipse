package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Alumno;



public class EnlaceJDBC {
	//private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/progra20";
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	
	private Conexion unaConexion;
	private Connection connection;
	
	public EnlaceJDBC () throws SQLException {
		
		unaConexion = new Conexion(URL, USUARIO, CLAVE);
	}

	@SuppressWarnings("finally")
	
	public boolean insertar(String sqlInsert) throws SQLException {
		
		unaConexion.conectar();
		connection = unaConexion.getJdbcConnection();
		Statement statement = connection.createStatement();
		
		
		//Ejecutamos la sentencia
		boolean rowInserted = statement.executeUpdate(sqlInsert) > 0;
		statement.close();
		unaConexion.desconectar();
		return rowInserted;
	}
	
	public ResultSet seleccionRegistros(String consultaSQL) {
		Statement sentencia = null;
		ResultSet filas = null;
		
		try {
			unaConexion.conectar();
			connection = unaConexion.getJdbcConnection();
			sentencia = connection.createStatement();
			filas = sentencia.executeQuery(consultaSQL);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
		
	}
	
	
}