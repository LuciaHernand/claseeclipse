package modelo;

public class Alumno {
 private String apellido1;
 private String apellido2;
 private String nombre;
 private String dni;
 private String mail;
 
 public Alumno() {
		super();
		
	}
 public Alumno(String dni, String mail) {
	 this.dni = dni;
		this.mail = mail;
 }
 
public Alumno(String nombre, String apellido1, String apellido2, String dni, String mail) {
	super();
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.nombre = nombre;
	this.dni = dni;
	this.mail = mail;
}

public String getApellido1() {
	return apellido1;
}

public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}

public String getApellido2() {
	return apellido2;
}

public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

@Override
public String toString() {
	return "Alumno [apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", nombre=" + nombre + ", dni=" + dni
			+ ", mail=" + mail + "]";
}
 

 
}
