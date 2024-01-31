const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = parseInt(input[0]);
const t = input[1].split(' ').map(Number);

t.sort((a, b) => b - a);

let result = 0;

for (let i = 0; i < N; i++) {
  result = Math.max(result, t[i] + i + 2);
}

console.log(result);