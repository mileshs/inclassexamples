import java.math.BigInteger;
import java.util.ArrayList;
import java.util.*;

public class Main {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
       System.out.println(fib(2));
       System.out.println(isPalindrome("RacecaR"));
    }
    public static long fib(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        long result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
}