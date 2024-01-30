def find_most_common_letter(word):
    # 숫자가 있는지 확인
    if any(char.isdigit() for char in word):
        return "?"
    
    # 대문자로 변환
    word = word.upper()
    
    # 각 알파벳의 빈도수를 저장할 딕셔너리 생성
    letter_count = {}
    for char in word:
        if char.isalpha():
            letter_count[char] = letter_count.get(char, 0) + 1
    
    # 빈도수가 가장 높은 알파벳 찾기
    max_count = max(letter_count.values(), default=0)
    most_common_letters = [char for char, count in letter_count.items() if count == max_count]
    
    # 가장 많이 나온 알파벳이 여러 개인 경우
    if len(most_common_letters) > 1:
        return "?"
    
    # 결과 반환 (대문자로)
    return most_common_letters[0]

# 입력 받기
word = input()

# 결과 출력
result = find_most_common_letter(word)
print(result)
