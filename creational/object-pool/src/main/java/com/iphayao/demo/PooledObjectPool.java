package com.iphayao.demo;

import java.util.HashMap;
import java.util.Map;


public class PooledObjectPool {
    private static long expTime = 6000; // 6sec
    public static Map<PooledObject, Long> available = new HashMap<>();
    public static Map<PooledObject, Long> inUse = new HashMap<>();

    public synchronized static PooledObject getObject() {
        long now = System.currentTimeMillis();
        if(!available.isEmpty()) {
            for(Map.Entry<PooledObject, Long> entry : available.entrySet()) {
                if(now - entry.getValue() > expTime) {
                    popElement(available);
                } else {
                    PooledObject p = popElement(available, entry.getKey());
                    push(inUse, p, now);
                    return p;
                }
            }
        }
        return createPooledObject(now);
    }

    private static PooledObject createPooledObject(long now) {
        PooledObject p = new PooledObject();
        push(inUse, p, now);
        return p;
    }

    public static void releasedObject(PooledObject p) {
        cleanUp(p);
        available.put(p, System.currentTimeMillis());
        inUse.remove(p);
    }

    private static void cleanUp(PooledObject p) {
        p.setTmp1(null);
        p.setTmp2(null);
        p.setTmp3(null);
    }

    private static void push(Map<PooledObject, Long> map, PooledObject p, long now) {
        map.put(p, now);
    }

    private static PooledObject popElement(Map<PooledObject, Long> map, PooledObject key) {
        map.remove(key);
        return key;
    }

    private static PooledObject popElement(Map<PooledObject, Long> map) {
        Map.Entry<PooledObject, Long> entry = map.entrySet().iterator().next();
        PooledObject key = entry.getKey();
        map.remove(entry.getKey());
        return key;
    }

}
