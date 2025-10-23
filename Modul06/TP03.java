import java.util.Scanner;
import java.text.DecimalFormat;

public class TP03 {

    public static double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    public static double kelilingPersegiPanjang(double p, double l) {
        return 2 * (p + l);
    }

    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double kelilingSegitiga(double alas, double tinggi) {
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + miring;
    }


    public static double luasLingkaran(double diameter) {
        double r = diameter / 2;
        return Math.PI * r * r;
    }

    public static double kelilingLingkaran(double diameter) {
        return Math.PI * diameter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bangun = input.nextLine().trim();

        double luas = 0, keliling = 0;
        boolean valid = true;

        if (bangun.equalsIgnoreCase("Persegi")) {
            double sisi = input.nextDouble();
            luas = luasPersegi(sisi);
            keliling = kelilingPersegi(sisi);

        } else if (bangun.equalsIgnoreCase("Persegi Panjang")) {
            double p = input.nextDouble();
            double l = input.nextDouble();
            luas = luasPersegiPanjang(p, l);
            keliling = kelilingPersegiPanjang(p, l);

        } else if (bangun.equalsIgnoreCase("Segitiga")) {
            double alas = input.nextDouble();
            double tinggi = input.nextDouble();
            luas = luasSegitiga(alas, tinggi);
            keliling = kelilingSegitiga(alas, tinggi);

        } else if (bangun.equalsIgnoreCase("Lingkaran")) {
            double diameter = input.nextDouble();
            luas = luasLingkaran(diameter);
            keliling = kelilingLingkaran(diameter);

        } else {
            System.out.println("Bangun datar tidak dikenali!");
            valid = false;
        }

        input.close();

        if (valid) {
            // Format angka untuk menghilangkan .00 di belakang
            DecimalFormat df = new DecimalFormat("#.##");
            String luasFormatted = df.format(luas);
            String kelilingFormatted = df.format(keliling);
            
            System.out.println(luasFormatted + " " + kelilingFormatted);
        }
    }
}