package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Button button1 = new Button("1");
    private Button button2 = new Button("2");
    private Button button3 = new Button("3");
    private Button button4 = new Button("4");
    private Button button5 = new Button("5");
    private Button button6 = new Button("6");
    private Button button7 = new Button("7");
    private Button button8 = new Button("8");
    private Button button9 = new Button("9");
    private Button button10 = new Button("10");
    private Button button11 = new Button("11");
    private Button button12 = new Button("12");
    private Button button13 = new Button("13");
    private Button button14 = new Button("14");
    private Button button15 = new Button("15");
    private Label empty = new Label();

    @Override
    public void start(Stage primaryStage) throws Exception{

        GridPane gridPane = new GridPane();
        gridPane.addRow(0, button1, button2, button3, button4);
        gridPane.addRow(1, button5, button6, button7, button8);
        gridPane.addRow(2, button9, button10, button11, button12);
        gridPane.addRow(3, button13, button14, button15, empty);

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        button1.setMinSize(100,100);
        button2.setMinSize(100,100);
        button3.setMinSize(100,100);
        button4.setMinSize(100,100);
        button5.setMinSize(100,100);
        button6.setMinSize(100,100);
        button7.setMinSize(100,100);
        button8.setMinSize(100,100);
        button9.setMinSize(100,100);
        button10.setMinSize(100,100);
        button11.setMinSize(100,100);
        button12.setMinSize(100,100);
        button13.setMinSize(100,100);
        button14.setMinSize(100,100);
        button15.setMinSize(100,100);
        empty.setMinSize(100,100);

        Scene root = new Scene(gridPane, 433,433);
        primaryStage.setTitle("15 Game");
        primaryStage.sizeToScene();
        primaryStage.setScene(root);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}