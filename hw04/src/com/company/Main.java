package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String text = new String ("hello John how are you today fine, thank you. When will you leave John Tomorrow");

        int word_num =4;
        String word_which_replace = "capybara";
        String [] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == word_num) {words[i] = word_which_replace;}
            System.out.println(words[i]);
        }



      StringBuffer final_text = new StringBuffer();
        final_text.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            final_text.append(" ").append(words[i]);
        }
        System.out.println(final_text);

    }
}
