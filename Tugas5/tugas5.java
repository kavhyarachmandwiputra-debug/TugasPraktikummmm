package TugasPraktikum.Tugas5;

public class tugas5 {
    public static void main(String[] args) {
        String[] karyawan = {"Andi", "Budi", "Citra", "Dina", "Eka"};

        System.out.println("=== Jadwal Shift Karyawan ===\n");

        int hari = 1;

        for (int i = 0; i < karyawan.length - 1; i++) {
            for (int j = i + 1; j < karyawan.length; j++) {
                System.out.println("Hari ke-" + hari + ": " + karyawan[i] + " dan " + karyawan[j]);
                hari++;
            }
        }
        System.out.println("\nTotal kombinasi pasangan: " + (hari - 1));
    }
}
