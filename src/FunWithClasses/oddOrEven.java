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
public class oddOrEven {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            float userInt;
            System.out.println("Input integer");
            while (true) {
                userInt = scan.nextFloat();
                if (userInt % 2 == 1) {
                    System.out.println("odd");
                } else {
                    System.out.println("even");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Numbers Only");
        }
    }
}
