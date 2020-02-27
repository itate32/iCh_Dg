package oscurilandia;

import java.util.ArrayList;

public class Carro {

	
	public int ocupantes;
	public int ingreso;
	public int coordy;
	public int coordx;
	public char tipoveh;
	public ArrayList<ArrayList<Integer>> coorcarro;
	public int largocarro;
	
	public Carro(){
		
	}
	
		public Carro(int ocupantes, int ingreso, char tipoveh, int largocarro) {
		
		this.ocupantes = ocupantes;
		this.ingreso = ingreso;
		this.tipoveh = tipoveh;
		this.largocarro= largocarro;
		}
		
		

		public int getOcupantes() {
			return ocupantes;
		}

		public void setOcupantes(int ocupantes) {
			this.ocupantes = ocupantes;
		}

		public int getIngreso() {
			return ingreso;
		}

		public void setIngreso(int ingreso) {
			this.ingreso = ingreso;
		}

		public int getCoordy() {
			return coordy;
		}

		public void setCoordy(int coordy) {
			this.coordy = coordy;
		}

		public int getCoordx() {
			return coordx;
		}

		public void setCoordx(int coordx) {
			this.coordx = coordx;
		}

		public char getTipoveh() {
			return tipoveh;
		}

		public void setTipoveh(char tipoveh) {
			this.tipoveh = tipoveh;
		}

		public ArrayList<ArrayList<Integer>> getCoorcarro() {
			return coorcarro;
		}

		public void setCoorcarro(ArrayList<ArrayList<Integer>> coorcarro) {
			this.coorcarro = coorcarro;
		}

		public int getLargocarro() {
			return largocarro;
		}

		public void setLargocarro(int largocarro) {
			this.largocarro = largocarro;
		}	
		


}
