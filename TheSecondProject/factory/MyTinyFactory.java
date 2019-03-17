package epam.bsuir.oop.factory;

import epam.bsuir.oop.model.Brain;
import epam.bsuir.oop.model.Head;
import epam.bsuir.oop.model.Mouth;
import epam.bsuir.oop.model.Nose;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class MyTinyFactory {
    public static void createdAHead(Head head) {
        head.setOrgans(createABrain(new Brain()));
        head.setOrgans(createAMouth(new Mouth()));
        head.setOrgans(createANose(new Nose()));
    }

    //I didn't make any constants for these methods, cause
    //in my opinion it's not too much important here, just
    //my thoughts,however you're able to change my mind ;)
    public static Brain createABrain(Brain brain) {
        brain.setWeightOfOrgan(500 + random(1500 - 500));
        brain.setEfficientFactor(5 + random(100 - 5));
        return brain;
    }

    public static Nose createANose(Nose nose) {
        String[] noseFigures = {"Aquiline", "Big", "Straight", "Upturned"};
        nose.setFigureOfNose(noseFigures[(int)random(3)]);
        nose.setWeightOfOrgan(100 + random(300 - 100));
        return nose;
    }

    public static Mouth createAMouth(Mouth mouth) {
        String[] mouthFigures = {"Wide", "Big", "Small", "Medium"};
        mouth.setSizeOfMouth(mouthFigures[(int)random(3)]);
        mouth.setWeightOfOrgan(100 + random(250 - 100));
        return mouth;
    }
}
