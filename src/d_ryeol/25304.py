A = int(input())
B = int(input())
res = 0
for i in range(1, B+1):
    C,D = input().split()
    C,D = int(C), int(D)
    res+=C*D
if A==res:
    print("Yes")
else:
    print("No")