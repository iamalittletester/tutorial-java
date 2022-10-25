package com.imalittletester.jam;

public class Recipient {
    public String recipientName;
    public int recipientQty;
    public int recipientCapacity;

    public Recipient (){

    }

    public Recipient(String recipientName, int recipientQty, int recipientCapacity){
        this.recipientName = recipientName;
        this.recipientQty = recipientQty;
        this.recipientCapacity = recipientCapacity;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "recipientName='" + recipientName + '\'' +
                ", recipientQty=" + recipientQty +
                ", recipientCapacity=" + recipientCapacity +
                '}';
    }
}
