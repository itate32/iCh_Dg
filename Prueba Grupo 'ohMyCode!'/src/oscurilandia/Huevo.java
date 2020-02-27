package oscurilandia;
import java.util.Scanner;
import java.util.ArrayList;

public class Huevo {
	
	Scanner leer = new Scanner(System.in);
	ArrayList <Integer> coordenadasHuevos=new ArrayList<>();
	int coordenadaXIngresada;
	int coordenadaYIngresada;
	int punajeObtenido;
	String matriz[][] = new String[15][15];	
	
	public Huevo() {
		
	}
	
	public Huevo(int coordenadaXIngresada, int coordenadaYIngresada) {
		this.coordenadaXIngresada=coordenadaXIngresada;
		coordenadasHuevos.add(coordenadaXIngresada);
		this.coordenadaYIngresada=coordenadaYIngresada;
		coordenadasHuevos.add(coordenadaYIngresada);
		
		
	}

		
	public ArrayList<Integer> getCoordenadasHuevos() {
		return coordenadasHuevos;
	}

	public void setCoordenadasHuevos(ArrayList<Integer> coordenadasHuevos) {
		this.coordenadasHuevos = coordenadasHuevos;
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

	
}
