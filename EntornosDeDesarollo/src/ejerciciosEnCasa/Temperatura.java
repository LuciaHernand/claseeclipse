package ejerciciosEnCasa;
/**
 * 
 * @author lucia
 *
 */
 class ToleranciaException extends Exception {

	/**
	 * Exception que puede ocurrir.
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
 
 class TemperaturaException extends Exception {

	/**
	 *  Exception que puede ocurrir.
	 */
	private static final long serialVersionUID = 1L;
		
 }

public class Temperatura {

	private double gradosCelsius;
/**
 * Establece la Temperatura inicial en grados Celsius.
 */
	public Temperatura() {
		this.gradosCelsius = 25;
	}
	/**
	 * Constructor.
	 * @param gradosCelsius
	 */

	public Temperatura(double gradosCelsius) {
		this.gradosCelsius = gradosCelsius;
	}
/**
 * Este método transforma los grados Celsius  Farenheit.
 * @return (gradosCelsius * (9 / 5) + 32)
 */
	public double toFarenheit() {
		return (gradosCelsius * (9 / 5) + 32);
	}

	/**
	 * Calculo de la tolerancia.
	 * Si gradosCelsius no esta entre (-100,100), se lanzará una excepción de tipo TemperaturaException.
	 * 
	 * Si tolerancia > maxTolerancia, entonces se lanzará una excepción de tipo ToleranciaException.
	 * @param gradosCelsius
	 * @param maxTolerancia
	 * @return tolerancia*100
	 * @throws TemperaturaException
	 * @throws ToleranciaException
	 */
	
	public double porcentajeTolerancia(double gradosCelsius, double maxTolerancia)
			throws TemperaturaException, ToleranciaException {
		if (gradosCelsius < -100 || gradosCelsius > 100) {
			throw new TemperaturaException();
		}
		double tolerancia = this.gradosCelsius / gradosCelsius;
		if (tolerancia > maxTolerancia) {
			throw new ToleranciaException();
		}
		return tolerancia*100;
	}
}





