package bsuir.CPS.TheFirstProject;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Initialization {
    private static final String MAIN_BUTTON_TEXT = "Check it";
    private static final String CLEAR_BUTTON_TEXT = "Clear fields";

    private static final String TEXT_1_STRING = "Side 1";
    private static final String TEXT_2_STRING = "Side 2";
    private static final String TEXT_3_STRING = "Side 3";

    private static final String UNDER_TEXT_1_STRING = "Equilateral triangle: ";
    private static final String UNDER_TEXT_2_STRING = "Isosceles triangle: ";
    private static final String UNDER_TEXT_3_STRING = "Right triangle: ";


    protected Text text1 = new Text(TEXT_1_STRING);
    protected Text text2 = new Text(TEXT_2_STRING);
    protected Text text3 = new Text(TEXT_3_STRING);
    protected Text underText1 = new Text(UNDER_TEXT_1_STRING);
    protected Text underText2 = new Text(UNDER_TEXT_2_STRING);
    protected Text underText3 = new Text(UNDER_TEXT_3_STRING);

    protected Text aboveText1 = new Text();
    protected Text aboveText2 = new Text();
    protected Text aboveText3 = new Text();

    protected TextField textField1 = new TextField();
    protected TextField textField2 = new TextField();
    protected TextField textField3 = new TextField();

    protected Button mainButton = new Button(MAIN_BUTTON_TEXT);
    protected Button clearButton = new Button(CLEAR_BUTTON_TEXT);
}

