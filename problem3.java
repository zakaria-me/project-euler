import java.math.BigInteger;
import java.util.LinkedList;

public class problem3 {

  public static void main(String[] args) {
    // tester si nombre prime
    problem3 program = new problem3();
    long currentPrimeNumber = 2L;
    long numberToSolve = 600851475143L;
    while (numberToSolve % currentPrimeNumber != 0) {
      currentPrimeNumber += 1;
      while (!program.isPrime(currentPrimeNumber)) {
        currentPrimeNumber += 1;
      }
    }
    LinkedList<Long> primeFactors = new LinkedList<Long>();
    // On commence la division par le premier nombre premier
    while (true) {
      long reste = numberToSolve % currentPrimeNumber;
      long quotient = numberToSolve / currentPrimeNumber;
      System.out.println(reste + " " + quotient);
      // Si le reste de la division est 0 et que le quotient vaut 1 alors la division
      // est termine
      if (reste == 0 && quotient == 1) {
        primeFactors.add(currentPrimeNumber);
        // print all prime factors
        for (Long longInteger : primeFactors) {
          System.out.println(longInteger);
        }
        break;
      } else {
        numberToSolve = numberToSolve / currentPrimeNumber;
        primeFactors.add(currentPrimeNumber);
        while (numberToSolve % currentPrimeNumber != 0) {
          currentPrimeNumber += 1;
          while (!program.isPrime(currentPrimeNumber)) {
            currentPrimeNumber += 1;
          }
        }
        System.out.println(numberToSolve + " " + currentPrimeNumber);
        // break;
      }
      // Sinon si
      // le quotient est different de 1 et que le reste est different de 0: on divise
      // le nombre par le prochain nombre premier
    }
  }

  public boolean isPrime(long number) {
    // All prime numbers except 2 and 3 can be expressed by 6n+1 or 6n-1
    if (number == 2 || number == 3) {
      return true;
    }
    if ((number - 1) % 6 == 0 || (number + 1) % 6 == 0) {
      return true;
    }
    return false;
  }
}
