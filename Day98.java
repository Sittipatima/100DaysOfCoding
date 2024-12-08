public class day98 {
	public static void main(String[] args) {
	int x = 1;
	int y = 20;
	int total = 0;
	for ( int a = x; a <= y; a++){
		if (a % 2 == 0){
			total+=a;
			System.out.print(a+" ");
			}
			}
			System.out.println("");
			System.out.println("Total Penjumlahan bilangan genap dari x ke y =  "+ total);	
	}
}
