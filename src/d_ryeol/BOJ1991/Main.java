//package d_ryeol.BOJ1991;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class Main {
//
//    public static int N;
//    public static StringBuilder sb = new StringBuilder();
//
//
//    public static void insertNode(Node root, char value, char left, char right) {
//        // 현재 노드가 이 노드에 대한 정보가 맞는지 value를 통해 확인
//        if (root.value == value) {
//            // 맞다면 이 노드의 정보를 수정
//            if (left != '.') {
//                root.left = new Node(left);
//            }
//            if (right != '.') {
//                root.right = new Node(right);
//            }
//        } // 현재 노드가 아니라면 현재 노드의 왼쪽 혹은 오른쪽 자식이 있다면 그 자식을 root로 해서 재귀
//        else {
//            if (root.left != null) insertNode(root.left, value, left, right);
//            if (root.right != null) insertNode(root.right, value, left, right);
//        }
//
//    }
//
//    public static void preorder(Node node) {
//        if (node == null) return;
//        sb.append(node.value);
//        preorder(node.left);
//        preorder(node.right);
//    }
//
//    public static void inorder(Node node) {
//        if (node == null) return;
//        inorder(node.left);
//        sb.append(node.value);
//        inorder(node.right);
//    }
//
//    public static void postorder(Node node) {
//        if (node == null) return;
//        postorder(node.left);
//        postorder(node.right);
//        sb.append(node.value);
//    }
//
//    public static void main(String[] args) throws Exception {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        N = Integer.parseInt(br.readLine());
//
//        Node head = new Node('A');
//
//        for (int n = 0; n < N; n++) {
//            String line = br.readLine();
//            String[] split = line.split(" ");
//            char value = split[0].charAt(0);
//            char left = split[1].charAt(0);
//            char right = split[2].charAt(0);
//
//            insertNode(head, value, left, right);
//        }
//
//        preorder(head);
//        sb.append("\n");
//        inorder(head);
//        sb.append("\n");
//        postorder(head);
//
//        bw.write(sb + "");
//
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//
//    private static class Node {
//        char value;
//        Node left;
//        Node right;
//
//        public Node(char value) {
//            this.value = value;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//}