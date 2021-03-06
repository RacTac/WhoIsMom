package sample;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("momshower.fxml"));
        primaryStage.setTitle("");
        Image momLogo = new Image("/sample/momLogo.png");
        primaryStage.getIcons().add(momLogo);
        primaryStage.setScene(new Scene(root, 215, 215));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
