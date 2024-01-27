const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const A = parseInt(input[0]);
const B = parseInt(input[1]);

if (A > 0 && B < 10) {
    const result = A + B;
    console.log(result);
} 
