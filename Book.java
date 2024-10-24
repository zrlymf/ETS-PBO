import java.util.Scanner;

public class Book {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategoriBuku;

    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategoriBuku) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategoriBuku = kategoriBuku;
    }

    public void printDetails() {
        System.out.println("\nDetail Buku:");
        System.out.println("Judul Buku      : " + this.judul);
        System.out.println("Penulis         : " + this.penulis);
        System.out.println("Tahun Terbit    : " + this.tahunTerbit);
        System.out.println("Nama Penerbit   : " + this.namaPenerbit);
        System.out.println("Kategori Buku   : " + this.kategoriBuku);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();

        System.out.print("Masukkan penulis buku: ");
        String penulis = input.nextLine();

        System.out.print("Masukkan tahun terbit buku: ");
        int tahunTerbit = input.nextInt();
        input.nextLine(); 

        System.out.print("Masukkan nama penerbit buku: ");
        String namaPenerbit = input.nextLine();

        System.out.print("Masukkan kategori buku: ");
        String kategoriBuku = input.nextLine();

        Book bukuBaru = new Book(judul, penulis, tahunTerbit, namaPenerbit, kategoriBuku);

        bukuBaru.printDetails();

        input.close();
    }
}

