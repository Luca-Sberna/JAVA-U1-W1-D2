
public class Rettangolo {
//inizializzo attributi di istanza del rettangolo
	double altezza;
	double larghezza;
	//COSTRUTTORE
	public Rettangolo (double altezza, double larghezza) {
		this.altezza=altezza;
		this.larghezza=larghezza;
	}
	//metodi get per accedere e set per modificare 
	 public double getAltezza() {
	        return altezza;
	    }

	    public void setAltezza(double altezza) {
	        this.altezza = altezza;
	    }

	    public double getLarghezza() {
	        return larghezza;
	    }

	    public void setLarghezza(double larghezza) {
	        this.larghezza = larghezza;
	    }

	    public double calcolaPerimetro() {
	        return 2 * (altezza + larghezza);
	    }

	    public double calcolaArea() {
	        return altezza * larghezza;
	    }
	    
	    
	    //funzioni statiche , possono essere chiamate direttamente
	    //dal main senza necessità di creare un istanza della classe
	    public static void stampaRettangolo(Rettangolo r) {
	        System.out.println("Rettangolo: altezza = " + r.getAltezza() + ", larghezza = " + r.getLarghezza());
	        System.out.println("Perimetro: " + r.calcolaPerimetro());
	        System.out.println("Area: " + r.calcolaArea());
	    }
	    
	    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
	        System.out.println("Rettangolo 1: altezza = " + r1.getAltezza() + ", larghezza = " + r1.getLarghezza());
	        System.out.println("Perimetro: " + r1.calcolaPerimetro());
	        System.out.println("Area: " + r1.calcolaArea());

	        System.out.println("Rettangolo 2: altezza = " + r2.getAltezza() + ", larghezza = " + r2.getLarghezza());
	        System.out.println("Perimetro: " + r2.calcolaPerimetro());
	        System.out.println("Area: " + r2.calcolaArea());
	        
		    System.out.println();

	        System.out.println("Somma delle aree: " + (r1.calcolaArea() + r2.calcolaArea()));
	        System.out.println("Somma dei perimetri: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
	    }
}
