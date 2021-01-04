package graphs;
import java.util.*;


public class BFS {
	int noOfVertex;
	LinkedList<Integer> adjList[];
	BFS(int v){
		noOfVertex=v;
		adjList =new LinkedList[noOfVertex];
		for(int i=0;i<noOfVertex;i++) {
			adjList[i]=new LinkedList();
		}
	}
	void add(int source,int destination) {
		adjList[source].add(destination);
		adjList[destination].add(source);
	}
	void print() {
		for(int i=0;i<noOfVertex;i++) {
			System.out.print("List of "+ i+" is ");
			for(Integer j:adjList[i]) {
				System.out.print("-> "+j);
			}
			System.out.println();
		}
	}
	
	void bfsarrange(int source) {
		LinkedList<Integer> q=new LinkedList<>();
		boolean visited[]=new boolean[noOfVertex];
		visited[source]=true;
		q.add(source);
		while(!q.isEmpty()) {
			source=q.poll();
			System.out.print(source+" ");
			Iterator<Integer> i=adjList[source].listIterator();
			while(i.hasNext()) {
				int n=i.next();
				if(!visited[n]) {
					visited[n]=true;
					q.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		BFS bfs=new BFS(6);
		bfs.add(0,1);
		bfs.add(0,2);
		bfs.add(1,3);
		bfs.add(1,5);
		bfs.add(2,3);
		bfs.add(3,4);
		bfs.add(4,5);
		bfs.print();
		bfs.bfsarrange(1);
	}
}
