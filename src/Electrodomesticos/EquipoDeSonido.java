package Electrodomesticos;

public class EquipoDeSonido extends Electrodomesticos {
       private double impedancia;
       
       public EquipoDeSonido(int tam, double pre, int consu, int pe, double imp) {
           super(pre, consu, pe);
           impedancia = imp;
       }

	@Override
	public void mostrar() {
		System.out.println("-------------------------------------");
        System.out.println("Tipo de Electrodomestico (4:Equipo de sonido)");
        System.out.println("Precio Base: " + getPrecioBase());
        System.out.println("Consumo Electrico: " + getConsumoElectrico());
        System.out.println("Peso: " + getPeso() + "Kg");
        System.out.println("Tamaño: " + impedancia + " Pulgadas");
        System.out.println("Precio final: " + precioFinal() + " Bs.S");
        System.out.println();
    }
    public double precioFinal(){
        
        double monto = super.precioFinal();
        
        if (impedancia >= 8 ) {
            monto += precioBase*0.5;
        }
        return monto;
    }
		
	}

