package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuffer text = new StringBuffer("hello John, how are you today? fine, thank you. When will you leave John? Tomorrow.");

        String str_to_replace = "John";
        String str_which_replace = "Alexander";
        int str_to_replace_length = str_to_replace.length();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == str_to_replace.charAt(0) && text.substring(i,i+str_to_replace.length()).equals(str_to_replace)) {
                text.delete(i,i+str_to_replace.length());
                text.insert(i,str_which_replace);
                i+=str_which_replace.length();
            }
        }

        System.out.println(text);

    }
}
