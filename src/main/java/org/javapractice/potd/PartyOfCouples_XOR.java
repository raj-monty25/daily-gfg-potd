package org.javapractice.potd;

/*
 * Optimozed solution of PartyOfCouples question
 */
public class PartyOfCouples_XOR {
    static int findSingle(int n, int arr[]) {
        int result = 0;
        for (int i : arr) {
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,2,1,4,5,6,6,4,4}; //1 2 3 5 3 2 1 4 5 6 6 4 4
        System.out.println(findSingle(arr.length, arr));
    }
}
