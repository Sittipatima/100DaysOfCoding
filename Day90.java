public class day90 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Modal Awal Investasi : ");
        double modalinvest = in.nextDouble();
        System.out.println("Lama Investasi : ");
        int lamainvest = in.nextInt();
        double keuntunganinvest = 0.05;
        double modal = modalinvest;
        System.out.println("Kentungan setiap tahunnya : ");
        for(int tahun = 1; tahun <= lamainvest; tahun++){
            double keuntungan = modal*keuntunganinvest;
            modal+=keuntungan;
            System.out.printf("Tahun %d : Keuntungan = %.2f, Modal akhir =  %.2f\n", tahun, keuntungan, modal);
        }
            in.close();
    }
}
