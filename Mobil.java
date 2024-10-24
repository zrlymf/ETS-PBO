public class Mobil extends Kendaraan {
    String tipeMobil;
    int jumlahPintu;

    // Konstruktor kelas turunan
    public Mobil(int jumlahRoda, String bahanBakar, int kecepatanMaksimum, String tipeMobil, int jumlahPintu) {
        super(jumlahRoda, bahanBakar, kecepatanMaksimum);  // Memanggil konstruktor kelas induk
        this.tipeMobil = tipeMobil;
        this.jumlahPintu = jumlahPintu;
    }

    // Method tambahan: memilih transmisi
    public void pilihTransmisi(String transmisi) {
        System.out.println("Mobil menggunakan transmisi " + transmisi + ".");
    }

    // Method tambahan: membuka jendela
    public void bukaJendela() {
        System.out.println("Jendela mobil dibuka.");
    }

    // Menampilkan info mobil
    public void infoMobil() {
        System.out.println("Tipe Mobil: " + tipeMobil);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jumlah Roda: " + jumlahRoda);
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaksimum + " km/jam");
    }
}
