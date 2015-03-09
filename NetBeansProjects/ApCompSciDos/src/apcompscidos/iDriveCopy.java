/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcompscidos;
import java.util.*;

public class iDriveCopy {
    
    //global vars
    static Scanner scan = new Scanner(System.in);
    static int userInt;
    static int primeBoolAlg;
    
    public static void printPrimes()
    {
        
        int userIntNew = scan.nextInt();
        
        for(int x = 0; x<userIntNew; x++)
        {
            
            if(isPrime(x) == 1){
               
                System.out.print(x);
                System.out.print(", ");
            
            }
       
        }
   
    }
    //get a prime
    public static int isPrime(int userIntOld)
    {
        
        String typeOf = "aaa";
        
        switch(userIntOld)
        {
            case 1: typeOf = "the unique"; primeBoolAlg = 0; break;
            case 2: typeOf = "the only even prime"; primeBoolAlg = 1; break;
            case 3: typeOf = "the first odd prime"; primeBoolAlg = 1; break;
        
        }
        
        if (typeOf.charAt(0) != 't')
        {
            
            if(userIntOld % 2 == 0 || userIntOld % 3 == 0 || userIntOld % 4 == 0 || userIntOld % 5 == 0)
            {
                primeBoolAlg = 0;
                typeOf = "not prime";
                
                
            }
            
            else
            {
                
                primeBoolAlg = 1;
                typeOf = "a prime";
            
            }
        
        }
        
        return primeBoolAlg;
        
    }
    
    public static void prime()
    {
        
        userInt = scan.nextInt();
        String typeOf = "aaa";
        
        switch(userInt)
        {
        
            case 1: typeOf = "the unique"; break;
            case 2: typeOf = "the only even prime"; break;
            case 3: typeOf = "the first odd prime"; break;
        
        }
    
        if (typeOf.charAt(0) != 't')
        {
            
            if(userInt % 2 == 0 || userInt % 3 == 0 || userInt % 4 == 0 || userInt % 5 == 0)
            {
            
                typeOf = "not prime";
            
            }
            
            else
            {
        
                typeOf = "a prime";
            
            }
        
        }
        
        System.out.println("This number is " + typeOf + ".");
    }
    
    public static void makeExp()
    {
        int userNum = scan.nextInt();
        System.out.println("x\tx^2\tx^3");
        for(int x = 1; x<=userNum; x++)
        {

            System.out.println(x + "\t" + (int)Math.pow(x, 2) + "\t" + (int)Math.pow(x, 3));
            
        }
    }

    public static void makeExpM()
    {
        int userNum = scan.nextInt();
        int userPow = scan.nextInt();
        int power = 1;
        for(int i = power; i<=userPow; i++){
            System.out.print("x^" + i + "\t");
            power++;
        }
        System.out.println("");
        for(int x = 1; x<=userNum; x++)
        {
            
            for(int y=1; y<=userPow; y++){

                System.out.print((int)Math.pow(x, y) + "\t");
            
            }
            
            System.out.println("");
            
        }
    }
    
    public static void makeExp3(int userNum, int userPow)
    {
        int power = 1;
        for(int i = power; i<=userPow; i++){
            System.out.print("x^" + i + "\t");
            power++;
        }
        System.out.println("");
        for(int x = 1; x<=userNum; x++)
        {
            
            for(int y=1; y<=userPow; y++){

                System.out.print((int)Math.pow(x, y) + "\t");
            
            }
            
            System.out.println("");
            
        }
    }
    
    public static String backwards(String s)
    {
        
        String p = "";
        int length = s.length() -1;
        
        for(int i=length;i>=0;i--){
        
            p += s.charAt(i);
        
        }
        
        return p;
        
    }
 
    public static boolean palindrome(String s)
    {
        
        return (s.equals(backwards(s)));
        
    }
    
}