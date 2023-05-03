import java.util.ArrayList;

public class Sim {
	//inizializzo attrib. istanza delle sim
    int numeroTelefono;
    double credito;
    ArrayList<Chiamata> listaChiamate;
    //costruttore delle sim
    public Sim(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.listaChiamate = new ArrayList<Chiamata>();
    }
    //funzioni di stampa e aggiungi chiamata
    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito);
	    System.out.println();


        System.out.println("Ultime chiamate effettuate:");
        for (Chiamata chiamata : listaChiamate) {
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ", durata: " + chiamata.getDurata() + " minuti");
        }
    }

    
    public void aggiungiChiamata(int durata, String numeroChiamato) {
        Chiamata chiamata = new Chiamata(numeroChiamato, durata);
        listaChiamate.add(chiamata);

        // rimuove la prima chiamata se la lista supera le 5 chiamate
        if (listaChiamate.size() > 5) {
            listaChiamate.remove(0);
        }
    }

}


