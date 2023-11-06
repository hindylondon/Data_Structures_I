package week6;

	public class BinaryTree {
	    Node root;

	    public BinaryTree() {
	        root = null;
	    }
	    
		public class Node {
		    int num;
		    Node left, right;

		    public Node(int item) {
		        num = item;
		        left = right = null;
		    }
		}  
		public void insert(int num) {
			root = insertRecursive(root, num);
		}
		
		public Node insertRecursive(Node root, int num) {
			if(root == null) {
				root = new Node(num);
				return root;
			}
			if (num < root.num) {
				root.left = insertRecursive(root.left, num);
			}
			else if (num > root.num) {
				root.right = insertRecursive(root.right, num);
			}
			return root;
		}
	    
		public void inOrder() {
			inOrderRecursive(root);
		}
		
		public void inOrderRecursive(Node root) {
			if (root != null) {
				inOrderRecursive(root.left);
				System.out.print(root.num + " ");
				inOrderRecursive(root.right);
			}
		}

	    public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();

	        tree.insert(10);
	        tree.insert(4);
	        tree.insert(7);
	        tree.insert(9);
	        tree.insert(1);
	        tree.insert(8);
	        
	        tree.inOrder();
	        
	    }
	}
