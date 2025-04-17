class Node {
    int data, height;
    Node left, right;
  
    Node(int d) {
      data = d;
      height = 1;
    }
  }
  
  public class AvlTree {
    Node root;
  
    int height(Node N) {
      if (N == null)
        return 0;
      return N.height;
    }
  
    int max(int a, int b) {
      return (a > b) ? a : b;
    }
  
    Node rightRotate(Node y) {
      Node x = y.left;
      Node T2 = x.right;
      x.right = y;
      y.left = T2;
      y.height = max(height(y.left), height(y.right)) + 1;
      x.height = max(height(x.left), height(x.right)) + 1;
      return x;
    }
  
    Node leftRotate(Node x) {
      Node y = x.right;
      Node T2 = y.left;
      y.left = x;
      x.right = T2;
      x.height = max(height(x.left), height(x.right)) + 1;
      y.height = max(height(y.left), height(y.right)) + 1;
      return y;
    }
  
    int getBalanceFactor(Node N) {
      if (N == null)
        return 0;
      return height(N.left) - height(N.right);
    }

    Node insertNode(Node node, int data) {

      if (node == null)
        return (new Node(data));
      if (data < node.data)
        node.left = insertNode(node.left, data);
      else if (data > node.data)
        node.right = insertNode(node.right, data);
      else
        return node;

      node.height = 1 + max(height(node.left), height(node.right));
      int balanceFactor = getBalanceFactor(node);
      if (balanceFactor > 1) {
        if (data < node.left.data) {
          return rightRotate(node);
        } else if (data > node.left.data) {
          node.left = leftRotate(node.left);
          return rightRotate(node);
        }
      }
      if (balanceFactor < -1) {
        if (data > node.right.data) {
          return leftRotate(node);
        } else if (data < node.right.data) {
          node.right = rightRotate(node.right);
          return leftRotate(node);
        }
      }
      return node;
    }
  
    Node nodeWithMimumValue(Node node) {
      Node current = node;
      while (current.left != null)
        current = current.left;
      return current;
    }
  
    Node deleteNode(Node root, int data) {
  
      if (root == null)
        return root;
      if (data < root.data)
        root.left = deleteNode(root.left, data);
      else if (data > root.data)
        root.right = deleteNode(root.right, data);
      else {
        if ((root.left == null) || (root.right == null)) {
          Node temp = null;
          if (temp == root.left)
            temp = root.right;
          else
            temp = root.left;
          if (temp == null) {
            temp = root;
            root = null;
          } else
            root = temp;
        } else {
          Node temp = nodeWithMimumValue(root.right);
          root.data = temp.data;
          root.right = deleteNode(root.right, temp.data);
        }
      }
      if (root == null)
        return root;
  
      root.height = max(height(root.left), height(root.right)) + 1;
      int balanceFactor = getBalanceFactor(root);
      if (balanceFactor > 1) {
        if (getBalanceFactor(root.left) >= 0) {
          return rightRotate(root);
        } else {
          root.left = leftRotate(root.left);
          return rightRotate(root);
        }
      }
      if (balanceFactor < -1) {
        if (getBalanceFactor(root.right) <= 0) {
          return leftRotate(root);
        } else {
          root.right = rightRotate(root.right);
          return leftRotate(root);
        }
      }
      return root;
    }
  
    void inOrder(Node node) {
      if (node != null) {
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
      }
    }
  
  
    public static void main(String[] args) {
      AvlTree tree = new AvlTree();
      tree.root = tree.insertNode(tree.root, 33);
      tree.root = tree.insertNode(tree.root, 13);
      tree.root = tree.insertNode(tree.root, 53);
      tree.root = tree.insertNode(tree.root, 9);
      tree.root = tree.insertNode(tree.root, 21);
      tree.root = tree.insertNode(tree.root, 61);
      tree.root = tree.insertNode(tree.root, 8);
      tree.root = tree.insertNode(tree.root, 11);
      tree.inOrder(tree.root);
    }
  }