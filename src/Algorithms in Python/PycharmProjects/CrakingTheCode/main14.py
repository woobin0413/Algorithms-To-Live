# -*- coding: utf-8 -*-
# https://practice.geeksforgeeks.org/problems/inorder-traversal/1/?ref=self

# Non-Recursive answer
def inorderTraversal(root):
    temp_node = root
    stack = []

    while stack or temp_node:
        if (temp_node):
            stack.append(temp_node)
            temp_node = temp_node.left
        else:
            temp_node = stack[len(stack) - 1]
            stack.pop()

            print (temp_node.data, end = " ")

            temp_node = temp_node.right

# Recrusive answer

def inorderTraversal(root):
    if(root):
        inorderTraversal(root.left)
        print(root.data, end = " ")
        inorderTraversal(root.right)
