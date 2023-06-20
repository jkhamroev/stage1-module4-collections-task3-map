package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer temp = map.get(entry.getValue());
            if(temp != null && temp < entry.getKey()) {
                continue;
            }
            map.put(entry.getValue(), entry.getKey());
        }

        return map;
    }
}
