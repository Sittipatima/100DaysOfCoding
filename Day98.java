public class day98 {
	public static void main(String[] args) {
	int x = 1;
	int y = 20;
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
