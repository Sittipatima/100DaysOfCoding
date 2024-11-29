import java.util.Scanner;
public class Day89 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa (maksimal 10): ");
        int jumlahsiswa = in.nextInt();
        if (jumlahsiswa > 10) {
            System.out.println("Jumlah siswa maksimal 10!");
            jumlahsiswa = 10; 
        }
        String[] namasiswa = new String[jumlahsiswa];
        scanner.nextLine(); 
        for (int i = 0; i < jumlahsiswa; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            namasiswa[i] = in.nextLine();
        }
        System.out.println("\nDaftar nama siswa:");
        for (int i = 0; i < jumlahsiswa; i++) {
            System.out.println((i + 1) + ". " + namasiswa[i]);
        }
        scanner.close();
    }
}

