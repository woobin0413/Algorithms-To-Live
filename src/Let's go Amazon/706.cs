using System;
using System.Collections.Generic;
using System.Text;

namespace Let_s_go_Amazon
{
    class _706
    {
        int[] map;
        /** Initialize your data structure here. */
        public _706()
        {
            map = new int[1000001];
            for (int i = 0; i < map.Length; i++)
            {
                map[i] = -1;
            }
        }

        /** value will always be non-negative. */
        public void Put(int key, int value)
        {
            if (value >= 0)
            {
                map[key] = value;
            }
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int Get(int key)
        {
            return map[key];
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void Remove(int key)
        {
            map[key] = -1;
        }
    }
}
