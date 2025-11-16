import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini

    Scanner input = new Scanner(System.in);
        int ukuran = input.nextInt();

        for (int baris = 1; baris <= ukuran; baris++) {
            for (int kolom = 1; kolom <= ukuran; kolom++) {

                if (baris == kolom || baris + kolom == ukuran + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        input.close();
    }
}