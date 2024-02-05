const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = parseInt(input[0]);
const people = [];

for (let i = 1; i <= N; i++) {
  const [weight, height] = input[i].split(' ').map(Number);
  people.push({ weight, height, rank: 1 });
}

for (let i = 0; i < N; i++) {
  for (let j = 0; j < N; j++) {
    if (i !== j && people[i].weight < people[j].weight && people[i].height < people[j].height) {
      people[i].rank++;
    }
  }
}

const result = people.map(person => person.rank).join(' ');
console.log(result);
