public class Day72 {
    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
      public static void main(String[] args) {
        int angka = 8;
        int hasil = faktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }
}
