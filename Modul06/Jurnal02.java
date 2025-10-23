import java.util.Scanner;

public class Jurnal02 {

public static char penganti(String text){
    int panjang = text.length();
    int sisa = panjang % 5;
    switch (sisa) {
        case 0: return 'A';
        case 1: return 'E';
        case 2: return 'I';
        case 3: return 'O';
        default: return 'U';
    }}
public static void ubahVokal(String text){
    char vokalBaru = penganti(text);
    String hasil = text.replaceAll("[AEIOU]", Character.toUpperCase(vokalBaru) + "");
    hasil = hasil.replaceAll("[aeiou]", Character.toLowerCase(vokalBaru) + "");
    System.out.println(hasil);

}

public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String text = in.nextLine();

    ubahVokal(text);
    }
}