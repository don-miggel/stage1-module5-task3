package com.epam.mjc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {

        List<Integer> res = list.stream().filter(x-> x % 2 == 0).collect(Collectors.toList());

        return res;
    }

    /*
    private static boolean validateAllUpperCase(String sent){

        for(Character ch : sent.toCharArray()){
            if (!Character.isUpperCase(ch)){
                return false;
            }
        }
        return true;
    }
    */

    public List<String> toUpperCaseCollection(List<String> list) {
        return  list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(Collection::stream).min(Integer::compareTo);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }
}
