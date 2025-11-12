import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String kalimat = input.nextLine();
        input.close();

        String hasil = kalimat.replaceAll("[AEIOUaeiou]", "");

        System.out.println(hasil);
    }
}