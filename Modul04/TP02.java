import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PERSENTASE_DISKON = 0.05;
        final int MINIMAL_TRANSAKSI_DISKON = 200000;
        final double PERSENTASE_PPN = 0.11;

        int N = input.nextInt();

        double jumlahDiskon = 0;

        if (N > MINIMAL_TRANSAKSI_DISKON) {
            jumlahDiskon = N * PERSENTASE_DISKON;
        }

        double totalSetelahDiskon = N - jumlahDiskon;
        double pajakPpn = totalSetelahDiskon * PERSENTASE_PPN;
        double totalDibayar = totalSetelahDiskon + pajakPpn;

        System.out.println("Transaksi = " + N);
        System.out.println("Total = " + totalSetelahDiskon);
        System.out.println("Ppn 11% = " + pajakPpn);
        System.out.println("Total dibayar = " + totalDibayar);

        input.close();
    }
}
