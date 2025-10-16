import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        char O = scanner.next().charAt(0);
        int B = scanner.nextInt();

        switch (O) { 
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                System.out.printf("%.7f%n", (double) A / B);
                break;
            default:
                System.out.println("Tanda operasi tidak valid");
        }
    }
}