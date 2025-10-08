package TugasPraktikum.Tugas1;

public class Tugas1A {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.println("Deret Fibonacci sampai 100:");
        System.out.print(a + " ");

        while (b <= 100) {
            System.out.print(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }    
}
