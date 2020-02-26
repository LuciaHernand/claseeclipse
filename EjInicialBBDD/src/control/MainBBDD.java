package control;


import java.sql.SQLException;
import dao.EnlaceJDBC;
import modelo.Alumno;


public class MainBBDD {
	
	static EnlaceJDBC enlace;
	
	
	
	
	//Principal de control general
	public static void main(String[] args) {
		Alumno a=new Alumno("Pepe","Gomez","Pérez","55884335C","perico@gmail.com");
		
		try {
			//Inserción de un nuevo Alumno
			
			if (AlumnosC.insertarAlumno(a)) {
				System.out.println("Registro insertado correctamente");
			}
		
		
		} catch (SQLException e1) {
			
			e1.printStackTrace();
	
		}		
		
	}

}
