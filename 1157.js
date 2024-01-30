const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

function findMostFrequentCharacter(word) {
    const charCount = new Map();

    for (let char of word.toLowerCase()) {
        charCount.set(char, (charCount.get(char) + 1) || 1);
    }

    let maxCount = 0;
    let maxChars = [];

    charCount.forEach((count, char) => {
        if (count > maxCount) {
            maxCount = count;
            maxChars = [char];
        } else if (count === maxCount) {
            maxChars.push(char);
        }
    });

    const result = maxChars.length === 1 ? maxChars[0].toUpperCase() : '?';
    return result;
}

const result = findMostFrequentCharacter(input);
console.log(result);
