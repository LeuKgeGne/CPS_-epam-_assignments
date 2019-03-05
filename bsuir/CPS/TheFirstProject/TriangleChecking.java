package bsuir.CPS.TheFirstProject;

import bsuir.CPS.TheFirstProject.ButtonManipulations;
import javafx.application.Application;
import javafx.stage.Stage;


import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;


public class TriangleChecking extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Initialization init = new Initialization();
        GridPane gridPane = new GridPane();


        gridPane.setPadding(new Insets(Constants.TEN, Constants.TEN, Constants.TEN, Constants.TEN));
        gridPane.setVgap(Constants.FIVE);
        gridPane.setHgap(Constants.FIVE);

        gridPane.add(init.text1, Constants.TEXT_1_COR_X, Constants.TEXT_1_COR_Y);
        gridPane.add(init.text2, Constants.TEXT_2_COR_X, Constants.TEXT_2_COR_Y);
        gridPane.add(init.text3, Constants.TEXT_3_COR_X, Constants.TEXT_3_COR_Y);

        gridPane.add(init.underText1, Constants.UNDER_TEXT_1_COR_X, Constants.UNDER_TEXT_1_COR_Y);
        gridPane.add(init.underText2, Constants.UNDER_TEXT_2_COR_X, Constants.UNDER_TEXT_2_COR_Y);
        gridPane.add(init.underText3, Constants.UNDER_TEXT_3_COR_X, Constants.UNDER_TEXT_3_COR_Y);

        gridPane.add(init.textField1, Constants.TEXT_FIELD_1_COR_X, Constants.TEXT_FIELD_1_COR_Y);
        gridPane.add(init.textField2, Constants.TEXT_FIELD_2_COR_X, Constants.TEXT_FIELD_2_COR_Y);
        gridPane.add(init.textField3, Constants.TEXT_FIELD_3_COR_X, Constants.TEXT_FIELD_3_COR_Y);

        gridPane.add(init.mainButton, Constants.MAIN_BUTTON_X, Constants.MAIN_BUTTON_Y);
        gridPane.add(init.clearButton, Constants.CLEAR_BUTTON_X, Constants.CLEAR_BUTTON_Y);

        gridPane.add(init.aboveText1, Constants.ABOVE_TEXT__1_COR_X, Constants.ABOVE_TEXT__1_COR_Y);
        gridPane.add(init.aboveText2, Constants.ABOVE_TEXT__2_COR_X, Constants.ABOVE_TEXT__2_COR_Y);
        gridPane.add(init.aboveText3, Constants.ABOVE_TEXT__3_COR_X, Constants.ABOVE_TEXT__3_COR_Y);


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

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }
}