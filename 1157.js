const charCount = new Map();
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('알파벳으로 이루어진 단어를 입력하세요: ', (word) => {
    if (word.length <= 1000000) {
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
        console.log(result);
        rl.close();
    } else {
        console.log('단어의 길이가 1,000,000을 넘을 수 없습니다.');
        rl.close();
    }
});
