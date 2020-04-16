using System;
using System.Collections.Generic;
using System.Text;

namespace Let_s_go_Amazon
{
    /*
     * Binary search tree
     * return sum of values of all nodes with value between L and R
     * Please take careful look on this problem.
     * 
     */

    class _938
    {
        public class TreeNode
        {
            public int val;
            public TreeNode left;
            public TreeNode right;
            public TreeNode(int x) { val = x; }
        }

        public int RangeSumBST(TreeNode root, int L, int R)
        {
            if (root == null)
            {
                return 0;
            }
            int n = 0;
            if (root.val >= L && root.val <= R)
            {
                n = root.val;
            }

            n += RangeSumBST(root.left, L, R);
            n += RangeSumBST(root.right, L, R);

            return n;

        }

    }
}
