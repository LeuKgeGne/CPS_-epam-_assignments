package epam.bsuir.oop.manipulations;

import epam.bsuir.oop.model.Head;
import epam.bsuir.oop.factory.MyTinyFactory;
import epam.bsuir.oop.start.Constants;
import epam.bsuir.oop.start.Initialization;
import javafx.scene.control.Alert;

public class ButtonManipulations {
    private ButtonManipulations() {}

    public static void callMyTinyFactory(Initialization init) {
        MyTinyFactory.createdAHead(init.head);
    }

    public static void eating(Head head) {
        try {
            if(head.getOrgans().size() != 0) {
                head.getBrain().controlOfOrgan(head, Constants.CHOICE_1);
            }
            else {
                throw new NullPointerException();
            }
        }
        catch(NullPointerException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(Constants.EATING_TITLE);
            alert.setHeaderText(Constants.EATING_TXT);
            alert.show();
        }
    }

    public static void speaking(Head head) {
        try {
            if(head.getOrgans().size() != 0) {
                head.getBrain().controlOfOrgan(head, Constants.CHOICE_2);
            }
            else {
                throw new NullPointerException();
            }
        }
        catch(NullPointerException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(Constants.SPEAKING_TITLE);
            alert.setHeaderText(Constants.SPEAKING_TXT);
            alert.show();
        }
    }

    public static void scratching(Head head) {
        try {
            if(head.getOrgans().size() != 0) {
                head.getBrain().controlOfOrgan(head, Constants.CHOICE_3);
            }
            else {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException ex){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(Constants.SCRATCHING_TITLE);
            alert.setHeaderText(Constants.SCRATCHING_TXT);
            alert.show();
        }
    }

    public static void sneezing(Head head) {
        try {
            if(head.getOrgans().size() != 0) {
                head.getBrain().controlOfOrgan(head, Constants.CHOICE_4);
            }
            else {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException ex){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(Constants.SNEEZING_TITLE);
            alert.setHeaderText(Constants.SNEEZING_TXT);
            alert.show();
        }
    }
}
