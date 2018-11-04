package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Controller {

    public Button showResultButton;
    public ImageView result;
    public Label mom;
    public Label cathOrLou;

    public void showResult() {

        Random random = new Random();

        boolean randomBoolean = random.nextBoolean();

        System.out.println(randomBoolean);

        if(randomBoolean == true) {
            cathOrLou.setText("Cath");
            Image image = new Image("/sample/momCath.png");
            mom.setVisible(true);
            result.setImage(image);
            return;
        }

        cathOrLou.setText("Lou");
        mom.setVisible(true);
        Image image = new Image("/sample/louMom.png");
        result.setImage(image);
        return;
    }

}
