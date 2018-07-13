
import java.io.*;
 
class GFG {
  
    static int lcs(String X, String Y, int m, int n)
    {
        int L[][]=new int[m + 1][n + 1];
     
     
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
     
                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
     
                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }
     
   
        return L[m][n];
    }
     
    static int findMinCost(String X, String Y, int costX, int costY)
    {
        
        int m = X.length();
        int n = Y.length();
        int len_LCS;
        len_LCS = lcs(X, Y, m, n);
     
        return costX * (m - len_LCS) +
               costY * (n - len_LCS);
    }
     

    public static void main (String[] args) 
    {
        String X = "ef";
        String Y = "gh";
        System.out.println( "Minimum Cost to make two strings "
                            + " identical is = "
                            + findMinCost(X, Y, 10, 20));
         
    }
}
 
