import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int n = scanner.nextInt();
        
        double sisa = r * Math.pow(0.5, n / 10.0);
        System.out.printf("%.3f\n", sisa);
    }
}