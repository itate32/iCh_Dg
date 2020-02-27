package oscurilandia;

import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {

	String [][] tablero= new String [15][15];
	Scanner leer = new Scanner(System.in);
	int longitud;
	int coordenadaX;
	int coordenadaY;
	int aux,aux2;
	int cantidadDeCarrosK=3,cantidadDeCarrosC=5,cantidadDeCarrosT=10;
	int coordenadaXIngresada;
	int coordenadaYIngresada;
	int puntajeTotal;
	int puntajeObtenido;
	int puntajeAdicional;
	int tamanoDeArreglo;
	boolean respuesta;
	String tipoDeCarro;		
	ArrayList <Integer> coordenadasMicrosK=new ArrayList<>();
	ArrayList <Integer> coordenadasMicrosC=new ArrayList<>();
	ArrayList <Integer> coordenadasMicrosT=new ArrayList<>();
	ArrayList <Integer> coordenadasHuevos=new ArrayList<>();
	
	Huevo h= new Huevo(coordenadaXIngresada,coordenadaYIngresada);
	Kromi k = new Kromi();
	Caguano c=new Caguano();
	Trupalla t=new Trupalla();
	
	int aux1=0;
	int aux3=0;
	int aux4=0;
	
	
	public Tablero() {
		// TODO Auto-generated constructor stub
	}

	public void crearTablero() {

		for (int i = 0;  i< tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {				
				tablero[i][j]="";
			}
		}
		
		tipoDeCarro="k";
		cantidadDeCarrosC=0;
		cantidadDeCarrosK=0;
		cantidadDeCarrosT=0;
				
		switch (tipoDeCarro) {
		case "k":			
			
			while(cantidadDeCarrosK<3) {
			
			aux=0;
			aux2=0;			
			while ( aux==0 ) {
				
				coordenadaX=(int) (Math.random()*15);
				coordenadaY=(int) (Math.random()*15);				

			if (tablero[coordenadaX][coordenadaY].equals("")) {		
					longitud=3;
					aux2=1;
					if(coordenadaX<13) {
						for (int i = coordenadaX+1; i < coordenadaX+longitud; i++) {			
							if (tablero[i][coordenadaY].equals("")) {
								aux2+=1;
						}
					}			
					if (aux2==3) {				
						tablero[coordenadaX][coordenadaY]="k";
						tablero[coordenadaX+1][coordenadaY]="k";
						tablero[coordenadaX+2][coordenadaY]="k";
						aux=1;
						cantidadDeCarrosK+=1;
						
						for (int i = 0; i < 3; i++) {
							coordenadasMicrosK.add(coordenadaX+i);
							coordenadasMicrosK.add(coordenadaY);
							
							
						}
						
						k.setCoordenadasMicrosK(coordenadasMicrosK);
					}
			}else {
				aux=0;
			}					
			}
			}
			}		
			
		case "c":			
			
			while(cantidadDeCarrosC<5) {
				aux=0;
				aux2=0;			
				while ( aux==0 ) {
				coordenadaX=(int) (Math.random()*15);
				coordenadaY=(int) (Math.random()*15);					
				
				if (tablero[coordenadaX][coordenadaY].equals("")) {			
					longitud=2;
					aux2=1;
					if(coordenadaY<14) {
						for (int i = coordenadaY+1; i < coordenadaY+longitud; i++) {				if (tablero[coordenadaX][i].equals("")) {
							aux2+=1;
						}
					}			
						if (aux2==2) {				
							tablero[coordenadaX][coordenadaY]="c";
							tablero[coordenadaX][coordenadaY+1]="c";
							aux=1;
							cantidadDeCarrosC+=1;				
						
								for (int i = 0; i < 2; i++) {
									coordenadasMicrosC.add(coordenadaX);
									coordenadasMicrosC.add(coordenadaY+i);
								}
								c.setCoordenadasMicrosC(coordenadasMicrosC);
						}
					}else {
						aux=0;
					}
					}
					}
					}		
		case "t":			
			
			while(cantidadDeCarrosT<10) {
				aux=0;
				aux2=0;			
				
				while ( aux==0 ) {
					coordenadaX=(int) (Math.random()*15);
					coordenadaY=(int) (Math.random()*15);					
					
					if (tablero[coordenadaX][coordenadaY].equals("")) {
						tablero[coordenadaX][coordenadaY]="t";
						aux=1;
						cantidadDeCarrosT+=1;						
						
						for (int i = 0; i < 1; i++) {
							coordenadasMicrosT.add(coordenadaX);
							coordenadasMicrosT.add(coordenadaY);
						}
						
						t.setCoordenadasMicrosT(coordenadasMicrosT);
					}
				}
			}			
			break;
		}
	}
	
	public void mostrarMatriz() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {	
				System.out.print(tablero[i][j]+",");
			}			System.out.println();		
		}
		
	}
	
	public void creaObjetos() {
		

//		System.out.println(coordenadasMicrosK);
//		System.out.println(coordenadasMicrosC);
//		System.out.println(coordenadasMicrosT);	
		HaceCoordenadas obj1 = new HaceCoordenadas();
		ArrayList<ArrayList<Integer>> coordenadaskromis = new ArrayList<ArrayList<Integer>>(obj1.haceCoorObjeto(coordenadasMicrosK)) ;
		ArrayList<ArrayList<Integer>> coordenadascaguanos = new ArrayList<ArrayList<Integer>>(obj1.haceCoorObjeto(coordenadasMicrosC)) ;
		ArrayList<ArrayList<Integer>> coordenadastrupallas = new ArrayList<ArrayList<Integer>>(obj1.haceCoorObjeto(coordenadasMicrosT)) ;
		
			
		
//		System.out.println(obj1.haceCoorObjeto(coordenadasMicrosK));
//		System.out.println(obj1.haceCoorObjeto(coordenadasMicrosC));
//		System.out.println(obj1.haceCoorObjeto(coordenadasMicrosT));
//		System.out.println("listas corrdenadas");
//		System.out.println(coordenadaskromis);
//		System.out.println(coordenadascaguanos);
//		System.out.println(coordenadastrupallas);
//		
		
		
		// creacion objetos
		
		Kromi K1 = new Kromi(5, 2002, 'K', 2001, "guanaquin", 3);
		Kromi K2 = new Kromi(6, 2003, 'K', 2002, "guanaquin", 3);
		Kromi K3 = new Kromi(7, 2004, 'K', 2004, "guanaquin", 3);
		Caguano C1 = new Caguano(5, 2004, 'C', 5, "rojo", 2);
		Caguano C2 = new Caguano(3, 2003, 'C', 3, "verde", 2);
		Caguano C3 = new Caguano(5, 1999, 'C', 7, "azul", 2);
		Caguano C4 = new Caguano(4, 1998, 'C', 10, "morado", 2);
		Caguano C5 = new Caguano(3, 2010, 'C', 2, "verde", 2);
	
		Trupalla T1 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		Trupalla T2 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		Trupalla T3 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		Trupalla T4 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		Trupalla T5 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		Trupalla T6 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		Trupalla T7 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		Trupalla T8 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		Trupalla T9 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		Trupalla T10 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100, 1);
		
		// creacion lista objetos
		
		ArrayList<Carro> kromilist = new ArrayList<Carro>();
		ArrayList<Carro> caguanolist = new ArrayList<Carro>();
		ArrayList<Carro> trupallalist = new ArrayList<Carro>();
		
		kromilist.add(K1);
		kromilist.add(K2);
		kromilist.add(K3);
		caguanolist.add(C1);
		caguanolist.add(C2);
		caguanolist.add(C3);
		caguanolist.add(C4);
		caguanolist.add(C5);
		trupallalist.add(T1);
		trupallalist.add(T2);
		trupallalist.add(T3);
		trupallalist.add(T4);
		trupallalist.add(T5);
		trupallalist.add(T6);
		trupallalist.add(T7);
		trupallalist.add(T8);
		trupallalist.add(T9);
		trupallalist.add(T10);
		
		obj1.setCoordenadasCarro(trupallalist, coordenadastrupallas);
		obj1.setCoordenadasCarro(caguanolist, coordenadascaguanos);
		obj1.setCoordenadasCarro(kromilist, coordenadaskromis);
		
