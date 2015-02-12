/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FunWithClasses;
import java.util.*;
/**
 *
 * @author priansh.shah
 */
public class iDriveCopy {
    //global vars
    static Scanner scan = new Scanner(System.in);
    static int userInt;
    
    //main method
    public static void main(String[] args){
        prime();
    }
    
    //get a prime
    public static void prime()
    {
        
        userInt = scan.nextInt();
        String typeOf = "";
        
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
        
                typeOf = "a prime.";
            
            }
        
        }

    }
        
}
