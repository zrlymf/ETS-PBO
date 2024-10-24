public class SepedaMotor extends Kendaraan {
    String jenisMesin;

    // Konstruktor kelas turunan
    public SepedaMotor(int jumlahRoda, String bahanBakar, int kecepatanMaksimum, String jenisMesin) {
        super(jumlahRoda, bahanBakar, kecepatanMaksimum);  // Memanggil konstruktor kelas induk
        this.jenisMesin = jenisMesin;
    }

    // Method tambahan: menjaga keseimbangan
    public void keseimbangan() {
        System.out.println("Pengendara sepeda motor harus menjaga keseimbangan dengan hati-hati.");
    }

    // Menampilkan info sepeda motor
    public void infoSepedaMotor() {
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println("Jumlah Roda: " + jumlahRoda);
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaksimum + " km/jam");
    }
}
