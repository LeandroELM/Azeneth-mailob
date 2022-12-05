package Electrodomesticos;

public class Lavadora extends Electrodomesticos{
	 private int cargaLavadora = 5;
	 
	    
	    public Lavadora(int carLavadora, double pre, int consu, int pe) {
	        super(pre, consu, pe);
	        cargaLavadora = carLavadora;
	    }
	    @Override
	    public void mostrar(){
	        System.out.println("-------------------------------------");
	        System.out.println("Tipo de Electrodomestico (1:Lavadora)");
	        System.out.println("Precio Base: " + getPrecioBase());
	        System.out.println("Consumo Electrico: " + getConsumoElectrico());
	        System.out.println("Peso: " + getPeso() + "Kg");
	        System.out.println("Carga: " + cargaLavadora + "Kg");
	        System.out.println("Precio final: " + precioFinal() + " Bs.S");
	        System.out.println();
	    }
	   
	    public double precioFinal(){
	        
	        double monto = super.precioFinal();
	        
	        if (cargaLavadora > 30 ) {
	            monto += 50;
	        }
	        return monto;
	    }
	}

