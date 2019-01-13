package com.company;

import java.util.Comparator;

public class priceComparator implements Comparator<workerFrame> {
    public int compare(workerFrame wf1, workerFrame wf2) {
        if (wf1.price == wf2.price) {
            return 0;
        }
        else if (wf1.price > wf2.price) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
