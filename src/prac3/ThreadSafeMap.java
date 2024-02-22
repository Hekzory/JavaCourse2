package prac3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class ThreadSafeMap {
    private Map<String, String> map;
    private Semaphore semaphore;

    public ThreadSafeMap(int maxConcurrentAccess) {
        this.map = new HashMap<>();
        this.semaphore = new Semaphore(maxConcurrentAccess);
    }

    public void put(String key, String value) throws InterruptedException {
        semaphore.acquire();
        try {
            map.put(key, value);
        } finally {
            semaphore.release();
        }
    }

    public String get(String key) throws InterruptedException {
        semaphore.acquire();
        try {
            return map.get(key);
        } finally {
            semaphore.release();
        }
    }
}
