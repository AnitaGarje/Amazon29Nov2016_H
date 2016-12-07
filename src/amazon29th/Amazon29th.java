package amazon29th;

import java.math.BigInteger;
import java.util.Scanner;


public class Amazon29th {
    
 

   /**
     * @param args the command line arguments     */ 
    public static void main(String[] args) {
        try
        {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String StringNum;
       
        int QUESTIONS,LEFT,RIGHT;
             BigInteger sev=new BigInteger("7");
              BigInteger z=new BigInteger("0");
              BigInteger mod;
       // System.out.println("Please enter the String:");
        StringNum=in.next();
      //  System.out.println("Please enter the number of question:");
        QUESTIONS=in.nextInt();
        
        for(int i=0;i<QUESTIONS;i++)
        {
           // System.out.println("Please enter LEFT and RIGHT:");
            LEFT=in.nextInt();
            RIGHT=in.nextInt();
            //System.out.println("substrin is:"+ StringNum.substring(LEFT-1, RIGHT));
        BigInteger   subnum=new BigInteger(StringNum.substring(LEFT-1, RIGHT));
            
            
           // }
            //System.out.println(subnum);
            //System.out.println(subnum.mod(sev));
           
            mod=subnum.mod(sev);
            if(mod.equals(z))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
                

        }
        
        }
        catch(NumberFormatException e)
                {
                   e.printStackTrace();
                }
        
        
    }
    
}
