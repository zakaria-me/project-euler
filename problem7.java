public class problem7 {

  public static void main(String[] args) {
    int primeCount = 1;
    long prime = 2L;
    long number = 2L;
    for (; primeCount <= 10001; number++) {
      if (isPrime(number)) {
        primeCount++;
        prime = number;
      }
    }
    System.out.println(prime + " " + primeCount);
  }

  public static boolean isPrime(long number) {
    long denominator = 2L;
    while (denominator != number) {
      if (number % denominator == 0) {
        return false;
      }
      denominator++;
    }
    System.out.println(number);
    return true;
  }
}
