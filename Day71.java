class siswa{
    public static String pengenalan(String nama, int umur) {
        return nama + " berumur " + umur + " tahun";
    }
}

public class Day71 {
    
    public static void main(String[] args) {
        String namaku = "fatima";
        int usia = 19;
        System.out.println(siswa.pengenalan(namaku, usia));
    }
    
}
