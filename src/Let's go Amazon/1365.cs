using System;
using System.Collections.Generic;
using System.Text;

namespace Let_s_go_Amazon
{
    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    class _1365
    {
        public int[] SmallerNumbersThanCurrent(int[] nums)
        {
            int[] list = new int[nums.Length];

            for (int i = 0; i < nums.Length; i++)
            {
                int count = 0;
                for (int j = 0; j < nums.Length; j++)
                {
                    if (nums[i] != nums[j] && nums[i] > nums[j])
                    {
                        count++;
                    }

                }

                list[i] = count;

            }
            return list;
        }
    }
}
