import java.io.*;
class GFG {
 
static void computeLPSArray(String str, int M, 
                                     int lps[])
{   
    int len = 0; 
     
    int i;
 
    lps[0] = 0; // lps[0] is always 0
    i = 1;
 
   
    while (i < M)
    {
    if (str.charAt(i) == str.charAt(len))
    {
        len++;
        lps[i] = len;
        i++;
    }
    else // (pat[i] != pat[len])
    {
        if (len != 0)
        {
            // This is tricky. Consider the 
            // example AAACAAAA and i = 7.
            len = lps[len-1];
 
            // Also, note that we do 
            // not increment i here
        }
        else // if (len == 0)
        {
            lps[i] = 0;
            i++;
        }
    }
    }
}
 
// Returns true if str is repetition of 
// one of its substrings else return false.
static boolean isRepeat(String str)
{
    
    int n = str.length();
    int lps[] = new int[n];
 
    
    computeLPSArray(str, n, lps);
 
    /
    int len = lps[n-1];
 
    
    return (len > 0 && n%(n-len) == 0)? true: false;
}
 

public static void main(String[] args)
{
String txt[] = {"ABCABC", "ABABAB", "ABCDABCD", 
                "GEEKSFORGEEKS", "GEEKGEEK", 
                "AAAACAAAAC", "ABCDABC"};
int n = txt.length;
for (int i = 0; i < n; i++) {
    if(isRepeat(txt[i]) == true)
    System.out.println("True");
    else
    System.out.println("False");
}
}
}
 
