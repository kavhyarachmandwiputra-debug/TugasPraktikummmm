package TugasPraktikum.Tugas4;
import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pinBenar = "123456";   
        int maksPercobaan = 3;
        int percobaan = 0;

        while (percobaan < maksPercobaan) {
            System.out.print("Masukkan PIN 6 digit: ");
            String pin = input.nextLine();

            boolean valid = true;

            if (pin.length() != 6) {
                valid = false;
            } else {
                for (int i = 0; i < pin.length(); i++) {
                    if (!Character.isDigit(pin.charAt(i))) {
                        valid = false;
                        break;
                    }
                }
            }

            if (!valid) {
                System.out.println("Input tidak valid! PIN harus berupa 6 digit angka.\n");
                continue;
            }

            if (pin.equals(pinBenar)) {
                System.out.println("\nSelamat datang! Transaksi dapat dilanjutkan.");
                input.close();
                return;
            } else {
                percobaan++;
                if (percobaan < maksPercobaan) {
                    System.out.println("PIN salah. Sisa percobaan: " + (maksPercobaan - percobaan) + "\n");
                }
            }
        }

        System.out.println("\nKartu diblokir. Silakan hubungi bank.");
        input.close();
    }
}