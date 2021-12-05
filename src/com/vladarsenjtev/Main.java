package com.vladarsenjtev;


public class Main {

    public static void main(String[] args) {
        String english = "hi my name is java";
        System.out.println(english);
        System.out.println(reverse(english));
    }

    public static String reverse(String str) {
        String[] strings = str.split("\\s+");
        StringBuilder reverse = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            reverse.append(strings[i]).append(" ");
        }
        for (int i = 0; i < str.length(); i++)
            if (i == 0 || reverse.charAt(i - 1) == ' ')
                reverse.setCharAt(i, Character.toUpperCase(reverse.charAt(i)));
        return reverse.toString();
    }
}
