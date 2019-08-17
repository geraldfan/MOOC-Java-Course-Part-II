
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
public class Container {

    private final int limit;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int weight = 0;

    public Container(int limit) {
        this.limit = limit;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (limit >= suitcase.totalWeight() + weight) {
            suitcases.add(suitcase);
            weight += suitcase.totalWeight();
        }
    }
    public void printThings(){
        for(int i = 0; i < suitcases.size(); i++){
            suitcases.get(i).printThings();
        }
    }
    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + weight + " kg)";
    }
}
