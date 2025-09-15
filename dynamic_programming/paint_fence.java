/*Hanu is a potter, he has prepared N Clay-Pots, put them in a line.
He decided to paint the clay-pots with k colors.
He has to paint all the clay-pots such that,
no more than two adjacent clay-pots have the same color.

Your task is to help Hanu, to find the total number of ways,
he can paint the clay-pots.

Input Format:
-------------
Two integers N and K, number of clay-pots, and number of colors.

Output Format:
--------------
Print an integer, Number of ways.


Sample Input:
---------------
3 2

Sample Output:
----------------
6

Explanation:
------------
pots		pot-1	pot-2	pot-3
----- 	----- 	----- 	-----
1 			c1 		c1 		c2
2 			c1 		c2 		c1
3 			c1 		c2 		c2
4 			c2 		c1 		c1
5 			c2 		c1 		c2
6 			c2 		c2 		c1
  */
import java.util.*;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int res=0;
        
        if(n==1) res = k;
        else if(n==2) res = k + k*(k-1);
        else{
            int same = k;
            int diff = k*(k-1);
            
            for(int i=2;i<n;i++){
                int x = diff;
                int y = (k-1)*(same+diff);
                
                same = x;
                diff = y;
            }
            
            res = same+diff;
        }
        System.out.println(res);
    }
}

