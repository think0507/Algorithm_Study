package saya61.Example1260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 탐색
// DFS 와 BFS
// 방문 정점이 많을 경우 정점 번호가 작은 것부터 방문
// 더 이상 방문할 점 없을 경우 종료
public class dfsAndBfs {
    public static void main(String[] args) {
        IOMethod();
    }

    // 정점의 개수 N
    // 간선의 개수 M
    // 탐색 시작할 정점의 번호 V
    // M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어짐
    // 두 정점 사이에는 여러 개의 간선 존재 가능
    // 간선 양방향
    // 출력 : 1번째 줄 - DFS, 2번째 줄 - BFS (V부터 방문된 점 출력)
    static void IOMethod() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int V = scanner.nextInt();
        // output 조절을 위한 String[][] 로 result 선언 및 solution 메서드 호출
        String[][] result = solution(N, M, V, scanner);
        printResult(result);
    }

    static String[][] solution(int n, int m, int v, Scanner scanner) {
        int[][] matrix = new int[n+1][n+1];
        for (int i = 0; i < m; i ++) {
            int x = scanner.nextInt();  // 첫 번째 정점 입력
            int y = scanner.nextInt();  // 두 번째 정점 입력
            //  간선 양방향
            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }

        // DFS 및 BFS 실행
        int[] check = new int[matrix[0].length];
        StringBuilder dfsResult = new StringBuilder();
        DFS(matrix, check, v, dfsResult);
        dfsResult.append("\n");

        check = new int[matrix[0].length];
        StringBuilder bfsResult = new StringBuilder();
        BFS(matrix, check, v, bfsResult);

        String[][] result = {{dfsResult.toString()}, {bfsResult.toString()}};
        return result;
    }

    static void DFS(int[][] m, int[] check, int p, StringBuilder result) {
        // 출력 방식 : 정점 정점 정점...
        result.append(p).append(" ");
        // 방문 체크
        check[p] = 1;

        for (int i = 0; i < m[0].length; i++) {
            // 가는 길이 존재 && 방문한 적이 없을 경우
            if(m[p][i] == 1 && check[i] == 0) {
                DFS(m, check, i, result);
            }
        }
    }

    static void BFS(int[][] m, int[] check, int p, StringBuilder result) {
        Queue<Integer> queue = new LinkedList<>();
        // 방문 체크
        check[p]=1;
        // 큐에 시작 정점 추가
        queue.add(p);

        // 큐가 비어있지 않을 때까지 실행
        while(!queue.isEmpty())
        {
            // queue 의 front 가 가르키는 'node' 를 queue 에 pull
            int node = queue.poll();
            // 출력형식 : 정점 정점 정점...
            result.append(node).append(" ");
            for( int i=0; i < m[0].length; i++)
            {
                // 가는 길이 존재 && 방문한 적이 없을 경우
                if(m[node][i]==1 && check[i]==0){
                    check[i]=1;
                    queue.add(i);
                }
            }
        }
    }

    private static void printResult(String[][] result) {
        for (String[] row : result) {
            for (String value : row) {
                System.out.print(value);
            }
        }
    }
}
