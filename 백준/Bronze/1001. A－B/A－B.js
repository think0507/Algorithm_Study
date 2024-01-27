const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();


const [A, B] = input.split(' ').map(Number);

if (A > 0 && A < 10 && B > 0 && B < 10) {
const result = A - B;
console.log(result);}