package binarytree.binarysearchtree;

public class TestBST {
	public static void main(String[] args) {
		BST_Rec br = new BST_Rec();
		
		br.insert(10);
		br.insert(20);
		br.insert(30);
		br.insert(45);
		br.insert(18);
		br.insert(25);
		br.insert(69);
		
		br.perOrder();
		
		int min =br.min();
		System.out.println("min :- "+min);
		
		int max = br.max();
		System.out.println("max :- "+max);
		
		BTNode s= br.search(45);
		System.out.println("Refrence of found key :- "+s);
		
	}
}
