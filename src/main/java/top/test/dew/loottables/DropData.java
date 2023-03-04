package top.test.dew.loottables;

import java.util.HashMap;
import java.util.List;

public class DropData {

    private int weight;

    private final HashMap<String, Integer> items;

    private final List<String> message;

    public DropData(int weight, HashMap<String, Integer> items, List<String> message) {
        this.weight = weight;
        this.items = items;
        this.message = message;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public List<String> getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "{ weight=" + weight + ", items=" + items + ", messages=" + message + "}";
    }
}
