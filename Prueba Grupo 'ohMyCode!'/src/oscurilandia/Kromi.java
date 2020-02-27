package oscurilandia;

import java.util.ArrayList;

public class Kromi extends Carro {
	int anofab;
	String marca;	
	ArrayList <Integer> coordenadasMicrosK=new ArrayList<>();
	
	public Kromi() {
		
	}
	public Kromi(int ocupantes, int ingreso, char tipoveh, int largocarro, String string, int i) {
		super(ocupantes, ingreso, tipoveh, largocarro);
		// TODO Auto-generated constructor stub
	}

	public int getAnofab() {
		return anofab;
	}	
		
		public String getMarca() {
		return marca;
	}

		public ArrayList<Integer> getCoordenadasMicrosK() {
			return coordenadasMicrosK;
		}

		public void setCoordenadasMicrosK(ArrayList<Integer> coordenadasMicrosK) {
			this.coordenadasMicrosK = coordenadasMicrosK;
		}
		
}
