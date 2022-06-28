package com.implementation.hashmap;

public interface HashMapInterface<K, V> {
    public void insert(K key, V val);

    public void remove(K key);

    public boolean contains(K key);

}
