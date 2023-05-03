public class Main2 {
    public static void main(String[] args) {
        // Creazione di una nuova SIM con numero di telefono 1234567890
        Sim sim = new Sim(1234567890);

        // Aggiunta di  chiamate
        sim.aggiungiChiamata(10, "123456789");
        sim.aggiungiChiamata(15, "123456653");
        sim.aggiungiChiamata(19, "123456325");
        sim.aggiungiChiamata(1, "123456603");

        // Stampa dei dati della SIM
        sim.stampaDatiSim();
    }
}
