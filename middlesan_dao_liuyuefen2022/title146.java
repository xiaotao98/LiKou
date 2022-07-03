package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.LinkedHashMap;

/**
 * LRU 缓存
 *
 * 思路：利用LinkedHashMap，有序保存key，每次get和put操作记得将key放到map最后一个，当map满了，删除第一个即可
 */
public class title146 {

    int cache;
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    public void LRUCache(int capacity) {
        this.cache = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            recent(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            recent(key);
            map.put(key, value);
            return;
        }
        if (map.size() == cache) {//如果cache满了,需要删除map中第一个
            int first = map.keySet().iterator().next();//当map满了，删除第一个即可
            map.remove(first);
        }
        map.put(key, value);
    }

    //每次用了，都是放到map的最后面
    public void recent(int key) {
        int value = map.get(key);
        map.remove(key);
        map.put(key, value);
    }

}
