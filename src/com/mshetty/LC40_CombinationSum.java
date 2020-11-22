package com.mshetty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC40_CombinationSum {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();

        Arrays.sort(candidates);

        List<Integer> combinations = new ArrayList<>();
        findCombinationToTarget(resultList, combinations, candidates, target, 0);
        return resultList;

    }

    private void findCombinationToTarget(List<List<Integer>> resultList, List<Integer> combinations, int[] candidates, int target, int startIndex) {

        if(target == 0){
            resultList.add(new ArrayList<>(combinations));
        }

        for(int i=startIndex; i<candidates.length; i++){
            if(target > candidates[i]){
                break;
            }

            combinations.add(candidates[i]);
            findCombinationToTarget(resultList, combinations, candidates, target-candidates[i], i+1);
            combinations.remove(combinations.size()-1);
        }

    }


}
