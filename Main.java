public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil(4, "Bensin", 200, "SUV", 4);
        System.out.println("=== Informasi Mobil ===");
        mobil1.infoMobil();
        mobil1.bergerak();
        mobil1.pilihTransmisi("otomatis");
        mobil1.bukaJendela();
        mobil1.berhenti();

        System.out.println();

        // Membuat objek Sepeda Motor
        SepedaMotor motor1 = new SepedaMotor(2, "Bensin", 150, "Empat Tak");
        System.out.println("=== Informasi Sepeda Motor ===");
        motor1.infoSepedaMotor();
        motor1.bergerak();
        motor1.keseimbangan();
        motor1.berhenti();
    }
}
