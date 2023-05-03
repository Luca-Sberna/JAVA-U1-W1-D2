
public class Chiamata {
	//inizializzo attrib. istanza chiamate
    String numeroChiamato;
    int durata;
    //costruttore delle chiamate
    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }
    //metodi per recuperare il numero chiamato e la durata della chiamata
    public String getNumeroChiamato() {
        return this.numeroChiamato;
    }
    
    public int getDurata() {
        return this.durata;
    }
}
