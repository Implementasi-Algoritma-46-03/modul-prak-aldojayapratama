import java.util.Scanner;

public class Jurnal03 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        int prima = 1; 

        if (N <= 1) {
            prima = 0; 
        } else {
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    prima = 0; 
                    break;
                }
            }
        }
        if (prima == 1) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
}
