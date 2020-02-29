package oopElectrodomesticos;
/**
 * 
 * @author Isaías Miranda
 *
 */
public class Television extends Electrodomesticos {
	

    public int resolucion;
    
    public boolean sintonizadorTDT;
    

	public static int resolucion_defecto=20;
	public static boolean SintonizadorTDT = false;
  

	public Television(){
       this(precioBase_Defecto, peso_Defecto, consumoEnergetico_Defecto, color_Defecto, resolucion_defecto, false);
   }
	

    public Television(double precioBase, double peso){
        this(precioBase, peso, consumoEnergetico_Defecto, color_Defecto, resolucion_defecto, false);
    }
    
    
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }


    public double precioFinal(){
        double plus=super.precioFinal();
  
        if (resolucion>40){
            plus+=PrecioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50.000;
        }
  
        return plus;
    }
}
