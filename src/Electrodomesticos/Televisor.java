package Electrodomesticos;

public class Televisor extends Electrodomesticos{
	private int tamañoPantalla;
	 
    
    public Televisor(int tam, double pre, int consu, int pe) {
        super(pre, consu, pe);
        tamañoPantalla = tam;
    }
    @Override
    public void mostrar(){
        System.out.println("-------------------------------------");
        System.out.println("Tipo de Electrodomestico (2:Televisor)");
        System.out.println("Precio Base: " + getPrecioBase());
        System.out.println("Consumo Electrico: " + getConsumoElectrico());
        System.out.println("Peso: " + getPeso() + "Kg");
        System.out.println("Tamaño: " + tamañoPantalla + " Pulgadas");
        System.out.println("Precio final: " + precioFinal() + " Bs.S");
        System.out.println();
    }
 
    public double precioFinal(){
        
        double monto = super.precioFinal();
        
        if (tamañoPantalla >= 40 ) {
            monto += precioBase*0.3;
        }
        return monto;
    }
}

