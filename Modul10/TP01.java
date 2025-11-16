import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
      
        final int tinggi = 5;

        for (int baris = tinggi; baris >= 1; baris--) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}