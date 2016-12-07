import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
class TestClass {
	private static int search(int[] a, int l, int r, int k) {
        
        if (l <= r) {
            
            int mid = (l + r +1)/2;
            
            if(l==r && k <= a[mid]) {
                
                return mid;
            }
        
            if( mid >= 1 && k > a[mid-1] && k <= a[mid])
                return mid;
        
            if(a[mid] > k)
                return search(a, l, mid-1, k);
            if(a[mid] < k) 
                return search(a, mid+1, r, k);
        }
        return -1;    
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] noOfChocos = new int[n];
		int[] prefixSumArray = new int[n];
		for(int i = 0; i < n; i++){
			noOfChocos[i] = sc.nextInt();
			if(i == 0){
				prefixSumArray[i] = noOfChocos[i];
			}else{
				prefixSumArray[i] = prefixSumArray[i - 1] + noOfChocos[i];
			}
		}
		
		int query = sc.nextInt();
		for(int i = 0; i < query; i++){
			int index = sc.nextInt();
			int res = search(prefixSumArray, 0, n - 1, index);
			System.out.println(res + 1);
		}
		sc.close();
	
	}
}
