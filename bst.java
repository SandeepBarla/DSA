class bst {
	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	Node root;

	bst() {
		root = null;
	}

	void insert(int value) {
		root = insertRec(root, value);
	}

	Node insertRec(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (value < root.data)
			root.left = insertRec(root.left, value);
		if (value > root.data)
			root.right = insertRec(root.right, value);
		return root;
	}

	void delete(int value) {
		root = deleteRec(root, value);
	}

	Node deleteRec(Node root, int value) {
		if (root == null)
			return root;
		if (value < root.data)
			root.left = deleteRec(root.left, value);
		else if (value > root.data)
			root.right = deleteRec(root.right, value);
		else {
			if (root.left == null && root.right == null)
				return null;
			else if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			else {
				int minv = minValue(root.right);
				root.data = minv;
				root.right = deleteRec(root.right, minv);
			}
		}
		return root;
	}

	int minValue(Node root) {
		int min = root.data;
		while (root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

//	void deleteKey(int key) {
//		root = deleteNode(root, key);
//	}
//
//	/*
//	 * 8 / \ 4 14 / \ / \ 1 7 9
//	 */
//	Node deleteNode(Node root, int key) {
//		if (root == null)
//			return root;
//		if (key < root.data) {
//			root.left = deleteNode(root.left, key);
//		} else if (key > root.data) {
//			root.right = deleteNode(root.right, key);
//		} else {
//			// node with no leaf nodes
//			if (root.left == null && root.right == null) {
//				return null;
//			} else if (root.left == null) {
//				// node with one node (no left node)
//				return root.right;
//			} else if (root.right == null) {
//				// node with one node (no right node)
//				return root.left;
//			} else {
//				// nodes with two nodes
//				// search for min number in right sub tree
//				int minValue = minValue(root.right);
//				root.data = minValue;
//				root.right = deleteNode(root.right, minValue);
//			}
//		}
//		return root;
//	}
//
//	int minValue(Node root) {
//		int minv = root.data;
//		while (root.left != null) {
//			minv = root.left.data;
//			root = root.left;
//		}
//		return minv;
//	}

	void bfs() {
		int h = levels(root);
		for (int i = 0; i < h; i++) {
			printlev(root, i);
			System.out.println();
		}
	}

	int levels(Node root) {
		if (root == null)
			return 0;
		else {
			return 1 + Math.max(levels(root.left), levels(root.right));
		}
	}

	void printlev(Node root, int lev) {
		if (root == null)
			return;
		if (lev == 0)
			System.out.print(root.data + " ");
		if (lev > 0) {
			printlev(root.left, lev - 1);
			printlev(root.right, lev - 1);
		}
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		bst t = new bst();
		t.insert(8);
		t.insert(12);
		t.insert(4);
		t.insert(1);
		t.insert(14);
		t.insert(10);
		t.insert(7);
		t.insert(11);
		t.insert(13);
		t.insert(15);
		t.insert(9);
		t.insert(16);
		t.bfs();
		System.out.println();
		t.delete(12);
		t.bfs();
	}
}