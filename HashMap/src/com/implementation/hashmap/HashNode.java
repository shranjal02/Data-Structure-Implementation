package com.implementation.hashmap;

public class HashNode<K, V> {
    K key;
    V value;

    public HashNode(K key, V val) {
        this.key = key;
        this.value = val;
    }

    @Override
    public String toString() {
        return "[key=" + key + ", value=" + value + "]";
    }
}
