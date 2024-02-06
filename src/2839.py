'''
def find_min_bags(n):
    # 5킬로그램 봉지부터 최대한 많이 사용
    bags_5kg = n // 5

    # 5킬로그램 봉지를 하나씩 감소시키면서 3킬로그램 봉지로 채울 수 있는지 확인
    while bags_5kg >= 0:
        remaining_sugar = n - (5 * bags_5kg)
        if remaining_sugar % 3 == 0:
            bags_3kg = remaining_sugar // 3
            print(bags_3kg, bags_5kg)
            return bags_3kg + bags_5kg
        bags_5kg -= 1

    # 봉지로 정확하게 나눌 수 없는 경우
    return -1


# 사용자로부터 입력 받기
user_input = int(input("정확하게 배달해야 할 설탕의 무게를 입력하세요: "))

# 최소의 봉지 개수 찾기
result = find_min_bags(user_input)

# 결과 출력
if result != -1:
    print(f"봉지의 최소 개수: {result}개")

else:
    print("정확하게 배달할 수 없습니다.")
'''

# X = 5k + 3l
def find_min_lk(x):
    for n in range(x // 5 + 1):
        for l in range(5):
            k = (x - 3 * l) // 5
            if k >= 0 and (3 * l + 5 * k) == x:
                return l, k
    return -1

# 사용자로부터 입력 받기
user_input = int(input())

# 최소의 L, K 찾기
result = find_min_lk(user_input)

# 결과 출력
if result != -1:
    l, k = result
    # print(f"X를 표현하는 최소의 L, K 값은 L={l}, K={k}입니다.")
    print(l+k)
else:
    print(-1)
