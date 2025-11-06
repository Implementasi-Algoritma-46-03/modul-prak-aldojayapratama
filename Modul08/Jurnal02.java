import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int jumlahData = 0;
        
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            total += input;
            jumlahData++;
        }
        
        double rataRata = (double) total / jumlahData;
        System.out.printf("%.2f\n", rataRata);
    }
}