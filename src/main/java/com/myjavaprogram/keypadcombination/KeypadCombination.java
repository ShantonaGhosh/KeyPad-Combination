package com.myjavaprogram.keypadcombination;

public class KeypadCombination {

    public static String[] keypad = {".", "abc", "def", "ghi", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKeypadComb(String str, int idx, String combination) {
         if(idx==str.length()){
             System.out.println(combination);
             return;
         }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printKeypadComb(str, idx + 1, combination + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str ="23";
        printKeypadComb(str,0,"");
        

    }

}
