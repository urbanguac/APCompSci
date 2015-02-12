/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FunWithClasses;

/**
 *
 * @author priansh.shah
 */
public class Cattery {
    
    public static void main(String[] args){
    Cat morgan = new Cat();
    Cat cyrus = new Cat("boss cat", 9, false);
    Cat fluffy =  new Cat("tiger");
    Cat cyrus2 = new Cat(cyrus);
    Cat[] cats = {morgan, cyrus, fluffy, cyrus2}; 
    morgan.grow();
    cyrus.geneModify("Tabby");
    fluffy.removeDisease();
    cyrus2.injectDisease();
    cyrus.printDetails();
    morgan.printDetails();
    fluffy.printDetails();
    cyrus2.printDetails();
    System.out.println(cyrus);
    System.out.println(morgan);
    System.out.println(fluffy);
    System.out.println(cyrus2);
    }
}
