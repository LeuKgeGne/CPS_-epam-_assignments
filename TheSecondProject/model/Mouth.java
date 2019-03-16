package epam.bsuir.oop.model;

import epam.bsuir.oop.start.Constants;
import javafx.scene.control.Alert;

public class Mouth extends Organ{
    private String sizeOfMouth;

    public void setSizeOfMouth(String _sizeOfMouth) {
        this.sizeOfMouth = _sizeOfMouth;
    }

    public String getSizeOfMouth() {
        return sizeOfMouth;
    }

    public void eat() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(Constants.EAT_TITLE);
        alert.setHeaderText(Constants.EAT_TEXT);
        alert.show();
    }

    public void speak() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(Constants.SPEAK_TITLE);
        alert.setHeaderText(Constants.SPEAK_TEXT);
        alert.show();
    }
}
