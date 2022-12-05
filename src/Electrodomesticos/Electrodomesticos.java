package Electrodomesticos;


	public abstract class Electrodomesticos {
	    
	    protected double precioBase;
	    protected int consumoElectrico;
	    protected int peso;
	 
	    
	    public Electrodomesticos(double pre, int consu, int pe) {
	        precioBase = pre;
	        consumoElectrico = consu;
	        peso = pe;
	    }
	    
	    public double getPrecioBase() {
	        return precioBase;
	    }
	 
	    public int getConsumoElectrico() {
	        return consumoElectrico;
	    }
	 
	    public int getPeso() {
	        return peso;
	    }
	  
	    public double precioFinal(){
	        
	        double monto = 0;
	        
	        switch (consumoElectrico) {
	            case 1:
	                monto += 100;
	                break;
	            case 2:
	                monto += 80;
	                break;
	            case 3:
	                monto += 60;
	                break;
	            case 4:
	                monto += 50;
	                break;
	        }
	        
	        if (peso >= 0 && peso <= 19) {
	            monto += 10;
	        } else if (peso == 20 && peso <= 49) {
	            monto += 50;
	        } else if (peso == 50 && peso <= 79) {
	            monto += 80;
	        }else if (peso > 79) {
	            monto += 100;
	        }
	        
	        return precioBase + monto;
	    }
	   
	    public abstract void mostrar();
	}


