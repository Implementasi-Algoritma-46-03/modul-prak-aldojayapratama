import java.util.Scanner;
public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka = input.nextInt();
        int balik = 0;
        
        while (angka > 0) {
            int digit = angka % 10;
            balik = balik * 10 + digit;
            angka = angka / 10;
        }
        
        System.out.println(balik);
        
        input.close();
    }
}
