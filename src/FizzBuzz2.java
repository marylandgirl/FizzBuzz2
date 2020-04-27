public class FizzBuzz2 {
   public static void main(String[] args) {
      String outputStr = "";
      for (int i = 1; i <= 100; i++) {
         if (i%3==0) {
            System.out.println("Fizz");
            if (i%5 == 0) {
               System.out.println("FizzBuzz" );
            }
         } else if (i%5==0) {
            System.out.println("Buzz");
            if (i%3==0 ) {
               System.out.println("FizzBuzz" );
            }
         } else {
            System.out.println(Integer.toString(i));
         }
      }
   }
}
