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
public class greatestInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Input three integers, seperated with an enter. (JUST TRY PUTTING IN A DOUBLE, JUST TRY BRO");
                System.out.println("The largest integer is " + getLargestInteger(scan.nextInt(), scan.nextInt(), scan.nextInt()) + ".");
                System.out.println("Keep Going!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Integers only");
        }
    }

    public static int getLargestInteger(int a, int b, int c) {
        if (a > c && a > b) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}
