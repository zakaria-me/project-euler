public class problem10 {
  public static void main(String[] args) {
    // number of primes: 148929
    // prime sum: 142913828922
    long primeSum = 17;
    int functionCalls = 0;
    for (long number = 10; number < 200; number++) {
      if (isPrime(number)) {
        primeSum += number;
        functionCalls++;
      }
    }
    System.out.println(functionCalls);
    System.out.println(primeSum);
  }

  public static boolean isPrime(long number) {
    long denominator = 2L;
    while (denominator != number) {
      if (number % denominator == 0) {
        return false;
      }
      denominator++;
    }
    // System.out.println(number);
    return true;
  }
}