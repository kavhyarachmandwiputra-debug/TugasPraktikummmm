package TugasPraktikum.Tugas2;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Cetak bilangan genap dari 1 sampai N\n2. Hitung jumlah angka dari 1 sampai N\n3. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                System.out.print("Masukkan nilai N: ");
                int n1 = input.nextInt();
                System.out.println("Bilangan genap dari 1 sampai " + n1 + ": ");
                    for (int i = 1; i <= n1; i++) {
            if (i % 2 == 0) {
                System.out.print(i +  " ");
            }
        }
                    break;
                    case 2:
                    System.out.print("Masukkan nilai N: ");
                    int n2 = input.nextInt();
                    int jumlah = 0;
                    for (int i = 1; i <= n2; i++) {
                        jumlah += i;
                    }
                    System.out.println("Jumlah angka dari 1 sampai " + n2 + " adalah: " + jumlah);
                    break;
                    case 3:
                    System.out.println("Program Selesai");
                    break;
                default:
                System.out.println("Input tidak valid!\nSilahkan pilih menu (1-3): ");
                break;
            }
        } while (menu != 3);
        input.close();
    }
    
}
