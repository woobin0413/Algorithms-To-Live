# -*- coding: utf-8 -*-
# DFS (DEPTH FIRST SEARCH) (stack), BFS (BREATH FIRST SEARCH) (queue)
# Breadth First Search or BFS for a Graph
# without importing queue library
from collections import defaultdict  as dict
class Graph:

    def __init__(self):

        self.graph = dict(list)

    def addEdge(self, u, v):
        self.graph[u].append(v)

    def BFS(self, s):
        # Mark all the vertices as not visited
        visited = [False] * (len(self.graph))
        queue = []
        # Mark the source node as
        # visited and enqueue it
        queue.append(s)
        visited[s] = True

        # Get all adjacent vertices of the
        # dequeued vertex s. If a adjacent
        # has not been visited, then mark it
        # visited and enqueue it
        while queue:
            s = queue.pop()
            print(str(s) + " ")

            for i in self.graph[s]:
                if visited[i] == False:
                    queue.append(i)
                    visited[i] = True
g = Graph()
g.addEdge(0, 1)
g.addEdge(0, 2)
g.addEdge(1, 2)
g.addEdge(2, 0)
g.addEdge(2, 3)
g.addEdge(3, 3)

print ("Following is Breadth First Traversal"
                  " (starting from vertex 2)")
g.BFS(2)


