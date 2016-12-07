/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amazon29th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MilllyArrayFinal {
        public static void main(String[] args) {
        int T,N,X,Y,Z,max1,flag=0;ArrayList<Integer> A=new ArrayList<>();
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
            A.remove(A.indexOf(max1));
            Collections.sort(A);
            for(int j=(N-2);j>=0;j--)
            {
                if(max1%A.get(j)>0)
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
