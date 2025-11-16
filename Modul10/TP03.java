import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini

          for (int angka = 2; angka <= 100; angka++) {

            if (adalahPrima(angka)) {
                System.out.print(angka + " ");
            }
        }
    }
 public static boolean adalahPrima(int n) {

        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}