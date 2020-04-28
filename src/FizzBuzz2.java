public class FizzBuzz2 {
   public static void main(String[] args) {
      String outputStr = "";
      for (int i = 1; i <= 100; i++) {
         if (i%3==0) {
            outputStr = "Fizz";
            if (i%5 == 0) {
               outputStr = "FizzBuzz";
            }
            System.out.println(outputStr);
         } else if (i%5==0) {
            outputStr = "Buzz";
            if (i%3==0 ) {
               outputStr = "FizzBuzz";
            }
            System.out.println(outputStr);
         } else {
            outputStr = Integer.toString(i);
            System.out.println(outputStr);
         }
      }
   }
}
