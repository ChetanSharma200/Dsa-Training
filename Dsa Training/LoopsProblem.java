public class LoopsProblem {
  public static void main(String[] args) {

    // System.out.println(numberSwap(234768));
    // System.out.println(leapYear(2023));
    System.out.println(rotateNumber(123456, 2));
  }

  public static int rotateNumber(int number, int k) {
    int countDigit = (int) Math.log(number) + 1;
    k = k % countDigit;
    int power = (int) Math.pow(10, k);
    int rotatedvalue = number % power;
    // System.out.println(rotatedvalue);
    number = number / power;
    int countDigit2 = (int) Math.log10(number) + 1;
    int power2 = (int) Math.pow(10, countDigit2);
    number += rotatedvalue * power2;
    return number;
  }

  public static int numberSwap(int number) {
    int pow = (int) Math.log10(number) + 1;
    int power = (int) Math.pow(10, pow - 1);
    int first = number / power;
    number = number % power;
    int last = number % 10;
    number = number / 10;
    int power2 = (int) Math.pow(10, pow - 2);
    number += last * power2;
    number = number * 10 + first;

    return number;
  }

  public static boolean leapYear(int year) {
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
      return true;
    }
    return false;
  }
}
