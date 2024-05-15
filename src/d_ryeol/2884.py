A, B = input().split()
A,B= int(A),int(B)

if A == 0 and B<45:
    A=23
    B=B+60-45
elif A==0 and B>=45:
    B=B-45
elif B<45:
    A-=1
    B=B+60-45
else:
    B-=45

print(A, B)