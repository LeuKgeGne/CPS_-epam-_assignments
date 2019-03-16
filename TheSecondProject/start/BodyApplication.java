package epam.bsuir.oop.start;

import epam.bsuir.oop.manipulations.ButtonManipulations;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class BodyApplication extends Application {
    Initialization init = new Initialization();

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        init.gridPane.setPadding(init.insets);
        init.gridPane.setVgap(Constants.SET_V_GAP);
        init.gridPane.setHgap(Constants.SET_H_GAP);
        init.gridPane.add(init.imageView, Constants.IMAGE_COOR_X, Constants.IMAGE_COOR_Y);
        //Buttons
        init.gridPane.add(init.createButton, Constants.CREATE_BTN_X, Constants.CREATE_BTN_Y);
        init.gridPane.add(init.buttonOfEating, Constants.EAT_BTN_X, Constants.EAT_BTN_Y);
        init.gridPane.add(init.buttonOfSpeaking, Constants.SPEAK_BTN_X, Constants.SPEAK_BTN_Y);
        init.gridPane.add(init.buttonOfScratching, Constants.SCRATCH_BTN_X, Constants.SCRATCH_BTN_Y);
        init.gridPane.add(init.buttonOfSneezing, Constants.SNEEZE_BTN_X, Constants.SNEEZE_BTN_Y);

        init.createButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            ButtonManipulations.callMyTinyFactory(init);
            }
        });

        init.buttonOfEating.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ButtonManipulations.eating(init.head);
            }
        });

        init.buttonOfSpeaking.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ButtonManipulations.speaking(init.head);
            }
        });

        init.buttonOfScratching.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ButtonManipulations.scratching(init.head);
            }
        });

        init.buttonOfSneezing.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ButtonManipulations.sneezing(init.head);
            }
        });

        stage.setTitle(Constants.APP_NAME);
        stage.setScene(init.scene);
        stage.show();
    }
}
