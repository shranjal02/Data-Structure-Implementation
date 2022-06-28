package com.implementation.hashmap;

import java.util.Arrays;

public class HashMap<K, V> implements HashMapInterface<K, V> {
    private HashNode<K, V>[] hashMap;

    @SuppressWarnings({ "unchecked" })
    public HashMap() {
        hashMap = new HashNode[HashMapConstants.CAPACITY];
    }

    public void insert(K key, V val) {
        int hash = hashCode(key);
        HashNode<K, V> newNode = new HashNode<>(key, val);
        hashMap[hash] = newNode;
    }

    public void remove(K key) {
        int hash = hashCode(key);
        hashMap[hash] = null;
    }

    public boolean contains(K key) {
        int hash = hashCode(key);
        return hashMap[hash] != null;
    }

    private int hashCode(K key) {
        return Math.abs(key.hashCode()) % HashMapConstants.CAPACITY;
    }

    @Override
    public String toString() {
        return "HashMap [elements=" + Arrays.toString(hashMap);
    }

}