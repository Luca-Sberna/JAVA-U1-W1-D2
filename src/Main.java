
public class Main {

	public static void main(String[] args) {
		// creazione di due oggetti Rettangolo
	    Rettangolo rettangolo1 = new Rettangolo(5, 10);
	    Rettangolo rettangolo2 = new Rettangolo(7, 3);

	    // stampa delle informazioni del primo rettangolo
	    System.out.println("Informazioni del primo rettangolo:");
	    Rettangolo.stampaRettangolo(rettangolo1);
	    System.out.println();

	    // stampa delle informazioni del secondo rettangolo
	    System.out.println("Informazioni del secondo rettangolo:");
	    Rettangolo.stampaRettangolo(rettangolo2);
	    System.out.println();

	    // stampa delle informazioni di entrambi i rettangoli e somma delle aree e dei perimetri
	    System.out.println("Informazioni dei due rettangoli:");
	    Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
	}
}