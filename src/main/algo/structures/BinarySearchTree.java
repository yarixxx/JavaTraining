package algo.structures;

public class BinarySearchTree {
    private int puts, gets;

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        return node == null ? 0 : node.count;
    }

    public int getPuts() {
        return puts;
    }

    public int getGets() {
        return gets;
    }

    public void put(int key, String value) {
        puts = 0;
        root = put(root, key, value);
    }

    private Node put(Node node, int key, String value) {
        puts++;
        if (node == null) {
            return new Node(key, value);
        }
        if (node.key == key) {
            return node;
        }

        if (node.key > key) {
            node.left = put(node.left, key, value);
        } else {
            node.right = put(node.right, key, value);
        }
        node.count = 1 + size(node.left) + size(node.right);
        return node;
    }

    private Node put(Node node, Node child) {
        if (node == null) {
            return child;
        }
        if (node.key > child.key) {
            node.left = put(node.left, child);
        } else {
            node.right = put(node.right, child);
        }
        return node;
    }

    public String get(int key) {
        Node node = getNode(key);
        return node == null ? null : node.value;
    }

    public int getSize(int key) {
        Node node = getNode(key);
        return node == null ? 0 : node.count;
    }

    private Node getNode(int key) {
        Node node = root;
        while (node != null) {
            if (key == node.key) {
                return node;
            }

            node = key < node.key ? node.left : node.right;
        }
        return null;
    }

    public void delete(int key) {
        Node node = root;
        Node parent = root;
        while (node != null) {
            if (key == node.key) {
                if (node.left == null && node.right == null) {
                    if (key < parent.key) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                    return;
                }

                if (node.left != null && node.right == null) {
                    if (key < parent.key) {
                        parent.left = node.left;
                    } else {
                        parent.right = node.left;
                    }
                    return;
                }

                if (node.right != null && node.left == null) {
                    if (key < parent.key) {
                        parent.left = node.right;
                    } else {
                        parent.right = node.right;
                    }
                    return;
                }

                Node left = node.left;
                Node right = node.right;

                if (key < parent.key) {
                    parent.left = put(parent.left, left);
                } else {
                    parent.right = put(parent.right, right);
                }
                return;
            }

            parent = node;
            node = key < node.key ? node.left : node.right;
        }

    }

    private Node root;

    private class Node {
        private final int key;
        private int count;
        private final String value;
        private Node left, right;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
