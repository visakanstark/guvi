#include<stdio.h>
 
void find3Numbers(int arr[], int n)
{
   int max = n-1; //Index of maximum element from right side
   int min = 0; //Index of minimum element from left side
   int i;
   int *smaller = new int[n];
   smaller[0] = -1;  // first entry will always be -1
   for (i = 1; i < n; i++)
   {
       if (arr[i] <= arr[min])
       {
          min = i;
          smaller[i] = -1;
       }
       else
          smaller[i] = min;
   }
 
   int *greater = new int[n];
   greater[n-1] = -1;  // last entry will always be -1
   for (i = n-2; i >= 0; i--)
   {
       if (arr[i] >= arr[max])
       {
          max = i;
          greater[i] = -1;
       }
       else
          greater[i] = max;
   }
 
   for (i = 0; i < n; i++)
   {
       if (smaller[i] != -1 && greater[i] != -1)
       {
          printf("%d %d %d", arr[smaller[i]],
                 arr[i], arr[greater[i]]);
          return;
       }
   }
 
   printf("No previal such triplet found");
 
   delete [] smaller;
   delete [] greater;
 
   return;
}
 
