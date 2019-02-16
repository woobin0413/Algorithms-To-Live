# -*- coding: utf-8 -*-
# DFS (DEPTH FIRST SEARCH) (stack), BFS (BREATH FIRST SEARCH) (queue)
# in-order 1,3,5,7,8,10
# when no child node has no more of sub tree, it's called, "leaf-node"
# time complexity for search : o(n^2)


class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

# retrieve, insert, delete, create, destroy, isEmpty, tree traverse methods
class BinarySearchTree:
    def __init__(self):
        self.root = None


    def find(self, value):
        if self.findNode(value,self.root) is False:
            return False
        else:
            return True


    def findNode(self, value, cur):
        if cur:
            if value == cur.value:
                return cur
            elif value < cur.value:
                return self.findNode(self, value, cur.left)
            else:
                return self.findNode(self, value, cur.right)
        else:
            return False


    def insert(self, value):
        if(self.root):
            return self.insertNode(value,self.root)
        else:
            self.root = value

    def insertNode(self, value, cur):
        if(value<=cur.value):
            if(cur.left):
                self.insertNode(value, cur.left)
            else:
                cur.left = Node(value)
        elif (value>cur.value):

            if(cur.right):
                self.insertNode(value, cur.right)
            else:
                cur.right = Node(value)

    def traverse(self):
        return self.traverseNode(self.root)

    def traverseNode(self, cur):
        result = []
        if(cur is not None):
            result.extend([cur.value])
        if(cur.left is not None):
            result.extend(self.traverseNode(cur.left))
        if(cur.right is not None):
            result.extend(self.traverseNode(cur.right))
        return result

