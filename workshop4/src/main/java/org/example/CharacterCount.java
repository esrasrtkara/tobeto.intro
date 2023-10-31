package org.example;

//Write a Java program gives character counts in a string Ex: Tobeto -> t:2, o:2, b:1, e:1
public class CharacterCount {
    public static void main(String[] args) {
        String character ="tobeto";
        character = character.toLowerCase(); // Büyük/küçük harf duyarlılığını ortadan kaldırmak için küçük harfe çevirir.

        int[] characterNumbers = new int[26]; // 26 harflik İngilizce alfabe için

        // Girdi dizesini döngüyle gezin
        for (char c : character.toCharArray()) {

            int index = c - 'a'; // Karakterin alfabe indeksini hesaplayın
            characterNumbers[index]++;
        }

        for (int i = 0; i < 26; i++) {
            if (characterNumbers[i] > 0) {
                char c = (char) ('a' + i);
                System.out.print(c + ":" + characterNumbers[i] + " ");

            }

        }
    }
}
