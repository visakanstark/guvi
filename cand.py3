def hasArrayTwoCandidates(A,arr_size,sum):
     
   
    quickSort(A,0,arr_size-1)
    l = 0
    r = arr_size-1
     
   
    while l<r:
        if (A[l] + A[r] == sum):
            return 1
        elif (A[l] + A[r] < sum):
            l += 1
        else:
            r -= 1
