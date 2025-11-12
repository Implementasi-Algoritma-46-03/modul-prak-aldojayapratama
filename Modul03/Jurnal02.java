import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner Scanner = new Scanner(System.in);

        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int c = Scanner.nextInt();

        double rataRata =  (a + b + c)/3.0;
        
        System.out.printf("Nilai rata-rata: %.2f", rataRata);
    }
}
