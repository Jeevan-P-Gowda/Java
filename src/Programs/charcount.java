package Programs;

import java.util.HashMap;
import java.util.Map;

public class charcount {
    public static void count(String name) {
        char[] str = name.toCharArray();
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for (char value : str) {
            if (!String.valueOf(value).isBlank()) {
                hm.put(value,hm.getOrDefault(value,0)+1);
                /*if (hm.containsKey(value)) {
                    hm.put(value, hm.get(value) + 1);
                } else {
                    hm.put(value, 1);
                }*/
            }
        }
        System.out.println("The no of occurences of character in a string" + hm);
    }

    public static void main(String[] args) {
        count("TestVagrant is a good company");
    }
}

