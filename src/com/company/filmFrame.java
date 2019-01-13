package com.company;

import java.util.ArrayList;

public abstract class filmFrame {
    protected FilmType filmType;
    protected static ArrayList<String> neededWorkers = new ArrayList<>();

    public enum FilmType {
        DOCUMENTARY, DANCE, ETHNOGRAPHIC, REALITY, HORROR;
    }

    public static void seachWorkers(){
        Workers workers = new Workers();
        workers.searchBySpecializationType(neededWorkers);
    }
}
