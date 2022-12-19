package binarytree.binarysearchtree;

public class BST_Rec {
		
	private BTNode root;
	
	public BST_Rec() {
		root = null;
	}
	
	public void insert(int d) {
		root = insertBST(root,d);
	}
	
	private BTNode insertBST(BTNode ptr, int d) {
		if(ptr == null)
			ptr= new BTNode(d);
		
		else if(d<ptr.getData())
			ptr.setLeft(insertBST(ptr.getLeft(), d));
		else if(d>ptr.getData())
			ptr.setRight(insertBST(ptr.getRight(), d));
		else
			System.out.println("Duplicate data");
		
		
		return ptr;
	}
	
	public void perOrder() {
		visitPerorder(root);
	}
	
	private void visitPerorder(BTNode r) {
		if(r==null) {
			return;
		}
		System.out.println(r.getData()+" ");
		
		visitPerorder(r.getLeft());
		visitPerorder(r.getRight());
	}
	
	public BTNode search(int key) {
		return searchBST(root, key);
	}
	
	private BTNode searchBST(BTNode r, int k) {
		
		if(r==null) {
			System.out.println(" key not found ");
			return null;
		}
		else if(k<r.getData()) 
			return searchBST(r.getLeft(), k);
		else if(k>r.getData())
			return searchBST(r.getRight(), k);
		else 
			return r;
	}
	
	public int min() {
		return minBST(root);
	}
	
	private int minBST(BTNode r) {
		if(r.getLeft()==null)
			return r.getData();
		
		return minBST(r.getLeft());
	}
	
	public int max() {
		return maxBST(root);
	}
	
	private int maxBST(BTNode r) {
		if(r.getRight()==null)
			return r.getData();
		return maxBST(r.getRight());
	}
	
}
