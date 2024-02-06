import sys

sys.setrecursionlimit(10 ** 6)


def append_star(LEN):
    if LEN == 1:
        return ['*']

    Stars = append_star(LEN // 3)       # 재귀 함수로 호출
    L = []

    for S in Stars:                     # for 변수 in 범위:
        L.append(S * 3)                 # 파이썬은 문자열의 곱셈이 가능
    for S in Stars:
        L.append(S + ' ' * (LEN // 3) + S)
    for S in Stars:
        L.append(S * 3)
    return L


n = int(sys.stdin.readline().strip())   # input 대신 사용
print('\n'.join(append_star(n)))
# 조인 연산 '구분자'.join(리스트)
# '_'.join(['a', 'b', 'c']) 라 하면 "a_b_c" 와 같은 형태로 문자열을 만들어서 반환 해줌
# List -> 문자열 변화 : ''.join(arr)

# input()과 sys.stdin.readline().strip()의 비교
# 공통점 : 둘다 반환값은 문자열, 사용자로부터 입력 받음
# input() : 추가적인 처리 x, 사용자가 입력한 그대로의 문자열 반환, 간단한 입력 처리에 유리
# sys.stdin.readline().strip() : 단순히 몇줄 입력받는 문제들과는 다르게, 반복문으로 여러줄을 연속적으로 입력받아야 하는(정렬, 이진 탐색, 최단 경로 문제)의 경우
# 주의점 import sys 써 줘야함




