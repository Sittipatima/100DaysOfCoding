import java.util.Scanner;
public class day97 {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan batas n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean prima = true;
            
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            
            if (prima) {
                System.out.println(i);
            }
        }
        
        in.close();
    }
}
