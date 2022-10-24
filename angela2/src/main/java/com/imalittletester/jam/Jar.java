package com.imalittletester.jam;

public class Jar{
    public int jarQty;
    public int jarCapacity;

    public Jar (){

    }
    public Jar (int jarQty, int jarCapacity){
        this.jarQty = jarQty;
        this.jarCapacity = jarCapacity;
    }

    @Override
    public String toString() {
        return "Jar{" +
                "jarQty=" + jarQty +
                ", jarCapacity=" + jarCapacity +
                '}';
    }
}
