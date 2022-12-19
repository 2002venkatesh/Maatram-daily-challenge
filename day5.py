#input

inp_str=input()
num = len(inp)
count1 = 1
count2 = 2

if num == 1:
    print(num)
elif num == 2:
    print(num)
else:
    for i in range(0, num-3):
        count1, count2 = count2, count1 + count2
    print(count1+count2)

#Output
2
1
----
1
1
----
111
3
----
1234
5
