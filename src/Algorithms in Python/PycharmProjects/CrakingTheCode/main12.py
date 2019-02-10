# -*- coding: utf-8 -*-
# https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
# 2
# 2
# 1 2 L 1 3 R
# 4
# 10 20 L 10 30 R 20 40 L 20 60 R
# output: 2,3

import math

class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None



class Tree:
    def createNode(self, data):
        return Node(data)

    def insert(self, node, data, ch):
        if node is None:
            return self.createNode(data)
        if (ch == 'L'):
            node.left = self.insert(node.left, data, ch)
            return node.left
        else:
            node.right = self.insert(node.right, data, ch)
            return node.right

    def search(self, lis, data):
        # if root is None or root is the search data.
        for i in lis:
            if i.data == data:
                return i


# Driver Program
if __name__ == '__main__':
    # answer for this problem
    def height(node):
        if node is None:
            return 0
        else:
            return 1 + max(height(node.right),height(node.left))

    t = (input())
    for i in range(t):
        n = (input())
        arr = raw_input().strip().split()
        if n == 0:
            print(0)
            continue
        tree = Tree()
        lis = []
        root = None
        root = tree.insert(root, int(arr[0]), 'L')
        lis.append(root)
        k = 0
        for j in range(n):
            ptr = None
            ptr = tree.search(lis, int(arr[k]))
            lis.append(tree.insert(ptr, int(arr[k + 1]), arr[k + 2]))
            k += 3
        print(height(root))


