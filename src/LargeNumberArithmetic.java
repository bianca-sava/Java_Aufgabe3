import java.util.ArrayList;
import java.util.List;
public class LargeNumberArithmetic {
    public List<Integer> add(List<Integer> num1, List<Integer> num2) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        int i = num1.size() - 1;
        int j = num2.size() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.get(i) : 0;
            int digit2 = (j >= 0) ? num2.get(j) : 0;

            int sum = digit1 + digit2 + carry;
            result.add(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        java.util.Collections.reverse(result);
        return result;
    }

    public List<Integer> subtract(List<Integer> num1, List<Integer> num2) {
        List<Integer> result = new ArrayList<>();
        int borrow = 0;
        int i = num1.size() - 1;
        int j = num2.size() - 1;

        while (i >= 0 || j >= 0) {
            int digit1 = (i >= 0) ? num1.get(i) : 0;
            int digit2 = (j >= 0) ? num2.get(j) : 0;

            int diff = digit1 - digit2 - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result.add(diff);
            i--;
            j--;
        }

        while (result.size() > 1 && result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }

        java.util.Collections.reverse(result);
        return result;
    }

    public List<Integer> multiply(List<Integer> num1, List<Integer> num2) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num1.size() + num2.size(); i++) {
            result.add(0);
        }

        for (int i = num1.size() - 1; i >= 0; i--) {
            for (int j = num2.size() - 1; j >= 0; j--) {
                int product = num1.get(i) * num2.get(j) + result.get(i + j + 1);
                result.set(i + j + 1, product % 10);
                result.set(i + j, result.get(i + j) + product / 10);
            }
        }

        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }

    public List<Integer> divide(List<Integer> num, int divisor) {
        List<Integer> result = new ArrayList<>();
        int remainder = 0;

        for (int digit : num) {
            remainder = remainder * 10 + digit;
            result.add(remainder / divisor);
            remainder = remainder % divisor;
        }

        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;

    }

}
