package com.study.genral_ractice.Anagram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagramSolution {
    public static void main(String[] args) {
        System.out.println("Is Anagram: " + isAnagram("anagram", "nagaram"));
        System.out.println("Is Anagram: " + isAnagram("anagam", "nagaram"));

        System.out.println("Is Anagram: " + isAnagramByStream("anagram", "nagaram"));
        System.out.println("Is Anagram: " + isAnagramByStream("anagam", "nagaram"));
    }

    private static boolean isAnagramByStream(String str1, String str2) {

       Map<Character, Long> a= str1.chars().mapToObj(s->(char) s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       Map<Character, Long> b=   str2.chars().mapToObj(s->(char) s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        return  a.equals(b);
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] counter= new int[26];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < s.length(); i++) {
            if(counter[s.charAt(i) - 'a'] !=0)
            {
                return false;
            }
        }

        return true;
    }
}
