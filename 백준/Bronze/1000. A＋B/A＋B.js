const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

// 입력값을 공백을 기준으로 분리하여 정수로 변환
const [A, B] = input.split(' ').map(Number);

// A+B를 계산하여 출력
const result = A + B;
console.log(result);