public class problem5 {

  public static void main(String[] args) {
    int result = 0;
    for (int i = 2520;; i++) {
      if (isDivisble(i)) {
        result = i;
        break;
      }
    }
    System.out.println(result);
  }

  public static boolean isDivisble(int number) {
    for (int i = 1; i < 21; i++) {
      if (number % i != 0) {
        return false;
      }
    }
    return true;
  }
}
