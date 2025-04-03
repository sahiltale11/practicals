public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            String str = "sahil" ;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }

        try {
            int[] numbers = new int[5];
            numbers[10] = 100; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }

        try {
            String invalidNumber = "ABC123";
            int num = Integer.parseInt(invalidNumber); 
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }

        try {
            Object obj = new Integer(100);
            String strObj = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e);
        }
    }
}
