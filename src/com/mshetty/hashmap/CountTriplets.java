package com.mshetty.hashmap;

import java.util.*;

public class CountTriplets {
    public static void main(String[] args) {
    //    List<Long> arr = new ArrayList(Arrays.asList((long)1,(long) 5,(long) 5,(long) 25, (long)125));
        List<Long> arr = new ArrayList(Arrays.asList((long)1,(long) 1,(long) 1,(long) 1, (long)1));

//        arr.add(1);
//        arr.add(5);
//        arr.add((long) 5);
        long result = countTriplets(arr, 1);
        System.out.println(result);
    }

    public static long countTriplets(List<Long> arr, long r) {
        int start = 0;
        int counter = 0;
        int n=arr.size();

        Map<Long, Integer> map = new HashMap<>();
        for(long l:arr){
            if(map.containsKey(l)){
                int freq = map.get(l);
                map.put(l, freq+1);
            } else {
                map.put(l, 1);
            }
        }

        System.out.println(map.get((long)1));

        while(start < n){
            long val = arr.get(start) * r;
            int freq1=0; int freq2=0;
            if(map.containsKey(val)){
                freq1 = map.get(val);
                val =  val*r;
                if(map.containsKey(val)){
                    freq2 = map.get(val);
                    counter += freq1*freq2;
                }
            }

            start++;

        }
    return counter;
    }
}
