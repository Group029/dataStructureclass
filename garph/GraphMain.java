package garph;

public class GraphMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Graph g = new Graph(10);
			
//			g.createGraph();
			
			g.insertEdge(0, 1);
			g.insertEdge(0, 3);
			g.insertEdge(1, 2);
			g.insertEdge(2, 3);
			g.insertEdge(1, 4);
			g.insertEdge(2, 5);
			g.insertEdge(1, 5);
			g.insertEdge(5, 6);
			g.insertEdge(3, 6);
			g.insertEdge(4, 7);
			g.insertEdge(5, 8);
			g.insertEdge(6, 9);
			g.insertEdge(7, 8);
			g.insertEdge(8, 9);
			
			
			g.dispay();
			
			g.BreadthFirst(0);
			System.out.println("\n");
			g.DepthFirst(0);
	}

}
