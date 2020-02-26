package control;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.EnlaceJDBC;
import modelo.Alumno;


public class AlumnosC {
	

	public static boolean insertarAlumno(Alumno a) throws SQLException {
				EnlaceJDBC enlace=new EnlaceJDBC();
				String sqlInsert = "INSERT INTO alumnos (id_alumno,nombre, apellido1, apellido2, dni, email) VALUES (14,'"+a.getNombre()+"','"+a.getApellido1()+"','"+a.getApellido2()+"','"+a.getDni()+"','"+a.getMail()+"')";
				System.out.println(sqlInsert);
				return(enlace.insertar(sqlInsert));
				
				//idAlumno++;
			//return true;
			
	}
	

}
