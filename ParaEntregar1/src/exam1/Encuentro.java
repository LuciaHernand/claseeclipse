package exam1;

public class Encuentro implements Comparable<Encuentro>{
	
		String equipo1;
		String equipo2;
		String resultadoDescanso;
		String resultadoFinal;
		
		
		
		
		public Encuentro(String equipo1, String equipo2) {
			super();
			this.equipo1 = equipo1;
			this.equipo2 = equipo2;
		}

		public Encuentro(String equipo1, String equipo2, String resultadoDescanso, String resultadoFinal) {
			super();
			this.equipo1 = equipo1;
			this.equipo2 = equipo2;
			this.resultadoDescanso = resultadoDescanso;
			this.resultadoFinal = resultadoFinal;
		}
		public Encuentro() {
			// TODO Auto-generated constructor stub
		}

		public String getEquipo1() {
			return equipo1;
		}
		public void setEquipo1(String equipo1) {
			this.equipo1 = equipo1;
		}
		public String getEquipo2() {
			return equipo2;
		}
		public void setEquipo2(String equipo2) {
			this.equipo2 = equipo2;
		}
		public String getResultadoDescanso() {
			return resultadoDescanso;
		}
		public void setResultadoDescanso(String resultadoDescanso) {
			this.resultadoDescanso = resultadoDescanso;
		}
		public String getResultadoFinal() {
			return resultadoFinal;
		}
		public void setResultadoFinal(String resultadoFinal) {
			this.resultadoFinal = resultadoFinal;
		}
		@Override
		public String toString() {
			return "Encuentro [equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", resultadoDescanso=" + resultadoDescanso
					+ ", resultadoFinal=" + resultadoFinal + "]\n";
		}

		@Override
		public int compareTo(Encuentro e) {
			
		
			return this.resultadoFinal.compareTo(e.resultadoFinal);
				
			
		
		}
		
		

}
