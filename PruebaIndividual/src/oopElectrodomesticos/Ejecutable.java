package oopElectrodomesticos;

import java.text.NumberFormat;
import java.util.Locale;
/**
 * 
 * @author Isaías Miranda
 *
 */

public class Ejecutable {
		 
	    public static void main(String[] args) {
	   

	        Electrodomesticos ArregloElectrodomesticos[]= new Electrodomesticos[11];
	   

	        ArregloElectrodomesticos[0]=new Electrodomesticos();
	        ArregloElectrodomesticos[1]=new Lavadora(289990, 80);
	        ArregloElectrodomesticos[2]=new Lavadora(140990, 160, 'X', "Azul", 70);
	        ArregloElectrodomesticos[3]=new Lavadora(209990, 200, 'A', "verde", 15);
	        ArregloElectrodomesticos[4]=new Television(169990, 60, 'C', "Rojo", 32, true);
	        ArregloElectrodomesticos[5]=new Television(389990, 27, 'E', "Negro", 65, false);
	        ArregloElectrodomesticos[6]=new Television(189990, 12, 'B', "Café", 43, false);
	        ArregloElectrodomesticos[7]=new Television(229990, 15, 'C', "Gris", 55, true);
	        ArregloElectrodomesticos[8]=new Electrodomesticos(39990, 9, 'B', "Morado");
	        ArregloElectrodomesticos[9]=new Electrodomesticos(47990, 6, 'Y', "gris");
	        ArregloElectrodomesticos[10]=new Electrodomesticos(39990, 10, 'A', "Rosado");
	        
	        Locale moneda = new Locale ("es", "cl");
	        NumberFormat formatomoneda = NumberFormat.getCurrencyInstance(moneda);

	        
	   

	        int sumaElectrodomesticos=0;
	        int sumaTelevisiones=0;
	        int sumaLavadoras=0;
	   

	        for(int i=0;i<ArregloElectrodomesticos.length;i++){
	        	
	            if(ArregloElectrodomesticos[i] instanceof Electrodomesticos){
	                sumaElectrodomesticos+=ArregloElectrodomesticos[i].precioFinal();
	            }
	            if(ArregloElectrodomesticos[i] instanceof Lavadora){
	                sumaLavadoras+=ArregloElectrodomesticos[i].precioFinal();
	            }
	            if(ArregloElectrodomesticos[i] instanceof Television){
	                sumaTelevisiones+=ArregloElectrodomesticos[i].precioFinal();
	            }
	        }
	        

	        System.out.println("********************************************************");
	        System.out.println("*** FELICITACIONES, USTED ES UN SER MUY CONSUMISTA ! ***");
	        System.out.println("********************************************************");
	        System.out.println("");
	        System.out.println("En electrodomésticos un monto de : " + formatomoneda.format(sumaElectrodomesticos).replace("Ch",""));
	        System.out.println("En Lavadoras un monto de: " + formatomoneda.format(sumaLavadoras).replace("Ch",""));
	        System.out.println("En Televisores un monto de: " + formatomoneda.format (sumaTelevisiones).replace("Ch",""));
	        System.out.println("");
	        System.out.println("El total que usted ha gastado la compras de electrodomésticos, lavadoras y televisores es: ");
	        System.out.println("");
	        //REPLACE se utiliza para eliminar caracteres que no queremos que aparezcan
	        System.out.println("TOTAL: " + formatomoneda.format(sumaElectrodomesticos + sumaLavadoras + sumaTelevisiones).replace("Ch",""));
	        
	    }
	   
	}