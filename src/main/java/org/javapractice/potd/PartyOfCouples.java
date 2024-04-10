package org.javapractice.potd;


import java.util.HashMap;
import java.util.Map;

/*
*
* You are given an integer array arr[] of size n, representing n number of people in a party,
*  each person is denoted by an integer. Couples are represented by the same number ie:
* two people have the same integer value, it means they are a couple. Find out the only single person
* in the party of couples.
* NOTE: It is guarantee that there exist only one single person in the party.
*
 */
public class PartyOfCouples {

    static int findSingle(int n, int arr[]) {

        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count.containsKey(arr[i]))
                count.put(arr[i], count.getOrDefault(arr[i], 1) + 1);
            else
                count.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1 || entry.getValue() % 2 != 0)
                result = entry.getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,2,1,4,5,6,6,4,4}; //1 2 3 5 3 2 1 4 5 6 6 4 4
        System.out.println(findSingle(arr.length, arr));
    }
}
