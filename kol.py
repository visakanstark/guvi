def printPairs(arr, arr_size, sum):
     
    s = set()
     
    for i in range(0,arr_size):
        temp = sum-arr[i]
        if (temp>=0 and temp in s):
            print ("Pair with the given sum is", arr[i], "and", temp)
        s.add(arr[i])
 
A = [1,4,45,6,10,-8]
n = 16
printPairs(A, len(A), n)
 
