A, B, C = input().split()
A, B, C = int(A), int(B), int(C),
print((A + B) % C)
print(((A % C) + (B % C)) % C)
print((A * B) % C)
print(((A % C) * (B % C)) % C)
