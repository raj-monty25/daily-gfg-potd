package org.javapractice.potd;

public class SwitchNibbles {

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
