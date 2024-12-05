import java.util.Scanner;
public class day95 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("\nSegitiga siku-siku:  ");
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nSegitiga Siku-Siku Terbalik:");
        for (int n= a; n>= 1; n--) {
            for (int i= 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
