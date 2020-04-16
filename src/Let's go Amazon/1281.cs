using System;
using System.Collections.Generic;
using System.Text;

namespace Let_s_go_Amazon
{
    class _1281
    {
        public int SubtractProductAndSum(int n)
        {
            int sum = 0;
            int product = 0;
            for (int i = 0; i < n.ToString().Length; i++)
            {
                char num = n.ToString()[i];
                sum += Int32.Parse(num.ToString());
                product *= Int32.Parse(num.ToString());
                
                
            }
            return product - sum;
        }

    }
}
