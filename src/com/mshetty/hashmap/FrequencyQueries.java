package com.mshetty.hashmap;

import java.util.*;

public class FrequencyQueries {
    public static void main(String[] args) {

        List<int[]> queries = new ArrayList<>();

        queries.add(new int[]{3,5});
        queries.add(new int[]{1,10000004});
        queries.add(new int[]{1,10000016});
        queries.add(new int[]{1,10000011});
        queries.add(new int[]{3,10});

//        queries.add(new ArrayList<>(Arrays.asList(3,3)));
//        queries.add(new ArrayList<>(Arrays.asList(1,10000004)));
//        queries.add(new ArrayList<>(Arrays.asList(1,10000016)));
//        queries.add(new ArrayList<>(Arrays.asList(1,10000011)));
//        queries.add(new ArrayList<>(Arrays.asList(3,10)));

//        queries.add(new ArrayList<>(Arrays.asList(1,5)));
//        queries.add(new ArrayList<>(Arrays.asList(1,6)));
//        queries.add(new ArrayList<>(Arrays.asList(3,2)));
//        queries.add(new ArrayList<>(Arrays.asList(1,10)));
//        queries.add(new ArrayList<>(Arrays.asList(1,10)));
//        queries.add(new ArrayList<>(Arrays.asList(1,6)));
//        queries.add(new ArrayList<>(Arrays.asList(2,5)));
//        queries.add(new ArrayList<>(Arrays.asList(3,2)));

        List<Integer> resultList = new ArrayList<>();
        resultList = freqQuery(queries);
        for(int result:resultList)
            System.out.println(result);


    }

    public static List<Integer> freqQuery(List<int[]> queries) {
        List<Integer> resultList = new ArrayList<>();
        List<Integer> myList = new ArrayList<>();

        for(int i=0; i<queries.size(); i++){
            int[] curList = queries.get(i);
            int operation = curList[0];
            int operand = curList[1];

            switch(operation){
                case 1 : myList.add(operand);
                break;

                case 2: myList.remove(new Integer(operand));
                break;

                case 3: resultList.add(checkFrequency(operand, myList));
                break;
            }

        }

        return resultList;

    }

    private static Integer checkFrequency(int operand, List<Integer> myList) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<myList.size(); i++){
            int key=myList.get(i);
            if(!map.containsKey(key))
                map.put(key, 1);
            else {
                map.put(key, map.get(key) + 1);
            }

            int n = map.get(key);
            if(n == operand) {
                return 1;
            }
        }
        return 0;


    }

}
