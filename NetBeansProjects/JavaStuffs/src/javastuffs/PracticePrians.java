package javastuffs;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benjamin.boxer
 */
public class PracticePrians {
    public static void main(String[] args) {
        System.out.println(decrypt(encrypt("Priansh")));
    }
    
    public static String encrypt(String x){
        String word = "";
        int key = (int)(Math.random() * 3.0);
        int encryptorSquare=key*key;
//        System.out.println(encryptorSquare);
        char [] arr = new char [x.length()];
        for(int i = 0; i < x.length(); i++){
            arr[i] = x.charAt(i);
        }
        for(int i = 0; i < arr.length; i++){
           arr[i] += (int)(i/2)+15-((int)(encryptorSquare/(double)i));
        }
        for(int i = 0; i < arr.length; i++){
           word += arr[i];
        }
        word+=key;
        return word;
    }
    
    public static String decrypt(String x){
        String word = "";
        int key = (int) Integer.parseInt(x.substring(x.length()-1,x.length()));
        int encryptorSquare = key*key;
        char [] arr = new char [x.length()];
        for(int i = 0; i < x.length(); i++){
            arr[i] = x.charAt(i);
        }
        for(int i = 0; i < arr.length-1; i++){
           arr[i] -= (int)(i/2)+15-((int)(encryptorSquare/(double)i));
        }
        for(int i = 0; i < arr.length-1; i++){
           word += arr[i];
        }
        
        return word;
    }
    
    
}
