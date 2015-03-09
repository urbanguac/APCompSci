/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javastuffs;

/**
 *
 * @author priansh.shah
 */


public class AlphabetRotation {
    public static void main(String[] args) {
        
    }
    
    public static String encrypt(String x){
        String word = ""; //make a word
        int power = (int)(Math.random() * 9.0);
        int key = (int)(Math.random() * 3.0); //random key, 1-3
        double encryptorSquare=Math.pow(((double)(key)),((double)(power))); //square key
//        System.out.println(encryptorSquare);
        char [] arr = x.toCharArray(); //make char array
        for(int i = 0; i < arr.length; i++){ //for array
           arr[i] += -0.5*((encryptorSquare*100) + (int)(i/2)-((int)(encryptorSquare/(double)i))); //subtract square/iteration from 1/2 iteration
           System.out.println((int)(i/2)-((int)((int)encryptorSquare/(double)i)));
        }
        for(int i = 0; i < arr.length; i++){
           word += arr[i]; //make word
        }
        word+=key; //add key
        word+=power;
        return word; //return
    }
    
    public static String decrypt(String x){ //do opposite
        String word = "";
        int key = (int) Integer.parseInt(x.substring(x.length()-2,x.length()-1));
        int power = (int) Integer.parseInt(x.substring(x.length()-1,x.length()));
        double encryptorSquare = Math.pow((double)key,(double)power);
        char [] arr = x.toCharArray();
        for(int i = 0; i < arr.length-1; i++){
           arr[i] -= -0.5*((encryptorSquare*100)+(int)(i/2)-((int)((int)encryptorSquare/(double)i)));
        }
        for(int i = 0; i < arr.length-2; i++){
           word += arr[i];
        }
        
        return word;
    }
    
}
