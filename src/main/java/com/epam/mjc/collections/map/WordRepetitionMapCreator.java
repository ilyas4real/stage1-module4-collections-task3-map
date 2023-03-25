package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if (sentence == null || sentence.trim().isEmpty()) {
            return map;
        }
        String[] arr = sentence.toLowerCase().split(" ");
        for (String s : arr) {
            s = s.replaceAll("[^a-zA-Z]+$", "");
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }
}
