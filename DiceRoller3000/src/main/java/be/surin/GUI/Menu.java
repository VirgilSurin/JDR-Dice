package be.surin.GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Menu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane mainPane = new BorderPane();
        Scene mainScene = new Scene(mainPane);
        primaryStage.setScene(mainScene);

        HBox diceParameters = new HBox();
        diceParameters.setSpacing(25);

        //custom dice roll
        TextField numbOfDice = new TextField();
        numbOfDice.setMaxSize(50,15);
        TextField dice = new TextField();
        dice.setMaxSize(50,15);

        //Quick dice roll
        Button dice20 = new Button("roll d20");
        Button dice100 = new Button("roll d100");
        Button dice6 = new Button("roll d6");
        Button dice4 = new Button("roll d4");
        Button dice8 = new Button("roll d8");
        Button dice10 = new Button("roll d10");
        Button dice12 = new Button("roll d12");

        diceParameters.getChildren().addAll(numbOfDice, dice, dice100,dice20,dice6,dice12,dice10,dice8,dice4);


        //final set-up
        mainPane.setTop(diceParameters);
        primaryStage.show();
    }
}
