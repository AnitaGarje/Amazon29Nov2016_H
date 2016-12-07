/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amazon29th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Annu
 */
public class MillyArray {
    
    public static void main(String[] args) {
        int T,N,X,Y,Z,max1,flag=0,ele = 0;
        ListIterator litr;
      ArrayList<Integer> A=new ArrayList<>();
      Scanner userip=new Scanner(System.in);
        //System.out.println("Enter the number of test cases:");
        T=userip.nextInt();
        for (int i=0;i<T;i++)
        {
           // System.out.println("Entr the size of the array");
            N=userip.nextInt();
           // System.out.println("Enter the X,Y,Z");
            X=userip.nextInt();
            Y=userip.nextInt();
            Z=userip.nextInt();
           // System.out.println("Enter the elements in the array");
            for(int j=0;j<N;j++)
            {
                A.add(j,userip.nextInt());
                //A.add( previous);
            }
             for(int j=0;j<N;j++)
            {
                System.out.println("Bfore removing the max:"+A.get(j));
                //A.add( previous);
            }
            max1=Collections.max(A);
            A.remove(A.indexOf(max1));
               for(int j=0;j<(N-1);j++)
            {
                System.out.println("After removing the max:"+A.get(j));
                //A.add( previous);
            }
             for(int j=0;j<(N-1);j++)
            {
                 if(max1%A.get(j)>0)
                {       System.out.println("max1 is:"+max1);
                    System.out.println("element is:"+j+":"+A.get(j));
                      System.out.println("She Can't");  
                      break;
                }
                else
                {
                      System.out.println("max1 is:"+max1);
                    System.out.println("element is:"+j+":"+A.get(j));
                   flag=1;  
                }
            }
             if(flag==1)
                {  
                    System.out.println("She Can"); 
                    flag=0;
                    
                }
            
           /* litr = A.listIterator();
           
            while(litr.hasNext()) {
                 
                 ele=(Integer)litr.next();
                 System.out.println("Before element is:"+ele);
                if(max1%ele>0)
                {       System.out.println("element is:"+ele);
                      System.out.println("She Can't");  
                      break;
                }
                else
                {
                   flag=1;  
                }
            }
             if(flag==1)
                {   System.out.println("element is:"+ ele);
                    System.out.println("She Can");  
                }*/
    }
}
}
