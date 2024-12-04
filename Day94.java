import java.util.Scanner;
public class day94 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = in.nextInt();
        for (int a = 1; a <= tinggi; a++) {
            for (int b  = 1; b <= tinggi - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * i - 1); c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
