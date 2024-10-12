package Fatima;
import java.math.BigInteger;
public class Day41 {
    public static void main(String[] args) {
        //soal 1
        int angka = 150;
        String nama = Integer.toString(angka);
        int angkalagi = Integer.valueOf(nama);
        System.out.println("Hasil Konversi integer ke string :" + nama);
        System.out.println("Hasil konversi string kembali ke integer : "+angkalagi);
   
        //soal 2
        int intValue = 75;
        double doubleValue = intValue;
        System.out.println("nilai int :"+ intValue);
        System.out.println("nilai setelah typecasting ke double : "+ doubleValue);
        
        //soal 3
        BigInteger a = new BigInteger ("765578827667653335667");
        BigInteger b = new BigInteger ("5678876766555778875631112");
        BigInteger jumlah = a.add(b);
        BigInteger kali = a.multiply(b);
        System.out.println("Penjumlahan BigInteger : "+ jumlah);
        System.out.println("Perkalian BigInteger : "+ kali);
                
    }

}

import java.util.Scanner;
public class dayyy41 {
   //soal 4
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);  
     System.out.println("Masukkan panjang persegi panjang : ");  
     int panjang = input.nextInt();
     System.out.println("Masukkan lebar persegi panjang : ");
     int lebar = input.nextInt();
     double luas = panjang * lebar;
     double keliling = 2*(panjang + lebar);
     System.out.println("Luas Persegi panjang : "+ luas);
     System.out.println("keliling persegi panjang : " + keliling);
        
     //SOAL 5
        System.out.println("Masukkan berat badan : ");
     double bb = input.nextDouble();
        System.out.println("Masukkan tinggi badan : ");
     float tb = input.nextFloat();
     double bmi = (bb/tb *2);      
        System.out.println("Berat badan (kg) : "+ bb);
        System.out.println("Tinggi badan (meter) : "+tb);
        System.out.println("BMI Anda adalah : "+bmi);
    }
}


