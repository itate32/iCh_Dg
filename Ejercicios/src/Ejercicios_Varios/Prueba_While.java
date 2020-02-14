package Ejercicios_Varios;
//Mismo mensaje enumerado de mayor a menor.
import java.util.*;

public class Prueba_While {

	public static void main(String[] args) {
		System.out.print("Ingrese un número");
		try {
			
			Scanner var1 = new Scanner (System.in);
			int lavariable = var1.nextInt();
					while (lavariable > 0)
					{
						System.out.println(lavariable+" Puedes hacerlo !");
						
						lavariable--;
					}
		}
		catch(Exception w) {
			System.out.println("error " + w.toString());
		}
	}

}
