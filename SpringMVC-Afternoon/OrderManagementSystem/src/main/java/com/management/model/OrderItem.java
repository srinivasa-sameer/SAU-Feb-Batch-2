package com.management.model;

public class OrderItem {
    private int id, units;
    private Item item;
    private long totalCost;



    public void setTotalCost(long totalCost) {
        this.totalCost += totalCost;
    }
    
    public long getTotalCost() {
        return totalCost;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    public int getUnits() {
        return units;
    }

    
    public void setItem(Item item) {
        this.item = item;
    }
    public Item getItem() {
        return item;
    }


    
    public boolean isValid(){
        if(this.item.isValid()){
            if(this.units != 0){
                return true;
            }
        }
        return false;
    }
}