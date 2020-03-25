package control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import modelo.Carrera;
import modelo.DeCoches;
import modelo.Populares;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class MainEje1 {

	public static List<String> leerCsvEinsertarEnList(String rutaFicheroLeer) {
		List<String> listaFichero = new ArrayList<String>();
		BufferedReader br = null;
		Charset charset = StandardCharsets.UTF_8;
		final String splitBy = ";";

		try {
			br = new BufferedReader(new FileReader(rutaFicheroLeer, charset));
			String line = null;

			br.readLine();

			while ((line = br.readLine()) != null) {
				listaFichero.add(line);
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}

		return listaFichero;
	}

	public static List<Carrera> listaCarrerasGen(List<String> datos) {
		List<Carrera> carreras = new ArrayList<Carrera>();
		final String splitBy = ";";
		final String splitDateBy = "/";

		for (int i = 0; i < datos.size(); i++) {
			String[] datosSeparados = datos.get(i).split(splitBy);
			String[] fechaSeparada = datosSeparados[1].split(splitDateBy);

			Calendar fecha = Calendar.getInstance();
			fecha.set(Calendar.DAY_OF_MONTH, Integer.parseInt(fechaSeparada[0]));
			fecha.set(Calendar.MONTH, Integer.parseInt(fechaSeparada[1]) - 1);
			fecha.set(Calendar.YEAR, Integer.parseInt(fechaSeparada[2]));

			carreras.add(new Carrera(datosSeparados[0], fecha, datosSeparados[2]));
		}

		return carreras;
	}

	public static List<Carrera> listaCarrerasPorTipoGen(List<String> datos) {
		List<Carrera> lista = new ArrayList<Carrera>();
		final String splitBy = ";";
		final String splitDateBy = "/";
		final String splitModalityBy = "-";

		for (int i = 0; i < datos.size(); i++) {
			String[] datosSeparados = datos.get(i).split(splitBy);
			String[] fechaSeparada = datosSeparados[1].split(splitDateBy);
			List<String> modalidadesSeparadas = new ArrayList<String>(
					Arrays.asList(datosSeparados[4].split(splitModalityBy)));

			Calendar fecha = Calendar.getInstance();
			fecha.set(Calendar.DAY_OF_MONTH, Integer.parseInt(fechaSeparada[0]));
			fecha.set(Calendar.MONTH, Integer.parseInt(fechaSeparada[1]) - 1);
			fecha.set(Calendar.YEAR, Integer.parseInt(fechaSeparada[2]));

			if (datosSeparados[3].contentEquals("Popular")) {
				lista.add(new Populares(datosSeparados[0], fecha, datosSeparados[2], modalidadesSeparadas,
						datosSeparados[5]));
			} else if (datosSeparados[3].contentEquals("DeCoches")) {
				lista.add(new DeCoches(datosSeparados[0], fecha, datosSeparados[2], datosSeparados[4],
						datosSeparados[5]));
			}
		}

		return lista;
	}

	public static void escribirFicheroPlanning(List<Carrera> listaConDatos, String rutaFicheroEscribir) {
		BufferedWriter bw = null;
		Charset charset = StandardCharsets.UTF_8;
		GregorianCalendar fechaHoy = null;
		fechaHoy.getInstance();

		try {
			bw = new BufferedWriter(new FileWriter(rutaFicheroEscribir, charset));

			bw.write("----------------------LISTADO DE CARRERAS POPULARES----------------------");
			bw.write("\n\n");
			bw.write("FECHA:\t\t\tNOMBRE:\t\t\t\t\t\t\t\t\t\tLUGAR:\n");

			for (int i = 0; i < listaConDatos.size(); i++) {
				if (listaConDatos.get(i) instanceof Populares) {
					bw.write(listaConDatos.get(i).getFecha().get(Calendar.DAY_OF_MONTH) + "/"
							+ listaConDatos.get(i).getFecha().get(Calendar.MONTH) + "/"
							+ listaConDatos.get(i).getFecha().get(Calendar.YEAR) + "\t\t"
							+ listaConDatos.get(i).getNombre() + "\t\t\t\t\t\t\t\t\t\t"
							+ listaConDatos.get(i).getLugar() + "\n");
				}
			}

			bw.write("\n\n");
			bw.write("Listado generado el dia: " + fechaHoy);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}

	public static void leerListaCarreras(List<Carrera> lista) {
		for (Carrera a : lista) {
			System.out.println(a);
		}
	}
	
	public static void leerListaStrings(List<String> lista) {
		for (String s: lista) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// Apartado 2
		List<String> listaFichero = leerCsvEinsertarEnList("files/carreras.csv");
		leerListaStrings(listaFichero);
		
		// Apartado 3
		List<Carrera> carreras = listaCarrerasGen(listaFichero);
		leerListaCarreras(carreras);
		
		// Apartado 4
		List<Carrera> listaCarrerasEsp = listaCarrerasPorTipoGen(listaFichero);
		leerListaCarreras(listaCarrerasEsp);
		
		/* Apartado 5 (El compareTo es correcto, sin embargo, una de las carreras
		   DeCoches sale separada del resto las cuales estan organizadas)*/
		Collections.sort(listaCarrerasEsp);
		leerListaCarreras(listaCarrerasEsp);
		
		// Apartado 6
		escribirFicheroPlanning(listaCarrerasEsp, "files/IPopulares.txt");

	}

}
