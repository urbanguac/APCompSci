/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apcompscidos;
import java.util.*;
/**
 *
 * @author priansh.shah
 */
public class testerClass {
    public static void main(String[] args){
        Scanner newScan = new Scanner(System.in);
        iDriveCopy.printPrimes();
        iDriveCopy.isPrime(newScan.nextInt());
        iDriveCopy.prime();
        iDriveCopy.makeExp();
        iDriveCopy.makeExpM();
        iDriveCopy.makeExp3(newScan.nextInt(), newScan.nextInt());
        System.out.println(iDriveCopy.backwards(newScan.nextLine()));
        System.out.println(iDriveCopy.palindrome(newScan.nextLine()));
    }
}
