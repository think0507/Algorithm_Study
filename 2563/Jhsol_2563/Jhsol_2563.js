const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const n = parseInt(input[0], 10);
const p = input.slice(1).map(position => position.split(' ').map(Number));

const c = Array.from(Array(100), () => Array(100).fill(0)); 

p.forEach(([x, y]) => {
    for (let i = x; i < x + 10; i++) {
        c[i].fill(1, y, y + 10);
    }
});

const bl = c.flat().reduce((acc, val) => acc + val, 0);

console.log(bl);