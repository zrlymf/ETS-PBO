import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrder {
    private ArrayList<String> menuItems; 
    private double totalPrice;           
    private boolean isPaid;             

    public FoodOrder() {
        menuItems = new ArrayList<String>();
        totalPrice = 0.0;
        isPaid = false;
    }

    public void addItem(String item, double price) {
        menuItems.add(item);
        totalPrice += price;
        System.out.println(item + " ditambahkan ke pesanan. Harga: Rp" + price);
    }

    public void removeItem(String item) {
        if (menuItems.contains(item)) {
            menuItems.remove(item);
            System.out.println(item + " dihapus dari pesanan.");
        } else {
            System.out.println(item + " tidak ditemukan dalam pesanan.");
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println("Pesanan sudah dibayar. Total: Rp" + totalPrice);
        } else {
            System.out.println("Pesanan sudah pernah dibayar.");
        }
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void displayOrder() {
        System.out.println("Daftar pesanan:");
        for (String item : menuItems) {
            System.out.println("- " + item);
        }
        System.out.println("Total harga: Rp" + totalPrice);
        System.out.println("Status pembayaran: " + (isPaid ? "Sudah dibayar" : "Belum dibayar"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodOrder order = new FoodOrder();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nPilih aksi:");
            System.out.println("1. Tambah item ke pesanan");
            System.out.println("2. Hapus item dari pesanan");
            System.out.println("3. Tampilkan pesanan");
            System.out.println("4. Lakukan pembayaran");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama item: ");
                    String item = scanner.nextLine();
                    System.out.print("Masukkan harga item: Rp");
                    double price = scanner.nextDouble();
                    order.addItem(item, price);
                    break;

                case 2:
                    System.out.print("Masukkan nama item yang ingin dihapus: ");
                    String itemToRemove = scanner.nextLine();
                    order.removeItem(itemToRemove);
                    break;

                case 3:
                    order.displayOrder();
                    break;

                case 4:
                    order.pay();
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
