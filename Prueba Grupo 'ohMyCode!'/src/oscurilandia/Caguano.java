package oscurilandia;

import java.util.ArrayList;

public class Caguano extends Carro {

	int rango;
	String color;

	ArrayList <Integer> coordenadasMicrosC=new ArrayList<>();
	
	
	public Caguano() {
		
	}
//	public Caguano(int ocupantes, int ingreso, int coordy, int coordx, char tipoveh, int rango, String color) {
		public Caguano(int ocupantes, int ingreso,  char tipoveh, int rango, String color,int largocarro) {
//		super(ocupantes, ingreso, coordy, coordx, tipoveh);
		super(ocupantes, ingreso, tipoveh, largocarro);
		this.rango = rango;
		this.color = color;	
		}
	
	public int getRango() {
		return rango;
	}
	
	public String getColor() {
		return color;
	}

	public ArrayList<Integer> getCoordenadasMicrosC() {
		return coordenadasMicrosC;
	}

	public void setCoordenadasMicrosC(ArrayList<Integer> coordenadasMicrosC) {
		this.coordenadasMicrosC = coordenadasMicrosC;
	}

}
