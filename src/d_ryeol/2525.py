A, B = input().split()
A,B= int(A),int(B)

C = int(input())

if B+C>=60:
    A = A+C//60
    B = B+C%60
    if B>=60:
        A+=1
        B-=60
    if A>=24:
        A-=24

else:
    B+=C

print(A, B)