using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Let_s_go_Amazon
{
    class _1313
    {
        public class Solution
        {
            public int[] DecompressRLElist(int[] nums)
            {
                ArrayList list = new ArrayList();

                if (nums.Length % 2 != 0)
                {
                    return null;
                }

                else
                {


                    for (int i = 1; i < nums.Length; i = i + 2)
                    {
                        for (int j = 0; j < nums[i - 1]; j++)
                        {
                            list.Add(nums[i]);
                        }

                    }
                }
                return list.ToArray(typeof(int)) as int[];
            }
        }
    }
}
