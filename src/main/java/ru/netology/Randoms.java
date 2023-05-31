package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int diff;
    protected int min;

    public Randoms(int min, int max) {
        this.min = min;
        this.diff = max - min;
        random = new Random();


    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int i = random.nextInt(diff + 1);
                return i + min;

            }
        };

    }
}

