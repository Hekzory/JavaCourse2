package prac3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThreadSafeSet {

    private Set<Integer> set;

    public ThreadSafeSet() {
        set = new HashSet<>();
    }

    public synchronized boolean add(Integer i) {
        return set.add(i);
    }

    public synchronized boolean remove(Integer o) {
        return set.remove(o);
    }

    public synchronized boolean contains(Integer o) {
        return set.contains(o);
    }

    public synchronized int size() {
        return set.size();
    }
}

