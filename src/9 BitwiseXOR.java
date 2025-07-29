
/*

  Decimal  | Binary
  0      =     0000
  1      =     0001
  2      =     0010
  3      =     0011
  4      =     0100
  5      =     0101
  6      =     0110
  7      =     0111
  8      =     1000
  9      =     1001
  10      =    1010
  11      =    1011
  12     =     1100
  13     =     1101
  14     =     1110
  15     =     1111

//Display Bitwise OR of two numbers

Ex . if given two numbers is 12 and 5

12 = 1100 , 5 = 0101

    1100
    0101
 --------------
    1001

result is     1001 = 9

 */

import java.util.Scanner;

class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first = input.nextInt();
        System.out.println("Enter the Second number : ");
        int second = input.nextInt();

        int result = first ^ second ;
        System.out.println("result of XOR operates is = " +result);
    }
}
