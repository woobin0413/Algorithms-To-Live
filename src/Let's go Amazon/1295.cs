using System;
using System.Collections.Generic;
using System.Text;

namespace Let_s_go_Amazon
{
    class _1295
    {
        public int FindNumbers(int[] nums)
        {
            int c = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                if ((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000))
                {
                    c++;
                }
            }
            return c;
        }


    }
}
