package com.example.ceasarcyphergui;


public class Encrypt {
    private int key;
    private String text;
    private char letter;
    private int ascii;
    private String ans;
    private int ind;
    private String alpha = "abcdefghijklmnopqrstuvwxyz";
    private String alphA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Encrypt(String text, int key){
        this.text = text;
        this.key = key;
        System.out.println(key);
    }

    public String encryptText(){
        for (int i = 0; i < text.length(); i++){
            letter = text.charAt(i);
            ascii = letter;
            if (ascii > 65 && ascii < 90){
                ind = (alphA.indexOf(letter)+key)%26;
                ans += alphA.charAt(ind);
            }
            else if (ascii > 97 && ascii <122){
                ind = (alpha.indexOf(letter)+key)%26;
                ans += alpha.charAt(ind);
            }
            else {
                ans += ' ';
            }
        }
        return ans.substring(4);
    }
}
