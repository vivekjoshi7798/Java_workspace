package com.study.java8.number.stringoperations;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringStreamPractice {

    public static void main(String[] args) {
        System.out.println("1 longest string from a list : " + findLongestString(List.of("longest", "string", "from", "a", "list")));

        System.out.println("1 Count vowels: " + countVowels("Education"));
        System.out.println("2 Remove duplicates: " + removeDuplicateChars("programming"));
        System.out.println("3 First non-repeating char: " + firstNonRepeatingChar("aabbcddex"));
        System.out.println("4 Reverse each word: " + reverseEachWord("Java Stream API"));
        System.out.println("5 Uppercase sorted chars: " + sortUppercase("developer"));

        System.out.println("6 Char frequency: " + charFrequency("banana"));
        System.out.println("7 Longest word: " + longestWord("Java streams are very powerful"));
        System.out.println("8 Words starting with vowel: " + wordsStartingWithVowel("Apple is orange and umbrella"));
        System.out.println("9 Are anagrams: " + areAnagrams("listen", "silent"));
        System.out.println("10 Duplicate words: " + duplicateWords("Java is great and Java is powerful"));

        System.out.println("11 Most frequent char: " + mostFrequentChar("success"));
        System.out.println("12 Palindrome words: " + palindromeWords("madam racecar apple level"));
        System.out.println("13 Group words by length: " + groupByLength("Java Stream API makes coding clean"));
        System.out.println("14 Sort words by last char: " + sortByLastChar("dog cat apple zebra"));
        System.out.println("15 String compression: " + compressString("aaabbccccd"));

        System.out.println("16 Second most frequent char: " + secondMostFrequentChar("aabbbccccdd"));
        System.out.println("17 Unique chars only: " + uniqueCharacters("swiss"));
        System.out.println("18 Replace word with length: " + wordLengths("Java makes streams easy"));
        System.out.println("19 Count types: " + countCharTypes("Java8Stream2025"));
        System.out.println("20 Rotate string: " + rotateString("HELLO"));
    }

    public static void printList(List<String> list) {
        String name = new String("vivekjoshi");
        List<Integer> location = IntStream.range(0, name.length())
                .filter(s -> "aeiou".indexOf(name.charAt(s)) != -1).boxed().toList();
        System.out.println(location);
    }

    private static String findLongestString(List<String> longest) {
        return longest.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }

    // 1
    static long countVowels(String str) {
        return str.toLowerCase().chars().filter(s -> "qeiou".indexOf(s) != -1).count();
    }

    // 2
    static String removeDuplicateChars(String str) {
        return null;
    }

    // 3
    static Character firstNonRepeatingChar(String str) {
        return null;
    }

    // 4
    static String reverseEachWord(String str) {
        return null;
    }

    // 5
    static String sortUppercase(String str) {
        return null;
    }

    // 6
    static Map<Character, Long> charFrequency(String str) {
        return null;
    }

    // 7
    static String longestWord(String sentence) {
        return null;
    }

    // 8
    static List<String> wordsStartingWithVowel(String sentence) {
        return null;
    }

    // 9
    static boolean areAnagrams(String s1, String s2) {
        return false;
    }

    // 10
    static Set<String> duplicateWords(String sentence) {
        return null;
    }

    // 11
    static Character mostFrequentChar(String str) {
        return null;
    }

    // 12
    static List<String> palindromeWords(String sentence) {
        return null;
    }

    // 13
    static Map<Integer, List<String>> groupByLength(String sentence) {
        return null;
    }

    // 14
    static List<String> sortByLastChar(String sentence) {
        return null;
    }

    // 15
    static String compressString(String str) {
        return null;
    }

    // 16
    static Character secondMostFrequentChar(String str) {
        return null;
    }

    // 17
    static List<Character> uniqueCharacters(String str) {
        return null;
    }

    // 18
    static List<Integer> wordLengths(String sentence) {
        return null;
    }

    // 19
    static Map<String, Long> countCharTypes(String str) {
        return null;
    }

    // 20
    static String rotateString(String str) {
        return null;
    }
}
