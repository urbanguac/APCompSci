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
public class Puzzle {
    private int numOfPieces;
    private boolean inColor;
    private double difficultyLevel;
    public Puzzle(int numOfPieces, boolean c, double d){
        this.numOfPieces = numOfPieces;
        this.inColor = c;
        this.difficultyLevel = d;
    }
    public Puzzle( int n) {
        this(n, true, 0.0);
    }
    public Puzzle(){
        this(5,false,0.0);
    }
}
class Playroom{
    public static void main(String[] args){
        Puzzle x = new Puzzle();
        Puzzle y = new Puzzle(10);
    }   
}