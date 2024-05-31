package org.javapractice.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

   /*
   * Dodo dodd,  Race care
   *
    */

    public static boolean anagram(String s1, String s2) {

        char[] chr = s1.toCharArray();

        boolean result = false;
      //  HashSet<Character> set = new HashSet<>();

        Map<Character, Integer>  map = new HashMap<>(); //d = 2, o = 2

        Map<Character, Integer>  map1 = new HashMap<>();

        for (Character c : chr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : s2.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1); //d=3, o=1
        }

        //map.key == map1.key then check the values, it shpuld be equal

        for (Character c : chr) {
            if (map.containsKey(c) && map1.containsKey(c)) {
                if (map.get(c) == map1.get(c)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }

            }
        }

        return result;
    }

    /**
     * Map<String,Person> map = new HashMap<>();
     * map.put("g",new Person(5, 51, "EE"));
     * map.put("a",new Person(4,25,"DD"));
     * map.put("e",new Person(3, 44, "CC"));
     *
     * Id age name
     *
     * A,e,g
     *
     * 25,44,51
     */

    public static Map<String, Person> sortMap(Map<String, Person> map) {

      Map<String, Person> resultMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> n, LinkedHashMap::new));

        return resultMap;

    }

    public static void add(int a) {
        System.out.println(a+a);
    }

    public static void add(Double a) {
        System.out.println(a*a);
    }



    public static void main(String[] args) {
        System.out.println(anagram("peek", "keepp"));

        Map<String, Person> map = new HashMap<>();
        map.put("g", new Person(5, 51, "EE"));
        map.put("a", new Person(4, 25, "DD"));
        map.put("e", new Person(3, 44, "CC"));

        System.out.println(sortMap(map));
        add(5.6);
    }

}
