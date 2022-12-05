package Electrodomesticos;

public class Refrigeradora extends Electrodomesticos {
	private int tamanoft;
	
	 public Refrigeradora(int tam, double pre, int consu, int pe, int pies) {
	        super(pre, consu, pe);
	        tamanoft = pies;
	    }

	@Override
	public void mostrar() {
		System.out.println("-------------------------------------");
        System.out.println("Tipo de Electrodomestico (3:Refrigeradora)");
        System.out.println("Precio Base: " + getPrecioBase());
        System.out.println("Consumo Electrico: " + getConsumoElectrico());
        System.out.println("Peso: " + getPeso() + "Kg");
        System.out.println("Tamaño: " + tamanoft + " Pulgadas");
        System.out.println("Precio final: " + precioFinal() + " Bs.S");
        System.out.println();
    }
    public double precioFinal(){
        
        double monto = super.precioFinal();
        
        if (tamanoft >= 10 ) {
            monto += precioBase*0.1;
        }
        return monto;
    }
		
	}


