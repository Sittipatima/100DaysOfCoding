public class Day64 {
	public static void main(String[] args) {
	 loopfor:
	 for ( int a = 1; a < 5; a++){
	 	for (int b = 1;  b < 5; b++){
	 		if ( a == 3 && b == 3){
	 			break loopfor;
	 			}
	 			System.out.println("a : " + a + " b : "+b);
	 			}
	 			}
	 				
	}
}
