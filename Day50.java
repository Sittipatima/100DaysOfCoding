package fatima;
import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Bulan lahir (1-12) = ");
    int bulan = input.nextInt();
        System.out.println("Masukkan Tanggal Lahir (1-31) = ");
    int tanggal = input.nextInt();
    
    if ((bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12) && (tanggal>=1 && tanggal <=31)) {
        
    }else if ((bulan==4 || bulan==6 || bulan==9 || bulan==11) && (tanggal >=1 && tanggal<=30)){
        
    }else if ((bulan==2) && (tanggal>=1 && tanggal <=28)){
        
    }else {
        System.out.println("Bulan atau tanggal tidak valid");
    }    
        String zodiak = "";
        switch (bulan){
            case 1:
                zodiak = (tanggal >=19)?"Capricorn" : "Aquarius";
                break;
            case 2:
                zodiak = (tanggal >=18)?"Aquarius" : "Pisces";
                break;
            case 3:
                zodiak = (tanggal >=20)?"Pisces" : "Aries";
                break;
            case 4:
                zodiak = (tanggal >=19)?"Aries" : "Taurus";
                break;
            case 5:
                zodiak = (tanggal >=20)?"Taurus" : "Gemini";
                break;
            case 6:
                zodiak = (tanggal >=20)?"Gemini" : "Cancer";
                break;
            case 7:
                zodiak = (tanggal >=22)?"Cancer" : "Leo";
                break;
            case 8:
                zodiak = (tanggal >=22)?"Leo" : "Virgo";
                break;
            case 9:
                zodiak = (tanggal >=22)?"Virgo" : "Libra";
                break;
            case 10:
                zodiak = (tanggal >=22)?"Libra" : "Scorpio";
                break;
            case 11:
                zodiak = (tanggal >=21)?"Scorpio" : "Sagitarius";
                break;
            case 12:
                zodiak = (tanggal >=21)?"Sagitarius" : "Capricorn";
                break;
            default:
                zodiak = "Bulan Tidak Valid.";
               return;   
        }
        System.out.println("Zodiak Anda adalah " + zodiak);
       
        input.close();
    }
}
