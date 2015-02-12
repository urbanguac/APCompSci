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
public class DateConverter {
    static Scanner scan = new Scanner(System.in);
    static String month;
    static int monthIndex;
    static int numMonth;
    static int dayIndex;
    static int numDay;
    static int numYear;
    static String numDate;
    static int numOfDays;
    public static void main(String[] args){
        try{
            while(true){
                System.out.println("Please input an entire date in numerial form MM-DD-YYYY (i.e. 12-17-1999)");
                numDate = scan.nextLine();
                monthIndex = numDate.indexOf("-");
                numMonth = Integer.parseInt(numDate.substring(0, monthIndex));
                dayIndex = numDate.indexOf("-", monthIndex+1);
                numDay = Integer.parseInt(numDate.substring(monthIndex+1,dayIndex));
                numYear = Integer.parseInt(numDate.substring(dayIndex+1));
                convertDate(numMonth, numDay, numYear);
            }
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Please input a date MM-DD-YYYY");
        }
    }
    public static void convertDate(int m,int d,int y){
         switch(m){
            case 1: month =  "January"; numOfDays = 31; break;
            case 2: month = "February"; 
                if(y % 4 == 0 && y%100 != 0)
                {
                    numOfDays = 29;
                }
                else 
                {
                    numOfDays = 28;
                }; break;
            case 3: month =  "March"; numOfDays = 31;break;
            case 4: month = "April"; numOfDays = 30; break;
            case 5: month = "May"; numOfDays = 31; break;
            case 6: month = "June"; numOfDays = 30; break;
            case 7: month = "July"; numOfDays = 31; break;
            case 8: month = "August"; numOfDays = 31; break;
            case 9: month = "September"; numOfDays = 30; break;
            case 10: month = "October"; numOfDays = 31; break;
            case 11: month = "November"; numOfDays = 30; break;
            case 12: month = "December"; numOfDays = 31; break;
        }
        System.out.println(month + " " + d + ", " + y);
        System.out.println("There are " + numOfDays + " days in " + month + ".");
    }
}
