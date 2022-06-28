package com.test;

import static org.junit.Assert.assertSame;
import com.implementation.hashmap.HashMap;
import org.junit.Test;

public class HashMapTest {
    @Test
    public void hashMapTesting() {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.insert(1, "Prakhar");
        hm.insert(2, "Prakhar");
        hm.insert(3, "Prakhar");

        assertSame(true, hm.contains(2));

        hm.remove(3);

        assertSame(false, hm.contains(3));

        hm.remove(1);

        assertSame(false, hm.contains(1));

    }

}