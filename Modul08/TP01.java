import java.util.Scanner;
public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int amoeba = 30;
        int menit = 0;
        
        while (amoeba < n) {
            amoeba = amoeba * 2;
            menit = menit + 15;
        }
        
        System.out.println(menit);
        
        input.close();
    }
}