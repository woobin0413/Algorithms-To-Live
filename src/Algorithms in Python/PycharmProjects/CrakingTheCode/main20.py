def addTwoNumbers(l1: ListNode, l2: ListNode) -> ListNode:
    head = ListNode(0)
    curr = head
    carry, total = 0, 0

    while (l1 or l2):
        a = l1.val if l1 else 0
        b = l2.val if l2 else 0
        total = a + b + carry
        carry = total // 10

        if l1 or l2:
            curr.next = ListNode(total % 10)

        if l1:
            l1 = l1.next
        if l2:
            l2 = l2.next
        curr = curr.next

    if carry > 0:
        curr.next = ListNode(carry)

    return head.next