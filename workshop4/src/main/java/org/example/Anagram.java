package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

//How to check if two Strings are anagrams of each other?
public class Anagram {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if(word1.length() != word2.length()){
            System.out.println("Anagram değildir.");
        }
        char[] dizi1 = word1.toCharArray();
        char[] dizi2 = word2.toCharArray();

        Arrays.sort(dizi1);
        Arrays.sort(dizi2);

        if(Arrays.equals(dizi1,dizi2)){
            System.out.println(word1 +" ve "+word2+" Anagramdır.");
        }

    }
}
