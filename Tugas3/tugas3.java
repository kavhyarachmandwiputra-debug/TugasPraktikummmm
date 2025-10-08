package TugasPraktikum.Tugas3;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kapasitasMaks = 10;
        int[] antrean = new int[kapasitasMaks];
        int jumlahDalamAntrean = 0;

        System.out.print("Masukkan jumlah pasien yang datang: ");
        int jumlahPasien = input.nextInt();

        System.out.println("\n--- Simulasi Antrean Klinik ---");

        for (int i = 1; i <= jumlahPasien; i++) {
            if (jumlahDalamAntrean == kapasitasMaks) {
                System.out.println("Antrian penuh. Pasien nomor " + antrean[0] + " telah dilayani.");

                for (int j = 0; j < jumlahDalamAntrean - 1; j++) {
                    antrean[j] = antrean[j + 1];
                }

                jumlahDalamAntrean--;
            }

            antrean[jumlahDalamAntrean] = i;
            jumlahDalamAntrean++;

            System.out.println("Pasien nomor " + i + " masuk ke antrean. (Total antrean: " + jumlahDalamAntrean + ")");
        }

        System.out.println("\nPasien yang masih dalam antrean:");
        for (int i = 0; i < jumlahDalamAntrean; i++) {
            System.out.print(antrean[i] + " ");
        }

        input.close();
    }
}


