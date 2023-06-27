package ru.lis154;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class EvenIterator implements Iterator<Integer> {
    Iterator<Integer> list;
    Integer curent;
    boolean hasNext = false;
    int curentIndex = 0;

    public EvenIterator(Iterator<Integer> list) {
        this.list = list;
    }
    public boolean hasNext() {
       // return list.hasNext();
       hasNext = true;
        while (list.hasNext()){
            int next = list.next();
            if (next % 2 == 0) {
                curent = next;
                return true;
            }
        }
        return false;
    }
    public Integer next() {
        if (hasNext) {
            hasNext = false;
            return curent;
        } else {
            while (true) {
                int el = list.next();
                if (el % 2 == 0)
                    return el;
            }
        }
    }


//    while (iterator.hasNext()){
//        System.out.println(iterator.next());
//    }
}
