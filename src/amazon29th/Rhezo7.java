package amazon29th;
import java.math.BigInteger;
import java.util.Scanner;
public class Rhezo7 {

    public static void main(String[] args) {
       Scanner userip=new Scanner(System.in);
       BigInteger sev=new BigInteger("7");
      BigInteger z=new BigInteger("0");
      BigInteger mod;
       String Num;int Q,L,R;
       Num=userip.next();
       Q=userip.nextInt();
       for(int i=0;i<Q;i++)
        {   L=userip.nextInt();
            R=userip.nextInt();
           BigInteger   subnum=new BigInteger(Num.substring(L-1, R));
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
    
}
