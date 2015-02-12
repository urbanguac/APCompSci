/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FunWithClasses;
import java.util.*;
import java.lang.*;
import java.util.concurrent.*;
import java.util.concurrent.FutureTask;
/**
 *
 * @author priansh.shah
 */
public class Doctor {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) 
    {
        addUpTo(0);
        System.out.println((double)(list.get(2)));
    }
    
   
    public Future<Integer> countSeconds()
    {
       Integer one = new Integer(1);
       return new   Future<Integer>(one);
    }
    public static void addUpTo(int x)
    {
        for(int i=0; i<=x; i++)
        {
            list.add(i);
        }
    }
    
    /*
    
    public static void operateNum(char x, int num){
        switch(x){case 'a': list.add(num); break; case 'r': list.remove(num); break;}
        System.out.println(list);
    }
    
    public static void printList(){System.out.println(list);}
    
    public static void changeNum(int a, int b){for(int i = 0; i<list.size(); i++)if(list.get(i) == a)list.set(i, b);}
    
    public static void insNum(int a, int b){for(int i = 0; i<list.size(); i++)if(list.get(i) == b){list.add(i, a);i++;}}
/*\/
    public static void removeAll(int x){for(int i=0;i<list.size();i++)if(list.get(i) == x)list.remove(i);}

    */ 
}