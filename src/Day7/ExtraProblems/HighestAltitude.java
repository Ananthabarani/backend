package Day7.ExtraProblems;//There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
//You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n).
// Return the highest altitude of a point.

import java.util.*;
public class HighestAltitude {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the Size :");
        int n=s.nextInt();
        int a[]=new int[n];
        int  t=0;
        int e=0;
        System.out.println("Enter the Elements");
        for(int i=0;i<n;a[i]=s.nextInt(),i++);

        for(int i=0;i<n;i++){
            e+=a[i];
            t= Math.max(e,t);


        }
        System.out.println(t);
    }
}
