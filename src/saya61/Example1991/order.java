package Example1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 이진 트리 입력받아 전위, 중위, 후위 탐색
public class order {
    public static void main(String[] args) throws IOException {
        IOMethod();
    }

    // 첫째 줄에 이진 트리 노드의 개수 N(1<=N<=26)
    // 둘째 줄부터 N개의 줄을 거쳐 각 노드 / 왼쪽 자식 노드 / 오른쪽 자식 노드 입력
    // 알파벳 대문자 순으로 입력하되, 루트노드는 항상 A
    // 자식 노드가 없을경우 '.'
    static void IOMethod() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // key = char, value = node 인 map 생성
        Map<Character, Node> tree = new HashMap<>();

        for (int i = 0; i < N; i++) {
            // 스트링 토큰을 이용해 띄어쓰기로 구분된 String 배열을 받아
            // char 형식으로 저장
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parentData = st.nextToken().charAt(0);
            char leftData = st.nextToken().charAt(0);
            char rightData = st.nextToken().charAt(0);

            // 각 부모, 왼쪽, 우측 노드에 getNode 생성
            Node parentNode = getNode(parentData, tree);
            Node leftNode = getNode(leftData, tree);
            Node rightNode = getNode(rightData, tree);

            // 부모 노드의 좌, 우측 노드에 할당?연결? 해줌
            parentNode.left = leftNode;
            parentNode.right = rightNode;
        }

        StringBuilder preOrderResult = new StringBuilder();
        StringBuilder inOrderResult = new StringBuilder();
        StringBuilder postOrderResult = new StringBuilder();

        // 항상 시작은 'A'
        preorder(tree.get('A'), preOrderResult);
        inorder(tree.get('A'), inOrderResult);
        postorder(tree.get('A'), postOrderResult);

        System.out.println(preOrderResult);
        System.out.println(inOrderResult);
        System.out.println(postOrderResult);
    }

    // tree 맵 사용을 위한 getNode 메서드 생성
    static Node getNode(char data, Map<Character, Node> tree) {
        // 자식 노드 없을때
        if (data == '.')
            return null;
        return tree.computeIfAbsent(data, Node::new);
    }

    // 노드를 클래스로 생성
    // char 형식의 데이터와 좌-우측 노드를 가르키는 값을 가짐
    static class Node {
        char data;
        Node left;
        Node right;

        Node(char data) {
            this.data = data;
        }
    }

    // root -> left -> right
    static void preorder(Node root, StringBuilder result) {
        if (root == null) return;
        result.append(root.data);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    // left -> root -> right
    static void inorder(Node root, StringBuilder result) {
        if (root == null) return;
        inorder(root.left, result);
        result.append(root.data);
        inorder(root.right, result);
    }

    // left -> right -> root
    static void postorder(Node root, StringBuilder result) {
        if (root == null) return;
        postorder(root.left, result);
        postorder(root.right, result);
        result.append(root.data);
    }
}