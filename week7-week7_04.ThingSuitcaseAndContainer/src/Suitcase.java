
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
public class Suitcase {

    private int limit;
    private int weight = 0;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int limit) {
        this.limit = limit;
    }

    public void addThing(Thing thing) {
        if (limit >= weight + thing.getWeight()) {
            things.add(thing);
            weight += thing.getWeight();
        }
    }

    public void printThings() {
        for (int i = 0; i < things.size(); i++) {
            System.out.println(things.get(i));
        }
    }

    public int totalWeight() {
        return weight;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        } else {
            int countIndex = 0;
            int heaviest = 0;
            for (int i = 0; i < things.size(); i++) {
                if (things.get(i).getWeight() > heaviest) {
                    heaviest = things.get(i).getWeight();
                    countIndex = i;
                }
            }
            return things.get(countIndex);
        }
    }

    @Override
    public String toString() {
        if (things.size() > 1) {
            return things.size() + " things (" + weight + "kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing (" + weight + "kg)";
        } else {
            return "empty (" + weight + "kg)";
        }
    }
}
