import java.util.Scanner;

public class Jurnal03 {
    public static double volume(int jari_jari, int tinggi){
        double volume = 3.14159 * ((double) jari_jari * jari_jari) * tinggi;
        return volume;
    }
    public static void persentase(int tinggiAir, int jari_jari, int tinggi){
        double volume = volume(jari_jari, tinggi);
        double air = 3.14159 * ((double) jari_jari * jari_jari) * tinggiAir;
        double persentase =air / volume(jari_jari, tinggi) * 100;
        System.out.printf("%.2f %.2f %.1f%%", volume, air, persentase);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jari_jari = in.nextInt();
        int tinggi = in.nextInt();
        int tinggiAir = in.nextInt();;

        persentase(tinggiAir, jari_jari, tinggi);

    }
    
}