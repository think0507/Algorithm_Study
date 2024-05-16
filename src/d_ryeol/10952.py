import sys

input = sys.stdin.readline

while True:
    B, C = map(int, input().rstrip().split())
    if B == 0 and C == 0:
        break;
    print(B + C)
