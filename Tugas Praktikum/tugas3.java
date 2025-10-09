package TugasPraktikum.Tugas3;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kapasitas = 10;

        System.out.print("Masukkan jumlah pasien yang datang: ");
        int jumlahPasien = input.nextInt();

        int pasienDilayani = 0;  // menghitung pasien yang sudah keluar antrean

        System.out.println("\n=== Simulasi Antrean Klinik ===");

        for (int i = 1; i <= jumlahPasien; i++) {
            if (i - pasienDilayani > kapasitas) {
                pasienDilayani++; // layani pasien pertama
                System.out.println("Antrean penuh! Pasien nomor " + pasienDilayani + " selesai dilayani.");
            }

            System.out.println("Pasien nomor " + i + " masuk antrean (total antrean: " + (i - pasienDilayani) + ")");
        }

        System.out.println("\nPasien yang masih dalam antrean:");
        for (int i = pasienDilayani + 1; i <= jumlahPasien; i++) {
            System.out.println("Pasien nomor " + i);
        }

        input.close();
    }
}