package Electrodomesticos;

import java.util.Scanner;
 
public class Apoyo {
	
   

    private static final String impedancia = null;
	private static String tamanoft;
	//Creamos el menu de inicio:
    public static int menu() {
    	int opc = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1-Leer archivo Tienda");
        System.out.println("2-Mostrar Electrodomesticos");
        System.out.println("3-Terminar");
        System.out.print("Escoja una opcion: ");
        opc = teclado.nextInt();
     
         switch(opc) {
        
        case 1: {
        	System.out.println("-------------------------------------");
	        System.out.println("Tipo de Electrodomestico (1:Lavadora)");
	        System.out.println("Precio Base: " + getPrecioBase());
	        System.out.println("Consumo Electrico: " + getConsumoElectrico());
	        System.out.println("Peso: " + getPeso() + "Kg");
	        System.out.println("Carga: " + getcargaLavadora() + "Kg");
	        System.out.println("Precio final: " + precioFinal() + " Bs.S");
	        System.out.println();
	        break;
        	
        }
        
        case 2: {
        	
        	 System.out.println("-------------------------------------");
             System.out.println("Tipo de Electrodomestico (2:Televisor)");
             System.out.println("Precio Base: " + getPrecioBase());
             System.out.println("Consumo Electrico: " + getConsumoElectrico());
             System.out.println("Peso: " + getPeso() + "Kg");
             System.out.println("Tamaño: " + gettamañoPantalla() + " Pulgadas");
             System.out.println("Precio final: " + precioFinal() + " Bs.S");
             System.out.println();
        	
        }
        case 3:{
        	System.out.println("-------------------------------------");
            System.out.println("Tipo de Electrodomestico (3:Refrigeradora)");
            System.out.println("Precio Base: " + getPrecioBase());
            System.out.println("Consumo Electrico: " + getConsumoElectrico());
            System.out.println("Peso: " + getPeso() + "Kg");
            System.out.println("Tamaño: " + tamanoft + " Pulgadas");
            System.out.println("Precio final: " + precioFinal() + " Bs.S");
            System.out.println(); 	
        }        
        case 4:{
        	System.out.println("-------------------------------------");
            System.out.println("Tipo de Electrodomestico (4:Equipo de sonido)");
            System.out.println("Precio Base: " + getPrecioBase());
            System.out.println("Consumo Electrico: " + getConsumoElectrico());
            System.out.println("Peso: " + getPeso() + "Kg");
            System.out.println("Tamaño: " + impedancia + " Pulgadas");
            System.out.println("Precio final: " + precioFinal() + " Bs.S");
            System.out.println();
        	
        	
        	
        }
        }
        
         
        System.out.println("");
        return opc;
    	
    	
    	
                
    }

	private static String precioFinal() {
		
		return null;
	}

	private static String getPeso() {
		
		return null;
	}

	private static String getConsumoElectrico() {
		
		return null;
	}

	private static String getPrecioBase() {
		
		return null;
	}
	private static String getcargaLavadora() {
		
		return null;
	}
    private static String gettamañoPantalla() {
		
		return null;
	}
    
}
