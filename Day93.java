public class Day93 {
    public static void main(String[] args) {
        int tinggipola = 6;
        for (int i = tinggipola; i >= 1; i--) {
            for (int j = 1; j <= 11; j++) {
                if (j == i || j == (12 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
