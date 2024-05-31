package org.javapractice.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCount {

    public static void count (String str) {
        Map<Character, Long> map = str.chars().mapToObj(a -> (char) a).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long maxCount = map.values().stream().max(Long::compareTo).orElse(0l);

        Map<Character, Long> mostRepeatedChar = map.entrySet().stream()
                //.filter(entry -> entry.getValue() == maxCount)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        mostRepeatedChar.forEach((character, count) -> System.out.println(character +" "+count));

        try {
            throw new  NullPointerException();
        } catch (NullPointerException n) {
            System.out.println("Null pointer");
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException x){

            System.out.println("Array index");

        }


    }
    public static void main(String[] args) {
        String str = "ishiiiiiiiiiitaaaaaa";
        count(str);
    }
}
