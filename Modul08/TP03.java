import java.util.Scanner;
public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int risoles;
        
        do {
            risoles = input.nextInt();
            total = total + risoles;
        } while (risoles != 0);
        
        System.out.println(total);
        
        input.close();
    }
}