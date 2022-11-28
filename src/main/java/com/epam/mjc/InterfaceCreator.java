package com.epam.mjc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        List<Integer> res = new ArrayList<>();
        return x -> {
            Iterator<Integer> iterator = x.iterator();
            while (iterator.hasNext()) {
                res.add(iterator.next() / divider);
            }
            return res;
        };
    }
}
