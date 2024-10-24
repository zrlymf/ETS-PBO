public class Kendaraan {
    int jumlahRoda;
    String bahanBakar;
    int kecepatanMaksimum;

    // Konstruktor
    public Kendaraan(int jumlahRoda, String bahanBakar, int kecepatanMaksimum) {
        this.jumlahRoda = jumlahRoda;
        this.bahanBakar = bahanBakar;
        this.kecepatanMaksimum = kecepatanMaksimum;
    }

    // Method untuk kendaraan bergerak
    public void bergerak() {
        System.out.println("Kendaraan bergerak dengan kecepatan maksimal " + kecepatanMaksimum + " km/jam.");
    }

    // Method untuk kendaraan berhenti
    public void berhenti() {
        System.out.println("Kendaraan berhenti.");
    }
}
