package bsuir.CPS.TheFirstProject;

import javafx.scene.control.Alert;
import javafx.scene.layout.GridPane;

public class ButtonManipulations {
    private static final String YEP = "Yep";
    private static final String NOPE = "Nope";
    private static final String IF_ERROR = "Wrong input is HERE!";
    private static final String NOTHING = "";

    public static void makeTryCatch(Initialization init) {
        int a, b, c;
        try {
            a = Integer.parseInt(init.textField1.getText());
            b = Integer.parseInt(init.textField2.getText());
            c = Integer.parseInt(init.textField3.getText());

            if (Manipulations.isEquilateralTriangle(a, b, c)) {

                init.aboveText1.setText(YEP);
            } else {

                init.aboveText1.setText(NOPE);
            }

            if (Manipulations.isIsoscelesTriangle(a, b, c)) {

                init.aboveText2.setText(YEP);
            } else {

                init.aboveText2.setText(NOPE);
            }

            if (Manipulations.isRightTriangle(a, b, c)) {

                init.aboveText3.setText(YEP);
            } else {

                init.aboveText3.setText(NOPE);
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(IF_ERROR);
            alert.show();
        }
    }

    public static void makeClearMethod(Initialization init) {
        init.textField1.clear();
        init.textField2.clear();
        init.textField3.clear();

        init.aboveText1.setText(NOTHING);
        init.aboveText2.setText(NOTHING);
        init.aboveText3.setText(NOTHING);
    }
}
