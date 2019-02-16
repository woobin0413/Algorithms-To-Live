# -*- coding: utf-8 -*-

def bfs_recursion(graph, start):
    visited = []
    queue = []

    if start not in visited:
        visited.append(start)
        queue.extend(graph[start].difference(visited))

    if queue:
        vertex = queue.pop(0)
        bfs_recursion(graph,vertex)
    return visited

def bfs_paths(graph, start, goal):
    queue = [(start, [start])]
    while queue:
        (vertex, path) = queue.pop(0)
        for next in graph[vertex] - set(path):
            if next == goal:
                yield path + [next]
            else:
                queue.append((next, path + [next]))

if __name__ == '__main__':
    graph = {'A': set(['B', 'C']),
             'B': set(['A', 'D', 'E']),
             'C': set(['A', 'F']),
             'D': set(['B']),
             'E': set(['B', 'F']),
             'F': set(['C', 'E'])}

    # print(bfs(graph, 'A'))

    print(list(bfs_paths(graph, 'A', 'F')))