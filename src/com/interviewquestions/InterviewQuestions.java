package com.interviewquestions;

import java.util.*;
import java.util.stream.Stream;

public class InterviewQuestions {

    public static void main(String[] args) {
        // program to count occurrence of each character in a string
        String string = "Gopal Sirotha";
        String[] chars = string.split("");
        /*char[] chars1 = string.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : chars1) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() +"="+entry.getValue());
        }*/

        //using java 8
/*        Map<String, Long> collect = Arrays.stream(chars).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);*/

        //Java program to find duplicate elements in a string
/*        Arrays.stream(chars)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .forEach(System.out::println);*/

        // Java Program to find first non repeating character in a string.
        /*Long first = Arrays.stream(chars)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .findFirst().get().getValue();
        System.out.println(first);*/

        // Java program to find the second-highest element in array.
        /*Optional<Integer> first = Stream.of(5, 9, 11, 3, 56, 33, 22, 1).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first.get());*/

        // Java program to find the longest string in a given array.

        //lasdf

        Optional<String> first = Stream.of("gopal", "ameya", "abhijeetaaa", "aman", "ojha", "shantanu").sorted(Comparator.comparingInt(String::length)).sorted(Comparator.reverseOrder()).findFirst();

        // hello world
    }
}
