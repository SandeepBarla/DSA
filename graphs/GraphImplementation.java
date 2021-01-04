package graphs;

import java.util.*;

public class GraphImplementation {
	LinkedList<Integer> adjList[];
	int noOfVertex;

	GraphImplementation(int V) {
		this.noOfVertex = V;
		adjList = new LinkedList[noOfVertex];
		for (int i = 0; i < this.noOfVertex; i++) {
			adjList[i] = new LinkedList();
		}
	}

	void add(int source, int destination) {
		adjList[source].add(destination);
		adjList[destination].add(source);
	}

	void printGraph() {
		for (int i = 0; i < this.noOfVertex; i++) {
			System.out.print("List of the vertex of " + i);
			for(Integer j: adjList[i]) {
				System.out.print("->"+j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		GraphImplementation graph = new GraphImplementation(5);
		graph.add(0, 1);
		graph.add(1, 2);
		graph.add(2,3);
		graph.add(3, 4);
		graph.printGraph();
		
	}
}
