const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

const [arraySize, arrayValues, targetCount, targets] = input.map(line => line.split(" ").map(x => Number(x)));

arrayValues.sort((a, b) => a - b);

// Binary Search
const binarySearch = (arr, target) => {
  let left = 0;
  let right = arr.length - 1;

  while (left <= right) {
    const mid = Math.floor((left + right) / 2);

    if (arr[mid] === target) {
      return 1;
    }

    if (arr[mid] > target) {
      right = mid - 1;
    } else {
      left = mid + 1;
    }
  }

  return 0;
};

const result = targets.map(target => binarySearch(arrayValues, target));

console.log(result.join("\n"));
