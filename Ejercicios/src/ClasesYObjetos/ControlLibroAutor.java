package ClasesYObjetos;

import java.util.Scanner;

public class ControlLibroAutor {
	public static void main(String[] args) {
		
		Libro1 l1=new Libro1("Sombras","12/06/1998", 126);
	    /*Libro1 l2=new Libro1("Hola","18/09/2000",536);
	    *Libro1 l3=new Libro1("Tom�s","29/04/2001",646);*/
		
		/*System.out.println(l1.toString());
		
		*/Scanner scan=new Scanner(System.in);/*
		Libro1 l2=new Libro1();
		System.out.println("Dime el t�tulo del libro");
		l2.setTitulo(scan.nextLine());
        System.out.println("Dime la fecha de edici�n");
        l2.setFeedicion(scan.next());
        System.out.println("Dime el n�mero de p�ginas");
        l2.setnPaginas(scan.nextInt());
        
        System.out.println("T�tulo del libro:"+l2.getTitulo()+"\nEditado:"+l2.getFeedicion()+"\nTama�o:"+l2.getnPaginas());
*/
        Autor1 varA1=new Autor1();
        String apellido1 = "",apellido2 = "",nombre = "";
        System.out.println("Dime el nombre del autor");
        String autor=scan.nextLine();
      
        int i=0;
        while(autor.charAt(i)!=' ') {nombre=nombre+autor.charAt(i);i++;}i++;
        while(autor.charAt(i)!=' ') {
        	apellido1=apellido1+ autor.charAt(i);
        	i++; }
        i++;
        while(autor.charAt(i)!=' ') {apellido2=apellido2+autor.charAt(i);i++;}
        
       
        
       System.out.println( varA1.toString());
        
        
        scan.close();
}

}
