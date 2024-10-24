import java.util.Scanner;

public class ParkingTicketMachine {
    private int balance;      
    private int ticketPrice;  
    private int ticketTime;  

    public ParkingTicketMachine(int ticketPrice) {
        this.balance = 0;
        this.ticketPrice = ticketPrice;
        this.ticketTime = 0;
    }

    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Uang yang dimasukkan: Rp" + amount);
        } else {
            System.out.println("Nominal yang dimasukkan tidak valid.");
        }
    }

    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;
            balance -= ticketTime * ticketPrice;
            System.out.println("Tiket dikeluarkan. Anda membeli waktu parkir selama " + ticketTime + " jam.");
            System.out.println("Sisa uang: Rp" + balance);
        } else {
            System.out.println("Saldo tidak mencukupi. Masukkan lebih banyak uang.");
        }
    }

    public int getTimePurchased() {
        return ticketTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ParkingTicketMachine machine = new ParkingTicketMachine(5000);

        System.out.print("Masukkan jumlah uang yang ingin dimasukkan (dalam rupiah): Rp");
        int amount = scanner.nextInt();

        machine.insertMoney(amount);

        machine.issueTicket();

        System.out.println("Jam parkir yang dibeli: " + machine.getTimePurchased() + " jam");

        scanner.close();
    }
}
