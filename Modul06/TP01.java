import java.util.Scanner;

 public class TP01 {

    public static double toCelcius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    public static double toReamur(double f) {
        return (f - 32) * 4 / 9;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double R1 = input.nextDouble();
        double R2 = input.nextDouble();
        double R3 = input.nextDouble();
        
        double c1 = toCelcius(R1);
        double c2 = toCelcius(R2);
        double c3 = toCelcius(R3);
        
        double re1 = toReamur(R1);
        double re2 = toReamur(R2);
        double re3 = toReamur(R3);
        
        System.out.printf("%.2f %.2f %.2f\n", c1, c2, c3);
        System.out.printf("%.2f %.2f %.2f\n", re1, re2, re3);
    }
}