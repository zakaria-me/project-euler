package solutions;

public class problem4 {

  public static void main(String[] args) {
    int largestPalindrome = 0;
    for (int i = 999; i >= 100; i--) {
      for (int j = i; j >= 100; j--) {
        // Store the product somewhere so as to not recalculate the product each time we
        // need it.
        int product = i * j;
        if (problem4.isPalindrome(product) && (product) > largestPalindrome) {
          largestPalindrome = product;
        }
      }
    }
    System.out.println(largestPalindrome);
  }

  public static boolean isPalindrome(int number) {
    int reversedNumber = 0;
    int n = number;
    while (n != 0) {
      reversedNumber = 10 * reversedNumber + n % 10;
      n /= 10;
    }
    return number == reversedNumber;
  }
}
