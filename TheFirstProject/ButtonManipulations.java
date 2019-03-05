package bsuir.CPS.TheFirstProject;

import javafx.scene.control.Alert;

public class ButtonManipulations {
    public static void makeTryCatch(Initialization init) {
        int a, b, c;
        try {
            a = Integer.parseInt(init.textField1.getText());
            b = Integer.parseInt(init.textField2.getText());
            c = Integer.parseInt(init.textField3.getText());

            if (Manipulations.isEquilateralTriangle(a, b, c)) {
                init.aboveText1.setText(Constants.YEP);
            } else {
                init.aboveText1.setText(Constants.NOPE);
            }
            if (Manipulations.isIsoscelesTriangle(a, b, c)) {
                init.aboveText2.setText(Constants.YEP);
            } else {
                init.aboveText2.setText(Constants.NOPE);
            }
            if (Manipulations.isRightTriangle(a, b, c)) {
                init.aboveText3.setText(Constants.YEP);
            } else {
                init.aboveText3.setText(Constants.NOPE);
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(Constants.IF_ERROR);
            alert.show();
        }
    }

    public static void makeClearMethod(Initialization init) {
        init.textField1.clear();
        init.textField2.clear();
        init.textField3.clear();
        init.aboveText1.setText(Constants.NOTHING);
        init.aboveText2.setText(Constants.NOTHING);
        init.aboveText3.setText(Constants.NOTHING);
    }
}
