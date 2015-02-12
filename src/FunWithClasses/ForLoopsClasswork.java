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
public class ForLoopsClasswork {
    public static void main(String[] args){
        try{
            double sum = 0;
            int loops = 0;
            Scanner scan = new Scanner(System.in);
            for(int i = 0; i<6; i++){
                System.out.println("Number: ");
                double userD = scan.nextDouble();
                if(userD>=0){
                    sum+=userD;
                    loops++;
                }
                else{
                    
                    break;
                }
            }
            System.out.println("Average: " + (sum/loops));
        }
         catch(InputMismatchException e){
                 System.out.println("COME ON, numbers only");
         }
    }
}
