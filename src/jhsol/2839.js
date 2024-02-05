const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = parseInt(input[0], 10);  

if (N < 3 || N > 5000) { 
    console.log("N은 3보다 크거나 같고 5000보다 작거나 같아야 합니다.");
} else {
    const result = getShare(N);
    console.log(result);
}

function getShare(N) {
    let count5kg = Math.floor(N / 5);

    while (count5kg >= 0) {
        const remainder = N - (count5kg * 5);

        if (remainder % 3 === 0) {
            const count3kg = remainder / 3;
            return count5kg + count3kg;
        }

        count5kg--;
    }

    return -1; 
}
