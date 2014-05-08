package algo.structures;

public class TwoThreeTree {

    private Node root;

    public void put(int key, String value) {
        root = put(root, key, value);
    }

    private Node put(Node node, int key, String value) {
        if (node == null) {
            return new Node(key, value);
        }
        if (node.leftKey == key || node.rightKey == key) {
            return node;
        }

        if (node.rightKey == -1){
            node.rightKey = key;
            node.rightValue = value;
            return node;
        }

        if (node.left == null && node.right == null) {
            if (node.leftKey < key && key < node.rightKey) {
                Node newNode = new Node(key, value);
                newNode.left = new Node(node.leftKey, node.leftValue);
                newNode.right = new Node(node.rightKey, node.rightValue);
                return newNode;
            }
            if (node.leftKey > key) {
                Node newNode = new Node(node.leftKey, node.leftValue);
                newNode.left = new Node(key, value);
                newNode.right = new Node(node.rightKey, node.rightValue);
                return newNode;
            }
            if (node.rightKey < key) {
                Node newNode = new Node(node.rightKey, node.rightValue);
                newNode.left = new Node(node.leftKey, node.leftValue);
                newNode.right = new Node(key, value);
                return newNode;
            }
        }

        if (node.leftKey < key) {
            node.left = put(node.left, key, value);
            return node;
        }

        if (node.rightKey > key) {
            node.right = put(node.right, key, value);
            return node;
        }

        node.middle = put(node.middle, key, value);
        return node;
    }

    private class Node {
        private int leftKey = -1, rightKey = -1;
        private String leftValue, rightValue;
        private Node left, right, middle;

        public Node(int key1, String value1) {
            this.leftKey = key1;
            this.leftValue = value1;
        }

    }
}
