import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopoSort {

	public int nVertex;
	public LinkedList[] adj;

	public TopoSort(int number) {
		// TODO Auto-generated constructor stub
		this.nVertex = number;
		adj = new LinkedList[nVertex];

		for (int i = 0; i < nVertex; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int u, int v) {
		adj[u].add(v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TopoSort top = new TopoSort(6);
		top.addEdge(5, 2);
	       top.addEdge(5, 0);
	       top.addEdge(4, 0);
	       top.addEdge(4, 1);
	       top.addEdge(2, 3);
	       top.addEdge(3, 1);
	       top.toplogicalSort();
	}

	public void toplogicalSort(){
		Stack st = new Stack<>();
		boolean[] visited = new boolean[nVertex];
		for ( int i=0;i<nVertex;i++){
			visited[i] = false;
		}
		
		for ( int i=0;i<nVertex;i++){
			if(visited[i] == false){
				topologicalSortUtil(i, visited, st);
			}
		}
		
		while (st.empty() == false){
			System.out.print(st.pop() + " ");
		}
	}

	private void topologicalSortUtil(int i, boolean[] visited, Stack st) {
		// TODO Auto-generated method stub
		visited[i] = true;
		Integer temp;
		Iterator<Integer> it = adj[i].iterator();
		while (it.hasNext()) {
			temp = it.next();
			if (!visited[temp])
				topologicalSortUtil(temp, visited, st);
		}
		
		// Push current vertex to stack which stores result
				st.push(new Integer(i));
	}
}
