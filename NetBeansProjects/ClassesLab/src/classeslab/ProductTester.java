/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classeslab;
import java.util.*;
/**
 *
 * @author priansh.shah
 */
public class ProductTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input name of product:");
        String nam = scan.nextLine();
        System.out.println("Input price:");
        double pric = scan.nextDouble();
        Product Pokemon = new Product(nam, pric);
        Pokemon.reducePrice();
    }
}
