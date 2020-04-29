using System;
using System.Collections.Generic;
using System.Text;

namespace Let_s_go_Amazon
{
    class _1290
    {

        public class ListNode
        {
            public int val;
            public ListNode next;
            public ListNode(int val = 0, ListNode next = null)
            {
                this.val = val;
                this.next = next;
            }
        }

        public class Solution
        {
            public int GetDecimalValue(ListNode head)
            {
                int res = 0;
                while (head != null)
                {
                    res *= 2;
                    if (head.val == 1) { res++; }
                    head = head.next;
                }
                return res;
            }
        }
    }
}
