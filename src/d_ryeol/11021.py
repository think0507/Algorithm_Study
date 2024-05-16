import sys

input = sys.stdin.readline

A = int(input())

for i in range(1,A+1):
    B,C = map(int, input().split())
    print(f"Case #{i}: {B+C}")