package TugasPraktikum.Tugas1;
import java.util.Scanner;

public class Tugas1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 1;
        
        System.out.print("Masukkan Batas bawah: ");
        int batasBawah = input.nextInt();

        System.out.print("Masukkan Batas atas: ");
        int batasAtas = input.nextInt();

        System.out.println("\nDeret Fibonacci dari " + batasBawah + " sampai " + batasAtas + " : ");

        while (a <= batasAtas) { 
            if (a >= batasBawah) {
                System.out.print(a + " ");
            }
            int c = a + b;
            a = b;
            b = c;
        }
    }
    
}
