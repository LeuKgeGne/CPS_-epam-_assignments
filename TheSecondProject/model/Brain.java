package epam.bsuir.oop.model;

public class Brain extends Organ{
    private double efficientFactor;

    public double getEfficientFactor() {
        return efficientFactor;
    }

    public void setEfficientFactor(double _efficientFactor) {
        this.efficientFactor = _efficientFactor;
    }

    public void controlOfOrgan(Head head, int changer) {
        switch (changer) {
            case 1: {
                head.getMouth().eat();
            } break;
            case 2: {
                head.getMouth().speak();
            } break;
            case 3: {
                head.getNose().scratch();
            } break;
            case 4: {
                head.getNose().sneeze();
            } break;
        }
    }
}
