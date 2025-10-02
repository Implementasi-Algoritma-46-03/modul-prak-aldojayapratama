import java.util.Scanner;

public class TP03 {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int JumlahPermen = s.nextInt();
        int JumlahTemanDira = s.nextInt();

        int TotalOrang = JumlahTemanDira + 1; // plus dira

        int Jatah = JumlahPermen / TotalOrang;
        int Sisa = JumlahPermen % TotalOrang;

       
        System.out.println(Jatah);
        System.out.println(Sisa);

    }
}
