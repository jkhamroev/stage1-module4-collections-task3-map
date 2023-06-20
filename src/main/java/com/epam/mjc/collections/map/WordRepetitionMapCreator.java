package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split("[, .]");
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        for (String word : words) {
            if (!word.isBlank()) {
                String w = word.toLowerCase();
                wordRepetitionMap.put(w, wordRepetitionMap.getOrDefault(w, 0) + 1);
            }
        }

        return wordRepetitionMap;
    }
}
