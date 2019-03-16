package bsuir.epam.first_application.initialization;

import bsuir.epam.first_application.constants.Constants;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Initialization {
    public GridPane gridPane = new GridPane();
    public Scene scene = new Scene(gridPane);
    public Insets insets = new Insets(Constants.INSETS_TOP, Constants.INSETS_RIGHT,
            Constants.INSETS_BOTTOM, Constants.INSETS_LEFT);
    //Text's initialization
    public Text text1 = new Text(Constants.TEXT_1_STRING);
    public Text text2 = new Text(Constants.TEXT_2_STRING);
    public Text text3 = new Text(Constants.TEXT_3_STRING);
    public Text underText1 = new Text(Constants.UNDER_TEXT_1_STRING);
    public Text underText2 = new Text(Constants.UNDER_TEXT_2_STRING);
    public Text underText3 = new Text(Constants.UNDER_TEXT_3_STRING);
    public Text aboveText1 = new Text();
    public Text aboveText2 = new Text();
    public Text aboveText3 = new Text();
    public TextField textField1 = new TextField();
    public TextField textField2 = new TextField();
    public TextField textField3 = new TextField();
    //Button's initialization
    public Button mainButton = new Button(Constants.MAIN_BUTTON_TEXT);
    public Button clearButton = new Button(Constants.CLEAR_BUTTON_TEXT);
}

