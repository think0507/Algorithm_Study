const fs = require('fs');

// 입력 받기
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

// 정점의 개수 N, 간선의 개수 link, 탐색을 시작할 정점의 번호 V 파싱
const [N, link, V] = input[0].split(' ').map(Number);

// 그래프를 나타내는 인접 리스트 초기화
const graph = Array.from({ length: N + 1 }, () => []);

// 간선 정보 입력 및 그래프 구성
for (let i = 1; i <= link; i++) {
  const [a, b] = input[i].split(' ').map(Number);
  graph[a].push(b); // 무방향 그래프이므로 양방향으로 추가
  graph[b].push(a);
}

// 각 노드의 인접 리스트를 오름차순으로 정렬
// 하는 로직 추가 하지 않으면 틀림
for (let i = 1; i <= N; i++) {
  graph[i].sort((a, b) => a - b);
}

// DFS와 BFS를 위한 방문 여부 배열과 방문한 노드 기록 배열 초기화
const visited_1 = new Array(N + 1).fill(false);
const visited_2 = new Array(N + 1).fill(false);
const dfs_visited = [];
const bfs_visited = [];

// DFS 함수 정의
function dfs(v) {
  visited_1[v] = true; // 방문 표시
  dfs_visited.push(v); // 방문한 노드 기록

  // 현재 노드와 연결된 다른 노드를 순회
  for (const next of graph[v]) {
    if (!visited_1[next]) { // 방문하지 않은 노드라면
      dfs(next); // 재귀적으로 방문
    }
  }
}

// BFS 함수 정의
function bfs(v) {
  const queue = [v]; // 시작 노드로 초기화된 큐
  visited_2[v] = true; // 시작 노드 방문 표시

  // 큐가 빌 때까지 반복
  while (queue.length > 0) {
    const current = queue.shift(); // 큐에서 하나의 노드 추출
    bfs_visited.push(current); // 방문한 노드 기록

    // 현재 노드와 연결된 다른 노드를 순회
    for (const next of graph[current]) {
      if (!visited_2[next]) { // 방문하지 않은 노드라면
        visited_2[next] = true; // 방문 표시
        queue.push(next); // 큐에 추가하여 탐색 계속
      }
    }
  }
}

// DFS와 BFS 실행
dfs(V);
bfs(V);

// 결과 출력
console.log(dfs_visited.join(' ')); // DFS 결과 출력
console.log(bfs_visited.join(' ')); // BFS 결과 출력
