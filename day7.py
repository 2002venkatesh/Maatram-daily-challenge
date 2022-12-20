def largestSum(array_inp):
    inc=arr_inp[0]
    exc=0
    for i in range(1,len(arr_inp)):
        temp=exc+arr_inp[i]
        exc=max(inc,exc)
        inc=temp
    return max(inc,exc)
array_inp=list(map(int,input().split()))
print(largestSum(arr_inp))
