package oscurilandia;

public class graficaUsuario {

	String matriz[][] = new String[15][15];	
	int coordenadaXIngresada, coordenadaYIngresada;
	
	public graficaUsuario() {
		// TODO Auto-generated constructor stub
	}
	public void matrizUsuarioInicial(){

		for (int l= 0; l<15; l++) {
			for(int m=0; m<15; m++) {
				matriz[l][m]="[•]";
		}
		}
		
	}

	public void ingresarH(int coordenadaXIngresada,int coordenadaYIngresada) {
		

		
		for (int l= 0; l<15; l++) {
			for(int m=0; m<15; m++) {
				
				if(matriz[coordenadaXIngresada][coordenadaYIngresada ]=="[•]"){
					
					matriz[coordenadaXIngresada][coordenadaYIngresada ]="[H]";
				}	
		}
		}
		
		
	}
		public void mostrarMatrizUsuario() {
		for (int i=0; i<15; i++) {
			for(int j=0; j<15; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		
		
	}
	
	

	public int getCoordenadaXIngresada() {
		return coordenadaXIngresada;
	}

	public void setCoordenadaXIngresada(int coordenadaXIngresada) {
		this.coordenadaXIngresada = coordenadaXIngresada;
	}

	public int getCoordenadaYIngresada() {
		return coordenadaYIngresada;
	}

	public void setCoordenadaYIngresada(int coordenadaYIngresada) {
		this.coordenadaYIngresada = coordenadaYIngresada;
	}

	public String[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}

	
}
