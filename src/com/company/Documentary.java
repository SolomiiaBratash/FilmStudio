package com.company;

public class Documentary extends filmFrame {
    Documentary(){
        filmType = FilmType.DOCUMENTARY;
        this.neededWorkers.add(SpecializationType.ACTOR.toString());
        this.neededWorkers.add(SpecializationType.OPERATOR.toString());
    }
}
