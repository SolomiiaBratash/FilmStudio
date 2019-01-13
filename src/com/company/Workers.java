package com.company;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Workers {
    ArrayList<workerFrame> workers = new ArrayList<workerFrame>(createWorkers());

    public static ArrayList<workerFrame> createWorkers(){
        ArrayList<workerFrame> workers = new ArrayList<>();
        workers.add(new workerFrame(SpecializationType.ACTOR, 100));
        workers.add(new workerFrame(SpecializationType.DESIGNER,200));
        workers.add(new workerFrame(SpecializationType.OPERATOR,50));

        return workers;
    }

    public static ArrayList<workerFrame> sortedList(ArrayList<workerFrame> workers) {
        priceComparator myPriceComparator = new priceComparator();
        workers.sort(myPriceComparator);

        return workers;
    }

    public void searchBySpecializationType(ArrayList<String> specType){
        sortedList(workers);
            for(workerFrame counterWorkers : workers)
                if(specType.contains(counterWorkers.specialization.toString()))
                    System.out.println(counterWorkers);

    }

    /*
    *  Return sorted workers:
     Workers w = new Workers();
     w.sortedList();
     */
}
