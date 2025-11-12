import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner aldo = new Scanner(System.in);
        int n = aldo.nextInt();

        int jumlahlembar1000 = n / 1000;
        int sisa = n % 1000;

        System.out.println(jumlahlembar1000);
        System.out.println(sisa);

      

    }
}