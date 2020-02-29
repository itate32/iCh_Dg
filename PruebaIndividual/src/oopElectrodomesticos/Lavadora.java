package oopElectrodomesticos;
/**
 * 
 * @author Isaías Miranda
 *
 */
public class Lavadora extends Electrodomesticos {
	

	private int carga;


	private final static int carga_Defecto=5;


    public Lavadora(){
        this(precioBase_Defecto, peso_Defecto, consumoEnergetico_Defecto, color_Defecto, carga_Defecto);
    }
	

	public Lavadora (double precioBase, double peso){
        this(precioBase, peso, consumoEnergetico_Defecto, color_Defecto, carga_Defecto);
    }
	

    public Lavadora (double precioBase, double peso, char consumoEnergetico, String color, double carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=(int) carga;
    }
	

    public int getCarga() {
        return carga;
    }
	

    public double precioFinal(){

        double plus=super.precioFinal();
  

        if (carga>30){
            plus+=50.000;
        }
  
        return plus;
    }
}
