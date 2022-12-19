package binarytree;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BinaryTree {
		private BTNode root;

		public BinaryTree() {
			this.root = null;
		}

		public BinaryTree(BTNode root) {
			this.root = root;
		}
		
		public void perOrder() {
			visitPerOrder(root);
		}
		
		
		
		public BTNode getRoot() {
			return root;
		}

		public void setRoot(BTNode root) {
			this.root = root;
		}

		public BTNode createNode(int d) {
			BTNode newNode = new BTNode(d);
			return newNode;
		}
		
		private void visitPerOrder(BTNode r) {
			if(r==null) return;
			
			System.out.println(" "+r.getData());
			
			visitPerOrder(r.getLeft());
			visitPerOrder(r.getRight());
		}
		
		public boolean isEmpty() {
			if(root == null) {
				return true;
			}
			else 
				return false;
		}
		
		
		public void insert(int d) {
			BTNode newNode = new BTNode(d);
			
			BTNode ref;
			
			Queue<BTNode> q = new ConcurrentLinkedQueue<>();
			
			if(root==null) {
				root=newNode;
				return;
			}
			q.add(root);
			
			while(!isEmpty()) {
				ref=q.remove();
				if(ref.getLeft()==null) {
					ref.setLeft(newNode);
					return;
				}
				else
					q.add(ref.getLeft());
				
				if(ref.getRight()==null) {
					ref.setRight(newNode);
					return;
				}
				else
					q.add(ref.getRight());
			}
		}
		
		public void levelTravers() { //BreathFirst
			BTNode ref = root;
			if(root == null) {
				return;
			}
			
			Queue<BTNode> q = new ConcurrentLinkedQueue<>();
			
			q.add(ref);
			
			while(!q.isEmpty()) {
				ref=q.remove();
				System.out.print(ref.getData()+" ");
				
				if(ref.getLeft()!=null) {
					q.add(ref.getLeft());
				}
				if(ref.getRight()!=null) {
					q.add(ref.getRight());
				}
			}
		}
		
		public int sumOfLeafNode() {
			BTNode iter = root;
			int sum=0;
			Queue<BTNode> queue = new ConcurrentLinkedQueue<>();
			
			if(iter == null) {
				return sum;
			}
			
			queue.add(iter);
			
			while (!queue.isEmpty()) {
				iter=queue.remove();
				if(iter.getLeft()==null && iter.getRight()==null) {
					System.out.println(iter.getData()+" ");
					sum += iter.getData();
				}
				
				if(iter.getLeft()!=null)
					queue.add(iter.getLeft());
				if(iter.getRight()!=null)
					queue.add(iter.getRight());
				}
			return sum;
			
		}
		
		public int sumOfNonLeafNode() {
			BTNode iter = root;
			int sum=0;
			Queue<BTNode> q = new ConcurrentLinkedQueue<>();
			
			if(iter==null) {
				return sum;
			}
			q.add(iter);
			while(!q.isEmpty()) {
				iter=q.remove();
				if(iter.getLeft()!=null || iter.getRight()!=null) {
					System.out.println(iter.getData()+" ");
					sum += iter.getData();
				}
				
				if(iter.getLeft()!=null)
					q.add(iter.getLeft());
				if(iter.getRight()!=null)
					q.add(iter.getRight());
				}
			return sum;
		}
		
		public int min() {
			
			BTNode iter = root; 
			
			int min = root.getData();
			Queue<BTNode> q = new ConcurrentLinkedQueue<>();  
			
			if(root == null) {
				System.out.println(" Empty tree");
				return min = 0;
			}
			q.add(iter);
			while(!q.isEmpty()) {
				
				iter=q.remove();
				
				if(iter.getData()<min) 
					min = iter.getData();
				if(iter.getLeft()!=null)
					q.add(iter.getLeft());
				if(iter.getRight()!=null)
					q.add(iter.getRight());
			}
			return min;
		}
		
		public int max() {
			
			BTNode iter = root;
			
			int max = root.getData();
			
			Queue<BTNode> q = new ConcurrentLinkedQueue<>();
			
			if(root == null) {
				System.out.println("Empty tree");
				return max = 0;
			}
			
			q.add(iter);
			while(!q.isEmpty()) {
				iter = q.remove();
				
				if(iter.getData()>max)
					max = iter.getData();
					
				if(iter.getLeft()!=null)
					q.add(iter.getLeft());
				if(iter.getRight()!=null)
					q.add(iter.getRight());
				
			}
			return max;
		}
		
		public int levelOfTree() {
			int level = 0;
			
			BTNode iter = root;
			
			if(root == null) {
				System.out.println("empty tree");
				return level;
			}
			BTNode dummy = new BTNode(-999);
			Queue<BTNode> q = new ConcurrentLinkedQueue<>();
			
			q.add(iter);
			q.add(dummy);
			while(!q.isEmpty()) {
				iter = q.remove();
				
				if(iter.getData()== -999) {
					level++;
					q.add(dummy);
					iter=q.remove();
				}
				if(iter.getLeft()!=null) 
					q.add(iter.getLeft());
				if(iter.getRight()!=null)
					q.add(iter.getRight());
				
			}
			return level-1;
		}
		
		public int heightOfTree() {
			
			int heigth = 0;
			
			BTNode iter = root; 
			
			if(root == null) {
				System.out.println("empty tree");
				return heigth;
			}
			
			BTNode dummy = new BTNode(-999);
			Queue<BTNode> q = new ConcurrentLinkedQueue<>();
			
			q.add(iter);
			q.add(dummy);			
			while(!q.isEmpty()) {
				iter = q.remove();
				
				if(iter.getData() == -999) {
					heigth++;
					q.add(dummy);
					iter=q.remove();
				}
				
				if(iter.getLeft()!=null)
					q.add(iter.getLeft());
				if(iter.getRight()!=null)
					q.add(iter.getRight());
				
			}
			return heigth;
		}
		
		public void swap(BTNode p1) {
			BTNode t;
			
			t=p1.getLeft();
			p1.setLeft(p1.getRight());
			p1.setRight(t);
			
		}
		
		public void mirrorImage() {
			BTNode iter = root;
			
			Queue<BTNode> q = new ConcurrentLinkedQueue<>();
			
			if(root == null) {
				System.out.println("Empty tree");
				return;
			}
			
			q.add(iter);
			while(!q.isEmpty()) {
				iter = q.remove();
				swap(iter);
				
				if(iter.getLeft()!=null)
					q.add(iter.getLeft());
				if(iter.getRight()!=null)
					q.add(iter.getRight());
			}
			
		}
		
		public static boolean isIdentical(BTNode r1, BTNode r2) {
			
			BTNode iter1,iter2;
			
			iter1=r1;
			iter2=r2;
			
			if(iter1==null) {
				System.out.println("First tree is empty");
				return false;
			}
			if(iter2==null) {
				System.out.println("Second tree is empty");
				return false;
			}
			Queue<BTNode> q1 = new ConcurrentLinkedQueue<>();
			Queue<BTNode> q2 = new ConcurrentLinkedQueue<>();
			
			q1.add(iter1);
			q2.add(iter2);
			
			while(!q1.isEmpty() && !q2.isEmpty()) {
				iter1 = q1.remove();
				iter2 = q2.remove();
			
				if(iter1.getData() != iter2.getData())
					return false;
				
				if(iter1.getLeft()!=null)
					q1.add(iter1.getLeft());
				if(iter2.getLeft()!=null)
					q2.add(iter2.getLeft());
				if(iter1.getRight()!=null)
					q1.add(iter2.getRight());
				if(iter2.getRight()!= null)
					q2.add(iter2.getRight());
				if(q1.isEmpty() && q2.isEmpty()) {
					return true;
				}
				else
					return false;
			}
			
			return false;
		}
		
}
