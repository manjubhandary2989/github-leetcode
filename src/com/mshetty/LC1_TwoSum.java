package com.mshetty;

import java.util.HashMap;
import java.util.Map;

public class LC1_TwoSum {
    public int[] twoSums(int[] num, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        int n=num.length;
        for(int i=0; i<n; i++){
            map.put(num[i], i);
        }

        for(int i=0; i<n; i++){
            int valueToFind = target - num[i];
            if(map.containsKey(valueToFind) && map.get(valueToFind) !=i ) {
                result[0] = i;
                result[1] = map.get(valueToFind);
            }
        }
        
        return result;
    }
}
