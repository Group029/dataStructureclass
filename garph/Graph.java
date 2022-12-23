package garph;

import java.util.Scanner;

public class Graph {
	private int adj[][];
	private int n;

	public Graph() {
		// TODO Auto-generated constructor stub
		n=10;
		adj= new int[n][n];
	}

	public Graph(int size) {
		this.n = size;
		adj = new int [n][n];
	}

	public void createGraph() {
		int i, maxEdge, origin, dest;
		maxEdge = n*(n-1);

		Scanner sc = new Scanner(System.in);
		for(i= 0;i<maxEdge;i++) {
			System.out.println("\n Enter edge (-1, -1) to exit");
			origin = sc.nextInt();
			dest = sc.nextInt();

			if((origin==-1) &&(dest==-1)) {
				break;
			}

			else if( (origin<0) || (origin >=n) || (dest<0) || (dest>=n) ) {
				System.out.println("Invaild Enter");
				return;
			}
			else {
				adj[origin][dest]=1;
			}

		}

	}

	public void insertEdge(int origin, int dest ) {
		if( (origin<0) || (origin>=n)) {
			System.out.println("\n Invaild origin ");
			return;
		}
		else if((dest<0) || (dest>=n)) {
			System.out.println("\n Invaild dest ");
			return;
		}
		else {
			adj[origin][dest]=1;
		}
	}

	public void deleteEdge(int origin, int dest ) {
		if( (origin<0) || (origin>=n)) {
			System.out.println("\n Invaild origin ");
			return;
		}
		else if((dest<0) || (dest>=n)) {
			System.out.println("\n Invaild dest ");
			return;
		}
		adj[origin][dest]=0;
	}

	public void dispay() {
		int i, j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(adj[i][j]+" ");
			}
			System.out.println();
		}
	}

	public void DepthFirst(int v) {
		Stack st = new Stack();
		int i;
		int state[]= new int[10];

		for(i=0;i<n;i++) 
			state[i]=0;

		st.push(v);
		while(!st.isEmpty()) {
			v=st.pop();
			if(state[v]==0) {
				System.out.print(v+" ");
				state[v]=1;
			}

			for(i=n-1;i>=0;i--) {
				if(adj[v][i]==1 && state[i]== 0) 
					st.push(i);
			}
		}
	}


	public void  BreadthFirst(int v) {
		int i ;
		int state[]=new int [10];

		MyQueue q= new MyQueue(10);
		for(i=0;i<n;i++) 
			state[i]=0;

		q.insert(v);
		state[v]=1;

		while(!q.isEmpty()) {
			v=q.delete();

			System.out.print(v+" ");
			state[v]=2;

			for(i=0;i<n;i++) {
				if(adj[v][i]==1 && state[i]==0 ) {
					q.insert(i);
					state[i]=1;
				}
			}
		}
	}

}
