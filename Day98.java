import java.util.Scanner;
public class day98 {
	public static void main(String[] args) { 
	   Scanner in = new Scanner(System.in);
	System.out.println("Nilai x : ");
	int x = in.nextInt();
	System.out.println("Nilai y : ");
	int y = in.nextInt();
	int total = 0;
	for ( int a = x; a <= y; a++){
		if (a % 2 == 0){
			total+=a;
			if ( a == y ){
			System.out.print(a+" = ");
		}else {
			System.out.print(a + " + ");
		}
	    }
    	}
			System.out.print( total);	
	}
}
