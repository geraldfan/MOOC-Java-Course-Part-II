
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerald
 */
public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> items = new ArrayList<ToBeStored> ();
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
    }
    public void add(ToBeStored item){
        if(weight() + item.weight() <= maxWeight){
            items.add(item);
        }
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored item : items){
            weight += item.weight();
        }
        return weight;
    }
    @Override
    public String toString(){
        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
}
