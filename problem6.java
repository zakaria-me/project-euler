public class problem6 {

  public static void main(String[] args) {
    long sumOfSquares = 1L;
    long squareOfSum = 1L;
    for (int number = 2; number <= 100; number++) {
      sumOfSquares += (number * number);
      squareOfSum += number;
      System.out.println(number);
    }
    System.out.println(sumOfSquares + " " + squareOfSum);
    squareOfSum = squareOfSum * squareOfSum;
    long difference = Math.abs(sumOfSquares - squareOfSum);
    System.out.println(difference);
  }
}