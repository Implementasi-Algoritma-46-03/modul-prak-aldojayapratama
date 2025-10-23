import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner input = new Scanner(System.in);

        String nama1 = input.nextLine();
        String nama2 = input.nextLine();
        int waktu = input.nextInt();

        sapa (nama1, waktu);
        sapa (nama2, waktu);


    }
    private static void sapa (String nama,int hari){
        System.out.print("Halo, " + nama );
        if (hari >= 6 && hari <= 11 ) {
            System.out.println(". Selamat pagi.");
        }
        else if (hari >= 12 && hari <= 14 ) {
            System.out.println(". Selamat siang.");
        }
       else if (hari >= 15 && hari <= 17 ) {
            System.out.println(". Selamat sore.");
        }
        else if (hari >= 18 && hari <= 5 ) {
            System.out.println(". Selamat malam.");
        }
    }
}
