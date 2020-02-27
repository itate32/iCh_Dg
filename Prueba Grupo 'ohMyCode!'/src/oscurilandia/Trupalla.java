package oscurilandia;

import java.util.ArrayList;

public class Trupalla extends Carro {
	int armadura;
	String chofer;

	ArrayList <Integer> coordenadasMicrosT=new ArrayList<>();
	
	public Trupalla() {
		
	}
	
public ArrayList<Integer> getCoordenadasMicrosT() {
		return coordenadasMicrosT;
	}



	public void setCoordenadasMicrosT(ArrayList<Integer> coordenadasMicrosT) {
		this.coordenadasMicrosT = coordenadasMicrosT;
	}



		//	public Trupalla(int ocupantes, int ingreso, int coordy, int coordx, char tipoveh, int rango, String color, String chofer, int armadura) {
		public Trupalla(int ocupantes, int ingreso, char tipoveh, int rango, String color, String chofer, int armadura, int largocarro) {	
//		super(ocupantes, ingreso, coordy, coordx, tipoveh);
		super(ocupantes, ingreso,  tipoveh, largocarro);
		this.armadura = armadura;
		this.chofer = chofer;	
		}
		
		
	
	public int getArmadura() {
		return armadura;
	}
	
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	
	public String getChofer() {
		return chofer;
	}
	
	
}
