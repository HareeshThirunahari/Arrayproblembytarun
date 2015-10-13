/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayproblem;

import java.util.Scanner;

/**
 *
 * @author S521812
 */
public class ArrayProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         
    int count2 = 0;
    int count1 = 0;
    double a =0;
    double b =0;
  int popularcount = 0;

        System.out.println("Enter the array size");
        Scanner scan = new Scanner(System.in);
        int ArraySize = scan.nextInt();
        double[] MyArr = new double[ArraySize];
        int temp=0;
        Scanner MyScan = new Scanner(System.in);
        while(MyScan.hasNext())
        {
            MyArr[temp]= MyScan.nextDouble();
            temp++;
            if(temp==ArraySize){break;}
        }
        
        
        
        
        
        for (int i=0; i<MyArr.length ; i++)
        {
           a = MyArr[i];
           count1 = 0;
           
           for (int j= i+1; j< MyArr.length; j++)
           {
               if (a == MyArr[j])
               {
                 count1++;
               }
           }
           if (count1 > count2)
           {
               b = a;
               count2 = count1;
              
           }
           else if(count1 == count2)
           {
               b = Math.min(b, a);
              
           }
        }
        
        
        
        
        
        
        
        
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(" The value which is repeatedly entered is" + b);
        
        if(count1 > MyArr.length/2)
        {
        System.out.println(b);
        }
        else
        {
            System.out.println("No value is greater than half of the array size");
        }
    }

}
