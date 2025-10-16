import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini

 Scanner Scanner = new Scanner(System.in);

        int p = Scanner.nextInt();
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();

        double na = (0.25 * p) + (0.35 * a) + (0.4 * b);
        System.out.printf("%.2f", na);  
        System.out.println("\n" + "Lulus MK: " + (na >= 75));  




    }
}
