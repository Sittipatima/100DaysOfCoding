import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Masukkan Status Pengguna (PNS atau Bukan) : ");
        String status = input.nextLine();
        System.out.println("Masukkan gaji pokok : ");
        long gaji = input.nextLong();
        long diskon = 0;
        if (gaji < 2000000 ){
            status = "PNS";
            diskon = 5*gaji/100;
            gaji -= diskon;
            System.out.println("anda mendapat diskon 5%");
        }
        if(gaji < 2000000){
           status = "Bukan";
            System.out.println("maaf anda tidak mendapat diskon");
        }else if (gaji >= 2000000 && gaji <=5000000){
            status = "PNS";
            diskon = 10*gaji/100;
            gaji -= diskon;
            System.out.println("anda mendapat diskon 10%");
        }
        if (gaji >= 2000000 && gaji <= 5000000){
            status = "Bukan";
            diskon = 5*gaji/100;
            gaji -= diskon;
            System.out.println("anda mendapat diskon 5%");
        }
        if(gaji > 5000000){
            status = "PNS";
            diskon = 12*gaji/100;
            gaji -= diskon;
            System.out.println("anda mendapat diskon 12%");
            
        }else if (gaji > 5000000){
            status = "Bukan";
            diskon = 7*gaji/100;
            gaji -= diskon;
            System.out.println("anda mendapat diskon 7%");
        }
        System.out.println("Total gaji bersih Anda : "+gaji);
    }
}
