public class BinarySearchTree<Key extends Comparable<Key>, Item> {

	private Node root;
	
	private class Node {
		int counter;
		Key key;
		Item item;
		Node left;
		Node right;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void add(Key key, Item item)  {
		if(this.isEmpty()) {
			root = new Node();
			root.counter = 1;
			root.key = key;
			root.item = item;
		} else {
			put(root, key ,item);
		}
	}

	private Node put(Node x,Key key ,Item item) {
		// TODO Auto-generated method stub
		if(x == null) {
			x = new Node();
			x.key = key;
			x.counter = 1;
			x.item = item;
			x.key = key;
		} else if(x.key.compareTo(key) > 0) {
			x.left = put(x.left, key, item);
		}
		else if(x.key.compareTo(key) < 0 ) x.right = put(x.right,key,item);
		else {
			String a = ""; String b = "";
			try {
				a = (String)(x.item);
				b = (String)(item);
				if (a.equals(b)) x.counter++;
				else {
					if(x.left == null) {
						x.left = new Node();
						x.left.counter = 1;
						x.left.key = key;
						x.left.item = item;
					}
				}
			} catch (Exception e) {}
		}
		return x;
	}
	
	public int getCount(Key key) {
		if(!this.contains(key)) return 0;
		return getNode(key).counter;
	}

	public boolean contains(Key key) {
		// TODO Auto-generated method stub
		return getNode(key) != null;
	}

	public void printInOrder(){
		traverseInOrder(root);
	}
	
	public Item getItem(Key key) {
		if(this.contains(key)) return getNode(key).item;
		return null;
	}
	
	private Node getNode(Key key) {
		// TODO Auto-generated method stub
		Node x = root;
		while (x != null) {
			if(x.key.compareTo(key) > 0) x = x.left;
			else if (x.key.compareTo(key) < 0) x = x.right;
			else if (x.key.compareTo(key) == 0) break;
		}
		return x;
	}

	private void traverseInOrder(Node x) {
		// TODO Auto-generated method stub
		if(x == null) return;
		traverseInOrder(x.left);
		System.out.println("Key: " + x.key + "\tName: " + x.item + "\tCount " + x.counter);
		traverseInOrder(x.right);
	}
	
	public void printPostOrder() {
		traversePostOrder(root);
	}

	private void traversePostOrder(Node x) {
		// TODO Auto-generated method stub
		if(x == null) return;
		traversePostOrder(x.left);
		traversePostOrder(x.right);
		System.out.println("Key: " + x.key + "\tSurname: " + x.item + "\tCount: " + x.counter);
	}
	
}
