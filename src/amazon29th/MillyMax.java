/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amazon29th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Annu
 */
public class MillyMax {
    public static void main(String[] args) {
        int T,N,X,Y,Z,max1,max2,flag=0;
        ArrayList<Integer> A=new ArrayList<>();
        Scanner userip=new Scanner(System.in);
      
        T=userip.nextInt();
        for (int i=0;i<T;i++)
        {
            N=userip.nextInt(); X=userip.nextInt();Y=userip.nextInt();Z=userip.nextInt();
            for(int j=0;j<N;j++)
            {
                A.add(j,userip.nextInt());      
            }
            max1=Collections.max(A);
            A.remove(A.indexOf(max1));//Collections.sort(A);
            for(int j=0;j<(N-1);j++)
            {   max2=Collections.max(A);
                A.remove(A.indexOf(max2));
                N=N-1;
                if(max1%max2>0)
                {       
                      System.out.println("She Can't");  
                      break;
                }
                else
                flag=1;  
                
            }
            if(flag==1)
            {  
                    System.out.println("She Can"); 
                    flag=0;        
            }
        }
    }
}
