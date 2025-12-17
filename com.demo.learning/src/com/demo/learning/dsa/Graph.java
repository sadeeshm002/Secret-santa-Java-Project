package com.demo.learning.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

	List<List<Integer>> adjList = new ArrayList<>();

	public Graph(int v) {
		for (int i = 0; i < v; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int u, int v) {
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}

	public void printGraph() {
		for (int i = 0; i < adjList.size(); i++) {
			System.out.println("Adjecency List of " + i);
			for (int j = 0; j < adjList.get(i).size(); j++) {
				System.out.println(adjList.get(i).get(j));
			}
		}
	}

	public void bfs(int v) {
		int graphSize = adjList.size();
		boolean[] visited = new boolean[graphSize];

		visited[v] = true;

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);

		while (q.size() != 0) {
			Integer vertex = q.remove();
			System.out.println(vertex);

			for (int i = 0; i < adjList.get(vertex).size(); i++) {
				int av = adjList.get(vertex).get(i);
				if (!visited[av]) {
					q.add(av);
					visited[av] = true;
				}
			}
		}
	}

	public void dfs(int v) {
		int graphSize = adjList.size();
		boolean[] visited = new boolean[graphSize];
		dfs2(v, visited);
	}

	public void dfs2(int v, boolean[] visited) {
		visited[v] = true;
		System.out.println(v);
		for (int i = 0; i < adjList.get(v).size(); i++) {
			int av = adjList.get(v).get(i);
			if (!visited[av]) {
				dfs2(av, visited);
			}
		}
	}

}
