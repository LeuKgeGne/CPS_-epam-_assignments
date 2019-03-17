package epam.bsuir.oop.start;

import epam.bsuir.oop.model.Head;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Initialization {
    //The most important part of this initialization:
    public GridPane gridPane = new GridPane();
    public Insets insets = new Insets(Constants.INSETS_TOP, Constants.INSETS_RIGHT,
            Constants.INSETS_BOTTOM, Constants.INSETS_LEFT);
    public Scene scene = new Scene(gridPane, Constants.APPLICATION_WIDTH, Constants.APPLICATION_HEIGHT);

    //Here we're keeping our head
    public Head head = new Head();

    //Button's field
    public Button createButton = new Button(Constants.CREATING_TEXT);
    public Button buttonOfEating = new Button(Constants.EAT_BTN_TEXT);
    public Button buttonOfSpeaking = new Button(Constants.SPEAK_BTN_TEXT);
    public Button buttonOfSneezing = new Button(Constants.SNEEZE_BTN_TEXT);
    public Button buttonOfScratching = new Button(Constants.SCRATCH_BTN_TEXT);

    //The an image & a path to the image
    public Image image = new Image("file:C:\\Users\\Admin\\IdeaProjects\\brain.jpg",
            Constants.IMAGE_WIDTH, Constants.IMAGE_HEIGHT, true, false);
    public ImageView imageView = new ImageView(image);
}
