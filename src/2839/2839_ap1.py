n = int(input())

data = [1, -1, 1, 2, -1, 2, 3, 2, 3, 4]
     #  3   4  5  6   7  8  9  10 11 12
result = 0

while n > 12:
    n -= 5
    result += 1

result += data[n - 3]

print(result)

# n=int(input())
# print(n//5+2-n%5%2-2*(n%5==0)-(n==7)*4-(n==4)*3)