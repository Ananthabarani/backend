//Define an enum Day with values for all days of the week.
//Write a program to print a message like "It's a weekday" or "It's a weekend" based on the day.


package Day5.Enum;

import java.util.Scanner;

public class Enums {
    public enum Day {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }

    public static void main(String[] args) {

//        for(Day day:Day.values()){
//            String str=day.toString();
//            if(str.equals("Saturday") || str.equals("Sunday")){
//                System.out.println("Weekend");
//            }
//            else{
//                System.out.println("Weekdays");
//            }
//        }
        Day today=Day.Sunday;
        switch (today){
            case Sunday:
            case Saturday:
                System.out.println("weekend");
                break;
            default:
                System.out.println("Weekdays");
        }
    }

}
