package com.company;

public class workerFrame {
    protected SpecializationType specialization;
    protected double price;

    workerFrame(SpecializationType specialization, double price){
        this.specialization = specialization;
        this.price = price;
    }

    @Override
    public String toString(){
        final StringBuffer strBuf = new StringBuffer("Worker: ");
        strBuf.append("Specialization - ").append(specialization).append('\n').append('\t');
        strBuf.append("Price = ").append(price);
        return strBuf.toString();
    }
}
