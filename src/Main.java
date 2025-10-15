import java.util.List;

public class Main {
    public static void main(String[] args) {
         LargeNumberArithmetic largeNumberArithmetic = new LargeNumberArithmetic();
         List<Integer> num1 = List.of(1, 3, 0, 0, 0, 0, 0, 0, 0);
         List<Integer> num2 = List.of(8, 7, 0, 0, 0, 0, 0, 0, 0);
         System.out.println("Sum: " + largeNumberArithmetic.add(num1, num2));

         List<Integer> num3 = List.of(8, 3, 0, 0, 0, 0, 0, 0, 0);
         List<Integer> num4 = List.of(5, 4, 0, 0, 0, 0, 0, 0, 0);
         System.out.println("Difference: " + largeNumberArithmetic.subtract(num3, num4));

         List<Integer> num5 = List.of(2, 3, 6, 0, 0, 0, 0, 0, 0);
         System.out.println("Product: " + largeNumberArithmetic.multiply(num5, 2));
         System.out.println("Division: " + largeNumberArithmetic.divide(num5, 2));

    }
}