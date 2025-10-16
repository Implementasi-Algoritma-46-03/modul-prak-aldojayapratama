import java.util.Scanner;
public class Jurnal02 {

    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        String hari = inputScanner.next();
        int n = inputScanner.nextInt();

        String[] daftarhari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};

        int posisi = 0;

        switch(hari){
            case "Senin":
                posisi = 0;
                break;
            case "Selasa":
                posisi = 1;
                break;
            case "Rabu":
                posisi = 2;
                break;
            case "Kamis":
                posisi = 3;
                break;
            case "Jum'at":
                posisi = 4;
                break;
            case "Sabtu":
                posisi = 5;
                break;
            case "Minggu":
                posisi = 6;
                break;
            default:
                System.out.println("Hari tidak valid");
                return;
        }

        int hasil = (posisi + n) % 7;
        System.out.println(daftarhari[hasil]);
    }
}
