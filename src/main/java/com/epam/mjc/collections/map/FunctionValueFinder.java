package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        if ((requiredValue - 2) % 5 != 0) {
            return false;
        }
        return functionMap.containsKey((requiredValue - 2) / 5);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();
        for (Integer integer : sourceList) {
            functionMap.put(integer, func(integer));
        }
        return functionMap;
    }

    private int func(int x) {
        return 5 * x + 2;
    }
}
