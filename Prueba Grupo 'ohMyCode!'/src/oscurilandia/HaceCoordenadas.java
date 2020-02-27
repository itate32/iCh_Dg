package oscurilandia;

import java.util.ArrayList;

public class HaceCoordenadas {


	// metodo que  toma lista coordenadas y los agrupa en par
		public 	ArrayList<ArrayList<Integer>> haceCoorObjeto(ArrayList<Integer> listaentera){
			

			ArrayList<ArrayList<Integer>> listaexterna = new ArrayList<ArrayList<Integer>>();
			
			int j =0;
			
			
			for( int k =0; k<(listaentera.size()/2); k++) {
				int i= 0;
				ArrayList<Integer> listainterna = new ArrayList<Integer>();
				while( i<2) {
					listainterna.add(listaentera.get(j));
					j++;
					i++;
				}
				listaexterna.add(listainterna);
			}
			
			return listaexterna;
		}
		
		public void setCoordenadasCarro(ArrayList<Carro> carros, ArrayList<ArrayList<Integer>> listacoordenadas) {
			int k = 0;
			for ( int i = 0; i<carros.size(); i++) {
				int j = 0;
				ArrayList<ArrayList<Integer>> coordcarro= new ArrayList<ArrayList<Integer>>();
				while(j<carros.get(i).getLargocarro()) {
					coordcarro.add(listacoordenadas.get(k));
					j++;
					k++;
				}
				carros.get(i).setCoorcarro(coordcarro);
			}
		}
		
		public void haceCoordhuevo(int x, int y, Huevo huevo){
			ArrayList<Integer> coordhuevo = new ArrayList<Integer>();
			
			coordhuevo.add(x);
			coordhuevo.add(y);
			huevo.getCoordenadasHuevos().addAll(coordhuevo);
			
		}
		
		public boolean indicaCasillaVAcia(int x, int y, String tablero[][]  ) {
			if (tablero[x][y] == ""|| tablero[x][y] == "H" ) {
				return true;
			}else {
				return false;
			}		
		}
}
