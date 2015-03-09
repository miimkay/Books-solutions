/*Write programs that read a sequence of integer inputs and print
    a.  The smallest and largest of the inputs.
    b.  The number of even and odd inputs.
    c.  Cumulative totals. For example, if the input is 1 7 2 9, the program should print
    1 8 10 19.
    d.  All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
    program should print 3 5 6.*/

import java.util.Scanner;

public class P4_02D {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter Number Sequence(q to quit): ");
    double input = in.nextDouble();
    while (in.hasNextDouble()) {
      double prev = input;
      input = in.nextDouble();
      if (input == prev) {
        while (input == prev && in.hasNextDouble()) {
          prev = input;
          input = in.nextDouble();
        }
        System.out.print(prev + " ");
      }
    }
  }
}
