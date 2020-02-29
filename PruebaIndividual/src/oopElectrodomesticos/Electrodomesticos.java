package oopElectrodomesticos;
/**
 * 
 * @author Isaías Miranda
 *
 */
public class Electrodomesticos {
	
	protected static double precioBase_Defecto=100.000;
    protected static String color_Defecto = "blanco";
    protected static char consumoEnergetico_Defecto='F';
    protected static double peso_Defecto=5;
    
    protected double PrecioBase;
    protected String Color;
    protected char ConsumoEnergetico;
    protected double Peso;
   

    public Electrodomesticos(){
        this(precioBase_Defecto, peso_Defecto, consumoEnergetico_Defecto, color_Defecto);
    }
    
    public Electrodomesticos(double precioBase, double peso){
        this(precioBase, peso, consumoEnergetico_Defecto, color_Defecto);
    }
    
    public Electrodomesticos(double precioBase, double peso, char consumoEnergetico, String color){
        this.PrecioBase=precioBase;
        this.Peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        identificaColor(color);
    }
    
    
    public double getPrecioBase() {
        return PrecioBase;
    }
    public String getColor() {
        return Color;
    }
    public char getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public double getPeso() {
        return Peso;
    }
    
   
    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            Electrodomesticos.consumoEnergetico_Defecto=consumoEnergetico;
        }else{
            Electrodomesticos.consumoEnergetico_Defecto=ConsumoEnergetico;
        }
          
    }

    
    public void identificaColor(String color){
   
        String Color[]={"AZUL", "GRIS", "BLANCO", "ROJO", "NEGRO"};
        boolean identificaColor=false;
  
        for(int i=0;i<Color.length && !identificaColor;i++){
              
            if(Color[i].equals(color)){
                identificaColor=true;
            }
              
        }
        
        if(identificaColor){
            this.Color=color;
        }else{
            this.Color=color_Defecto;
        }
          
          
    }
      
    public double precioFinal(){
        double plus=0;
        switch(ConsumoEnergetico){
            case 'A':
                plus+=100.000;
                break;
            case 'B':
                plus+=80.000;
                break;
            case 'C':
                plus+=60.000;
                break;
            case 'D':
                plus+=50.000;
                break;
            case 'E':
                plus+=30.000;
                break;
            case 'F':
                plus+=10.000;
                break;
        }
   
        if(Peso>=0 && Peso<19){
            plus+=10.000;
        }else if(Peso>=20 && Peso<=49){
            plus+=50.000;
        }else if(Peso>=50 && Peso<=79){
            plus+=80.000;
        }else if(Peso>=80){
            plus+=100.000;
        }
   
        return PrecioBase+plus;
    }
}