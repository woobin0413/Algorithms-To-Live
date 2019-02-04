# -*- coding: utf-8 -*-
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

        if self.head is not None:
            while(self.head.next != self.head):
                self.head = self.head.next
            self.head.next = new_node

    def output_list(self):

        current_node = self.head

    # 만약 아무것도 없는게 아니면 루프 돌아라 == (있으면)
        while current_node is not None:
            print(current_node.data)

            # jump to the linked node
            current_node = current_node.next
        return

    def sortedInsert(self, new_node):

        # & lt; stands for the less - than sign ( < )
        # & gt; stands for the greater - than sign ( > )
        # & le; stands for the less - than or equals sign ( ≤ )
        # & ge; stands for the greater - than or equals sign ( ≥ )

        cur = self.head

        if cur is None:
            new_node.next = new_node
            self.head = new_node

        elif (cur.data >= new_node.data):
            while cur.next != self.head:
                cur = cur.next
            cur.next = new_node
            new_node.next = self.head
            self.head = new_node

        else:
            while(cur.next != self.head and cur.next.data  < new_node.data):
                cur = cur.next

            new_node.next = cur.next
            cur.next = new_node


