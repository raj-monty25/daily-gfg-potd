package org.javapractice.potd;

public class SwitchNibbles {

    /**
     * Given a number n, Your task is to swap the two nibbles and find the resulting number.
     *
     * A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte. For example,
     * the decimal number 150 is represented as 10010110 in an 8-bit byte. This byte can be divided into two nibbles: 1001 and 0110.
     *
     * Input: n = 100
     * Output: 70
     * Explanation: 100 in binary is 01100100, two nibbles are (0110) and (0100).
     * If we swap the two nibbles, we get 01000110 which is 70 in decimal.
     * @param n integer type
     * @return int
     */
    static int swapNibbles(int n) {
        // code here
        int firstNo = n % 16;
        int secondNo = n / 16;

        return firstNo * 16 + secondNo;
    }

    public static void main(String[] args) {
        System.out.println(swapNibbles(100));
    }
}
