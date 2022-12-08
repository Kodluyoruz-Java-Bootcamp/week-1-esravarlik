import java.util.ArrayList;
import java.util.List;


public class Main {

    /**
     * In the numbers from 10 to 100, it adds the number
     * with itself until it finds the palindromic number.
     * Prints the number that produces the longest chain and chain from this sum.
     *
     * @return No return value.
     */

    public static void main(String[] args) {

        int maxChainLength = 0;
        int maxNumber = 0;
        List<Integer> maxChain = null;

        for (int i = 10; i < 100; i++) {
            ArrayList<Long> chain = new ArrayList();
            long result = turnItOver(i) + i;
            chain.add(result);

            while (!isPalindrome(result)) {
                result = turnItOver(result) + result;
                chain.add(result);
            }

            if (chain.size() > maxChainLength) {
                maxChainLength = chain.size();
                maxNumber = i;
                maxChain = new ArrayList(chain);
            }
        }

        System.out.println("Numbers that make up the chain: "
                + maxNumber + ", " + turnItOver(maxNumber));
        System.out.println("Longest chain length: " + maxChainLength
                + "\n" + "Longest chain: " + maxChain);

    }

    /**
     * Reverses a number and returns the inverse number.
     *
     * @param number relevant number
     * @return inverse value
     */

    public static long turnItOver(long number) {
        long result = 0;
        while (number > 0) {
            long numeral = number % 10;
            result = result * 10 + numeral;
            number /= 10;
        }
        return result;
    }

    /**
     * Finds if a value is a palindrome.
     *
     * @param number relevant number
     * @return boolean
     */

    public static boolean isPalindrome(long number) {
        String str = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);
    }
}