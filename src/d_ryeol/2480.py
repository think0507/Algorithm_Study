A, B, C = input().split()
A ,B, C = int(A),int(B),int(C)

price = 0

if A==B==C:
    price = 10000+A*1000
elif A==B:
    price = 1000+100*A
elif A==C:
    price = 1000+100*A
elif B==C:
    price = 1000+100*B
else:
    if A<C and B<C:
        price = C*100
    if A<B and C<B:
        price = B*100
    if B<A and C<A:
        price = A*100

print(price)