/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FunWithClasses;

import java.util.Scanner;

/**
 *
 * @author priansh.shah
 */
public class Salesman {
    //Constructors
    private String name;
    private String item;
    private int quota;
    private boolean comission;
    public static void main(String[] args){
        Salesman BillyJoel = new Salesman("Billy Joel", "Anything", 100, true);
        System.out.println(BillyJoel.getName() + "\nSells " + BillyJoel.getItem() + "\nQuota: " + BillyJoel.getQuota() + "\nCommision = " + BillyJoel.isCom());
    }
    public Salesman(String n, String i, int q, boolean c){
        name = n; 
        item = i; 
        quota = q; 
        comission = c;
    }
    public Salesman(String n, String i, int q){
        name=n;
        item=i;
        quota=q;
        comission=true;
    }
    public Salesman(String n, String i, boolean c){
        name = n; 
        item=i;
        quota=100;
        comission=c;
    }
    public int getQuota(){
        return quota;
    }
    public String getName() {
        return name;
    }
    public String getItem() {
        return item;
    }
    public boolean isCom() {
        return comission;
    }
}