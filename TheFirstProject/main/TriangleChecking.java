package bsuir.epam.first_application.main;

import bsuir.epam.first_application.initialization.Initialization;
import bsuir.epam.first_application.constants.Constants;
import bsuir.epam.first_application.manipulations.ButtonManipulations;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class TriangleChecking extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        Initialization init = new Initialization();
        init.gridPane.setPadding(init.insets);

        init.gridPane.setVgap(Constants.SET_V_GAP);
        init.gridPane.setHgap(Constants.SET_H_GAP);
        init.gridPane.add(init.text1, Constants.TEXT_1_COR_X, Constants.TEXT_1_COR_Y);
        init.gridPane.add(init.text2, Constants.TEXT_2_COR_X, Constants.TEXT_2_COR_Y);
        init.gridPane.add(init.text3, Constants.TEXT_3_COR_X, Constants.TEXT_3_COR_Y);
        init.gridPane.add(init.underText1, Constants.UNDER_TEXT_1_COR_X, Constants.UNDER_TEXT_1_COR_Y);
        init.gridPane.add(init.underText2, Constants.UNDER_TEXT_2_COR_X, Constants.UNDER_TEXT_2_COR_Y);
        init.gridPane.add(init.underText3, Constants.UNDER_TEXT_3_COR_X, Constants.UNDER_TEXT_3_COR_Y);
        init.gridPane.add(init.textField1, Constants.TEXT_FIELD_1_COR_X, Constants.TEXT_FIELD_1_COR_Y);
        init.gridPane.add(init.textField2, Constants.TEXT_FIELD_2_COR_X, Constants.TEXT_FIELD_2_COR_Y);
        init.gridPane.add(init.textField3, Constants.TEXT_FIELD_3_COR_X, Constants.TEXT_FIELD_3_COR_Y);
        init.gridPane.add(init.mainButton, Constants.MAIN_BUTTON_X, Constants.MAIN_BUTTON_Y);
        init.gridPane.add(init.clearButton, Constants.CLEAR_BUTTON_X, Constants.CLEAR_BUTTON_Y);
        init.gridPane.add(init.aboveText1, Constants.ABOVE_TEXT__1_COR_X, Constants.ABOVE_TEXT__1_COR_Y);
        init.gridPane.add(init.aboveText2, Constants.ABOVE_TEXT__2_COR_X, Constants.ABOVE_TEXT__2_COR_Y);
        init.gridPane.add(init.aboveText3, Constants.ABOVE_TEXT__3_COR_X, Constants.ABOVE_TEXT__3_COR_Y);

        init.mainButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.makeTryCatch(init);
            }
        });

        init.clearButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.makeClearMethod(init);
            }
        });

        stage.setScene(init.scene);
        stage.show();
    }
}
