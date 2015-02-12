/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FunWithClasses;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.UnsupportedEncodingException;
import java.util.*;


/**
 *
 * @author priansh.shah
 */

public class Bank {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int[] array = {Integer.MIN_VALUE,-1,0,1,2,4,7,8,Integer.MAX_VALUE};
        System.out.println(binarySearch(array,Integer.MAX_VALUE));
    }
    
    
    public static int binarySearch(int[] arr, int key){
        int indexKey = -1;
        int index = 0;
        int iter = 0;
        int min = 0;
        int max = arr.length-1;
        while(indexKey < 0){
            index = (max-min)/2 + min;
            //System.out.println(index);
            //System.out.println("Max " + max + ", Min " + min);
            if(arr[index] == key){indexKey = index;}
            else if(arr[index] < key){min+=max-index;}
            else if(arr[index] >key){max=index;}
            iter++;
            if(iter>arr.length){break;}
        }
        return indexKey;
    }
    
    
    
    
    
    //
    //
    //
    public static void encrypt(String n){
        char x[] = {'0', 'k', };        
    }
    
    public static int maxInt(int[][] array){
        int largest = array[0][0];
        for(int[] x: array)
            for(int y: x)
                if(y>largest)
                    largest = y;
        return largest;
    }
    
    public static String shortestWord(String[][] array){
        String shortest = array[0][0];
        for(String[] x : array)
            for(String y: x)
                if(y.length() < shortest.length())
                    shortest = y;
        return shortest;
    }
    
    public static String binaryConverter(String x) throws UnsupportedEncodingException{
        byte[] byteOf = x.getBytes("UTF-8");
        String binary = "";
        for(byte element : byteOf){
            binary+=Integer.toBinaryString(element);
        }
        switch(binary.length()){
            case 1: binary = "0000000" + binary; break;
            case 2: binary = "000000" + binary; break;
            case 3: binary = "00000" + binary; break;
            case 4: binary = "0000" + binary; break;
            case 5: binary = "000" + binary; break;
            case 6: binary = "00" + binary; break;
            case 7: binary = "0" + binary; break;
        }
        return binary;
    }
}
