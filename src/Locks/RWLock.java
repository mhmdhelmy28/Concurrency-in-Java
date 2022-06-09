package Locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLock {
    ReadWriteLock lock = new ReentrantReadWriteLock();
    int n = 0;
    // one write at the same time
    public void increment() {  // y = 1
        try {
            lock.writeLock().lock();
            n++; // T1
        } finally {
            lock.writeLock().unlock();
        }
    }
    // many threads can read simultaneously
    public int get() {   // x = 1000   x / y = 1000
        try {
            lock.readLock().lock();
            return n;
        } finally {
            lock.readLock().unlock();
        }
    }
}
