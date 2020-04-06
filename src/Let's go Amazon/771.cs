using System;
using System.Collections.Generic;
using System.Text;

namespace Let_s_go_Amazon
{
    class _771
    {
        public int NumJewelsInStones(string J, string S)
        {

            //int count = 0;

            //foreach (char c in S)
            //{
            //    if (J.Contains(c))
            //    {
            //        count++;
            //    }
            //}

            //return count;
            return S.Replace("[^" + J + "]", "").Length;
        }

    }
}
