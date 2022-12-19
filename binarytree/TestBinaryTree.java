package binarytree;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BinaryTree bt = new BinaryTree();
			BinaryTree bt1= new BinaryTree();
			
			bt.insert(10);
			bt.insert(20);
			bt.insert(30);
			bt.insert(40);
			bt.insert(50);
			bt.insert(60);
			bt.insert(70);
			bt.insert(80);
			
			bt.levelTravers();
			
			System.out.println("sum of leaf Node :- "+bt.sumOfLeafNode());
			
			System.out.println("Sum of non leaf Node :- "+bt.sumOfNonLeafNode());
			
			System.out.println("Max"+bt.max());
			
			System.out.println("Min"+bt.min());
			
			System.out.println("level of tree :- "+bt.levelOfTree());
			
			System.out.println("Heigth of tree :- "+bt.heightOfTree());
	
//			bt.mirrorImage();
			
			bt.levelTravers();
			
			bt1.insert(10);
			bt1.insert(20);
			bt1.insert(30);
//			bt1.insert(40);
			bt1.insert(50);
			bt1.insert(60);
			bt1.insert(70);
			bt1.insert(80);
			
			BTNode r1 = bt.getRoot();
			BTNode r2 = bt1.getRoot();
			
			boolean isIdentical=BinaryTree.isIdentical(r1, r2);
			
			System.out.println("isIdentical :- "+isIdentical);
	}
	

}
