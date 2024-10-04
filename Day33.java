public class dayy33 {
    public static void main(String[] args) {
   
       //upcasting
        short shortValue = 80; 
        double doubleValue = shortValue;
        System.out.println (shortValue);
        System.out.println ("Setelah Upcasting : " +doubleValue);
        
        //downcasting
        doubleValue = 90.7;
        shortValue = (short) doubleValue;
        System.out.println(doubleValue);
        System.out.println("Setelah Downcasting : " +shortValue);
    }  
}
