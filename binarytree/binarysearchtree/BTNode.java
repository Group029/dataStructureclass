package binarytree.binarysearchtree;

public class BTNode {
		private int data;
		private BTNode right,left;
		
		public BTNode() {
			data=0;
			right=left=null;
		}
		
		public BTNode(int d) {
			this.data=d;
			right=left=null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public BTNode getRight() {
			return right;
		}

		public void setRight(BTNode right) {
			this.right = right;
		}

		public BTNode getLeft() {
			return left;
		}

		public void setLeft(BTNode left) {
			this.left = left;
		}
		
		
}
