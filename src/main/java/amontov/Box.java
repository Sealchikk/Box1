package amontov;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    List<T> box;

    public Box() {
        box = new ArrayList<>();
    }
    public double getWeight() {
        if (!checkBox()) {
            if (checkBoxForFruit() instanceof Orange) {
                return box.size() * 1.5;
            } else {
                return box.size();
            }
        } else return 0;
    }

    public boolean compare (Box newBox) {
        return getWeight() == newBox.getWeight();
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    private Fruit checkBoxForFruit() {
       return box.get(0);
    }

    private boolean checkBox() {
        return box.size() == 0;
    }


}
