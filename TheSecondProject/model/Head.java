package epam.bsuir.oop.model;

import epam.bsuir.oop.start.Constants;
import java.util.ArrayList;

public class Head {
    private ArrayList<Organ> organs = new ArrayList<>(3);

    public void setOrgans(Organ organ) {
        organs.add(organ);
    }

    public Brain getBrain() {
        return (Brain)organs.get(Constants.BRAIN_POS_IN_ARR);
    }

    public Mouth getMouth() {
        return (Mouth)organs.get(Constants.MOUTH_POS_IN_ARR);
    }

    public Nose getNose() {
        return (Nose)organs.get(Constants.NOSE_POS_IN_ARR);
    }
}
