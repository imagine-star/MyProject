package Question;

/*
* 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
* 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
* 写入数据 put(key, value) - 如果密钥已经存在，则变更其数据值；如果密钥不存在，则插入该组「密钥/数据值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
*
* 进阶:
* 你是否可以在 O(1) 时间复杂度内完成这两种操作？
*
* 示例:
* LRUCache cache = new LRUCache( 2 //缓存容量 );
*
* cache.put(1, 1);
* cache.put(2, 2);
* cache.get(1);       // 返回  1
* cache.put(3, 3);    // 该操作会使得密钥 2 作废
* cache.get(2);       // 返回 -1 (未找到)
* cache.put(4, 4);    // 该操作会使得密钥 1 作废
* cache.get(1);       // 返回 -1 (未找到)
* cache.get(3);       // 返回  3
* cache.get(4);       // 返回  4
* */

import java.util.*;

public class Question146 {

    public static void main(String[] args) {

        int number = 2;
        LRUCache cache = new LRUCache(number);
        cache.put(2, 1);
        cache.put(2, 2);
        System.out.println(cache.get(2));
        cache.put(1, 1);
        cache.put(4, 1);
        System.out.println(cache.get(2));

    }

}

class LRUCache {

    Map<Integer, Integer> cacheMap = new HashMap<>();
    Map<Integer, Integer> getTime = new HashMap<>();
    int index = 0;
    int size;

    public LRUCache(int capacity) {
        size = capacity;
    }

    public int get(int key) {
        if (cacheMap.containsKey(key)) {
            getTime.put(key, index);
            index++;
            return cacheMap.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            cacheMap.put(key, value);
            getTime.put(key, index);
            index++;
        } else if (cacheMap.size() < size) {
            cacheMap.put(key, value);
            getTime.put(key, index);
            index++;
        } else {
            int removeKey = 0;
            Set<Integer> keys = getTime.keySet();   //此行可省略，直接将map.keySet()写在for-each循环的条件中
            int i = 0;
            for(Integer timeKey : keys){
                if (i == 0) {
                    removeKey = timeKey;
                    i++;
                } else {
                    if (getTime.get(timeKey) < getTime.get(removeKey)) {
                        removeKey = timeKey;
                    }
                }
            }
            cacheMap.remove(removeKey);
            getTime.remove(removeKey);
            cacheMap.put(key, value);
            getTime.put(key, index);
            index++;
        }
    }

}
