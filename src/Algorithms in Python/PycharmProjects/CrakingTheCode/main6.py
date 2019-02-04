# # -*- coding: utf-8 -*-
# INT_MIN = -2 ** 32
# #
# # # https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
# def canRepresentBST(ex):
#     # Create an empty stack
#     s = []
#
#     # Initialize current root as minimum possible value
#     root = INT_MIN
#
#     # Traverse given array
#     for value in ex:
#         print s
#         # NOTE:value is equal to pre[i] according to the
#         # given algo
#
#         # If we find a node who is on the right side
#         # and smaller than root, return False
#         if value < root:
#             return False
#
#         # If value(pre[i]) is in right subtree of stack top,
#         # Keep removing items smaller than value
#         # and make the last removed items as new root
#         while (len(s) > 0 and s[-1] < value):
#             root = s.pop()
#
#             # At this point either stack is empty or value
#         # is smaller than root, push value
#         s.append(value)
#
#     return True
# #root 보단 크고 stack보단 작아야된다
#
# # Driver Program
# ex1 = [40, 30, 35, 80, 100]
# print "true" if canRepresentBST(ex1) == True else "false"
# ex2 = [40, 30, 35, 20, 80, 100]
# print "true" if canRepresentBST(ex2) == True else "false"
#
class Node:
    def __init__(self, ID, parent):
        self.parentID = parent
        self.key = ID
        self.left = None
        self.right = None

def validatePreOrder(nodes):

    stack = []
    stack.append(nodes[0].key)


    for i in range(0, len(nodes)-1):
        if stack is None:
            return False

        if stack[-1] == nodes[i].parentID:
            stack.append(nodes[i].key)
            i+=1

    return stack

if __name__ == '__main__':
    # nodes(key,parentID)
    n1 = Node(2, 1)
    n2 = Node(2, 4)
    n3 = Node(3, 1)
    n4 = Node(4, 2)
    n5 = Node(5, 2)

    nodes = [n1, n2, n3, n4, n5]
    print validatePreOrder(nodes)