//		System.out.println("listas corrdenadas kromi");
//		for (int i=0; i<kromilist.size();i++) {
//			System.out.println(kromilist.get(i).getCoorcarro());
//		}
//		System.out.println("listas corrdenadas caguano");
//		for (int i=0; i<caguanolist.size();i++) {
//			System.out.println(caguanolist.get(i).getCoorcarro());
//		}
//		System.out.println("listas corrdenadas trupalla");
//		for (int i=0; i<trupallalist.size();i++) {
//			System.out.println(trupallalist.get(i).getCoorcarro());
//		}
//		System.out.println(obj1.indicaCasillaVAcia(0, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(1, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(2, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(3, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(4, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(5, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(6, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(7, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(8, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(9, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(10, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(12, 0, tablero));
//		System.out.println(obj1.indicaCasillaVAcia(13, 0, tablero));
		
		
	}
	
	
	public void lanzarHuevo() {
		int aux=0;
		System.out.println(k.getCoordenadasMicrosK());
		System.out.println(coordenadasMicrosC);
		graficaUsuario gu=new graficaUsuario();
		gu.matrizUsuarioInicial();
		gu.mostrarMatrizUsuario();
		while (aux==0) {
			System.out.println("Por favor ingrese coordenada Vertical y Horizontal");
			coordenadaXIngresada=leer.nextInt();
			coordenadaYIngresada=leer.nextInt();
			gu.setCoordenadaXIngresada(coordenadaXIngresada);
			gu.setCoordenadaYIngresada(coordenadaYIngresada);
			gu.ingresarH(coordenadaXIngresada,coordenadaYIngresada);
			gu.mostrarMatrizUsuario();
			
			
			coordenadasHuevos.add(coordenadaXIngresada);
			coordenadasHuevos.add(coordenadaYIngresada);
			puntajeObtenido=calcularPuntaje();
			puntajeAdicional=puntajeAdicional();
			puntajeTotal=puntajeTotal+puntajeObtenido+puntajeAdicional;
			System.out.println("El puntaje obtenido es:" + puntajeObtenido);
			System.out.println("El puntaje adicional es:" + puntajeAdicional);
			System.out.println("El puntaje total es:" + puntajeTotal);
		}
	}
	
	
	public int calcularPuntaje() {
		if(tablero[getCoordenadaXIngresada()][getCoordenadaYIngresada()].equals("")) {
			System.out.println("No ha acertado!!");
			puntajeObtenido=0;
		}else {
			switch (tablero[getCoordenadaXIngresada()][getCoordenadaYIngresada()]) {
			case "k":
				System.out.println("HA ACERTADO A UN K");
				puntajeObtenido=3;
				if(coordenadasHuevos.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasHuevos.size();
					for (int i = 0; i < tamanoDeArreglo-2; i+=2) {
						if(coordenadasHuevos.get(i)==getCoordenadaXIngresada()&&coordenadasHuevos.get(i+1)==getCoordenadaYIngresada()) {
								System.out.println("Ya habías lanzado a este lugar");
								puntajeObtenido=puntajeObtenido-3;
								i=tamanoDeArreglo;
						}
					}
				}
				break;
			case "c":
				System.out.println("HA ACERTADO A UN C");
				puntajeObtenido=2;
				if(coordenadasHuevos.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasHuevos.size();
					for (int i = 0; i < tamanoDeArreglo-2; i+=2) {
						if(coordenadasHuevos.get(i)==getCoordenadaXIngresada()&&coordenadasHuevos.get(i+1)==getCoordenadaYIngresada()) {
								System.out.println("Ya habías lanzado a este lugar");
								puntajeObtenido=puntajeObtenido-2;
								i=tamanoDeArreglo;
						}
					}
				}
				break;
			case "t":
				System.out.println("HA ACERTADO A UN T");
				puntajeObtenido=1;
				if(coordenadasHuevos.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasHuevos.size();
					for (int i = 0; i < tamanoDeArreglo-2; i+=2) {
						if(coordenadasHuevos.get(i)==getCoordenadaXIngresada()&&coordenadasHuevos.get(i+1)==getCoordenadaYIngresada()) {
								System.out.println("Ya habías lanzado a este lugar");
								puntajeObtenido=puntajeObtenido-1;
								i=tamanoDeArreglo;
						}
					}
				}
				break;
			}
		}
		return puntajeObtenido;
	}
	
	public int puntajeAdicional() {
		System.out.println(coordenadasMicrosC);
		calcularPuntaje();
		if(puntajeObtenido!=0) {
			
			
			switch (tablero[getCoordenadaXIngresada()][getCoordenadaYIngresada()]) {
			case "k":
				
						
				ArrayList <Integer> coordenadasMicrosK1=new ArrayList<>();
				for (int i = 0; i < 6; i++) {
					coordenadasMicrosK1.add(coordenadasMicrosK.get(i));
				}
				ArrayList <Integer> coordenadasMicrosK2=new ArrayList<>();
				for (int i = 6; i < 12; i++) {
					coordenadasMicrosK2.add(coordenadasMicrosK.get(i));
				}
				ArrayList <Integer> coordenadasMicrosK3=new ArrayList<>();
				for (int i = 12; i < 18; i++) {
					coordenadasMicrosK3.add(coordenadasMicrosK.get(i));
				}
				
				
				if(coordenadasMicrosK1.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasMicrosK1.size();
					for (int i = 0; i < tamanoDeArreglo; i+=2) {
						if(coordenadasMicrosK1.get(i)==getCoordenadaXIngresada()&&coordenadasMicrosK1.get(i+1)==getCoordenadaYIngresada()) {
							aux1+=1;
							if(aux1==3) {
							puntajeAdicional=10;
							aux1=0;
							}	
						}
					}
					
					
				}
				
				if(coordenadasMicrosK2.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasMicrosK2.size();
					for (int i = 0; i < tamanoDeArreglo; i+=2) {
						if(coordenadasMicrosK2.get(i)==getCoordenadaXIngresada()&&coordenadasMicrosK2.get(i+1)==getCoordenadaYIngresada()) {
							aux3+=1;
							if(aux3==3) {
							puntajeAdicional=10;
							aux3=0;
							}	
						}
					}
					
					
				}
				
				if(coordenadasMicrosK3.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasMicrosK3.size();
					for (int i = 0; i < tamanoDeArreglo; i+=2) {
						if(coordenadasMicrosK3.get(i)==getCoordenadaXIngresada()&&coordenadasMicrosK3.get(i+1)==getCoordenadaYIngresada()) {
							aux3+=1;
							if(aux3==3) {
							puntajeAdicional=10;
							aux3=0;
							}	
						}
					}
					
					
				}
					
				
				
				break;

			case "c":

				ArrayList <Integer> coordenadasMicrosC1=new ArrayList<>();
				for (int i = 0; i < 4; i++) {
					coordenadasMicrosC1.add(coordenadasMicrosC.get(i));
				}
				ArrayList <Integer> coordenadasMicrosC2=new ArrayList<>();
				for (int i = 4; i < 8; i++) {
					coordenadasMicrosC2.add(coordenadasMicrosC.get(i));
				}
				ArrayList <Integer> coordenadasMicrosC3=new ArrayList<>();
				for (int i = 8; i < 12; i++) {
					coordenadasMicrosC3.add(coordenadasMicrosC.get(i));
				}
				ArrayList <Integer> coordenadasMicrosC4=new ArrayList<>();
				for (int i = 12; i < 16; i++) {
					coordenadasMicrosC4.add(coordenadasMicrosC.get(i));
				}
				ArrayList <Integer> coordenadasMicrosC5=new ArrayList<>();
				for (int i = 16; i < 20; i++) {
					coordenadasMicrosC5.add(coordenadasMicrosC.get(i));
				}
				
				
				if(coordenadasMicrosC1.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasMicrosC1.size();
					for (int i = 0; i < tamanoDeArreglo; i+=2) {
						if(coordenadasMicrosC1.get(i)==getCoordenadaXIngresada()&&coordenadasMicrosC1.get(i+1)==getCoordenadaYIngresada()) {
							aux1+=1;
							if(aux1==2) {
							puntajeAdicional=7;
							aux1=0;
							}	
						}
					}	
					
				}
				
				if(coordenadasMicrosC2.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasMicrosC2.size();
					for (int i = 0; i < tamanoDeArreglo; i+=2) {
						if(coordenadasMicrosC2.get(i)==getCoordenadaXIngresada()&&coordenadasMicrosC2.get(i+1)==getCoordenadaYIngresada()) {
							aux1+=1;
							if(aux1==2) {
							puntajeAdicional=7;
							aux1=0;
							}	
						}
					}	
					
				}
				
				if(coordenadasMicrosC3.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasMicrosC3.size();
					for (int i = 0; i < tamanoDeArreglo; i+=2) {
						if(coordenadasMicrosC3.get(i)==getCoordenadaXIngresada()&&coordenadasMicrosC3.get(i+1)==getCoordenadaYIngresada()) {
							aux1+=1;
							if(aux1==2) {
							puntajeAdicional=7;
							aux1=0;
							}	
						}
					}	
					
				}
				
				if(coordenadasMicrosC4.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasMicrosC4.size();
					for (int i = 0; i < tamanoDeArreglo; i+=2) {
						if(coordenadasMicrosC4.get(i)==getCoordenadaXIngresada()&&coordenadasMicrosC4.get(i+1)==getCoordenadaYIngresada()) {
							aux1+=1;
							if(aux1==2) {
							puntajeAdicional=7;
							aux1=0;
							}	
						}
					}	
					
				}
				
				if(coordenadasMicrosC5.contains(getCoordenadaXIngresada())) {
					tamanoDeArreglo=coordenadasMicrosC5.size();
					for (int i = 0; i < tamanoDeArreglo; i+=2) {
						if(coordenadasMicrosC5.get(i)==getCoordenadaXIngresada()&&coordenadasMicrosC5.get(i+1)==getCoordenadaYIngresada()) {
							aux1+=1;
							if(aux1==2) {
							puntajeAdicional=7;
							aux1=0;
							}	
						}
					}	
					
				}
				
				
				
				break;
			}
			
			
			
			
			
			
			
			
			
			
		}else {
			puntajeAdicional=0;
		}
		
		
		
		return puntajeAdicional;
		
		
	}
//	public boolean revisaPuntaje() {
//		
//		int x=1;
//		int y=2;
//		int ubicacion;
//		
//		if(coordenadasMicrosT.contains(x)) {
//			ubicacion=coordenadasMicrosT.indexOf(x);
//		}
//		
//		
//		return respuesta;
//	}

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
