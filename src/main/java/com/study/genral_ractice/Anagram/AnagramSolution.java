package com.study.genral_ractice.Anagram;


import java.util.*;

/*
*
* Given an array of strings, group the anagrams together
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
* */
public class AnagramSolution {

    public static void main(String[] args) {

        Map<String,List<String>> anagrams= new LinkedHashMap<>();
        List<String> strs= List.of("eat","tea","tan","ate","nat","bat");

        for (String newWord :strs){
            String newValue= newWord;

//            1. approach to sort the word alphabetically
            char[] chars = newWord.toCharArray();
            Arrays.sort(chars);
            //            2. approach to sort the word alphabetically
            //            String newWord=Arrays.stream(word.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.joining());

            if(anagrams.containsKey(newWord)){
                List<String> newLIst= anagrams.get(newWord);
                newLIst.add(newValue);
                anagrams.put(newWord,newLIst);
            }else {
                List<String> newLIst= new ArrayList<>();
                newLIst.add(newValue);
                anagrams.put(newWord,newLIst);
            }

        }
        System.out.println(anagrams);




    }
}
