package ba.unsa.etf.rpr.tutorijal05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane roro= new GridPane();
        TextField display = new TextField("0");


        Parent root = FXMLLoader.load(getClass().getResource("digitron.fxml"));
        primaryStage.setTitle("Digitron");
        primaryStage.setScene(new Scene(root, 200, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
