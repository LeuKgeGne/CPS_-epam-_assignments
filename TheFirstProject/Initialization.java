package bsuir.CPS.TheFirstProject;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Initialization {
    //Text's initialization
    protected Text text1 = new Text(Constants.TEXT_1_STRING);
    protected Text text2 = new Text(Constants.TEXT_2_STRING);
    protected Text text3 = new Text(Constants.TEXT_3_STRING);
    protected Text underText1 = new Text(Constants.UNDER_TEXT_1_STRING);
    protected Text underText2 = new Text(Constants.UNDER_TEXT_2_STRING);
    protected Text underText3 = new Text(Constants.UNDER_TEXT_3_STRING);
    protected Text aboveText1 = new Text();
    protected Text aboveText2 = new Text();
    protected Text aboveText3 = new Text();
    protected TextField textField1 = new TextField();
    protected TextField textField2 = new TextField();
    protected TextField textField3 = new TextField();
    //Button's initialization
    protected Button mainButton = new Button(Constants.MAIN_BUTTON_TEXT);
    protected Button clearButton = new Button(Constants.CLEAR_BUTTON_TEXT);
}

