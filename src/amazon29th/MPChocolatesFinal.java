/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amazon29th;

//import java.util.HashMap;
import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;
 
 
public class MPChocolatesFinal {
    
    public static void main(String args[])
    {
        int N,Q,sum=0,n=100000;
        Scanner userip=new Scanner(System.in);
        N=userip.nextInt();
        //TIntArrayList NumChocolates= = new TIntArrayList( n );
        LinkedList<Integer> NumChocolates=new LinkedList<>();
     
        for(int i=0;i<N;i++)
        {
            sum=sum+userip.nextInt();
            NumChocolates.add(i,sum);
        }
        
         Q=userip.nextInt();
         
      
        for(int i=0;i<Q;i++)
        {
            int AskedIndex=userip.nextInt();
            for(int j=0;j<N;j++)
            {
                if(AskedIndex<=NumChocolates.get(j))
                {
                    System.out.println(j+1);
                  
                    break;
                }
            }
        }
        
 
    }
    
}
