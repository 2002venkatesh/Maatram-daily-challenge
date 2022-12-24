def is_Disarium(n):
    a=1
    ans=0
    for i in map(int, str(n)):
        ans += i**a
        a += 1
    if ans==n:
        return "Disarium Number"
    else:
        return "Not a Disarium Number"
n=int(input())
print(is_Disarium(n))
