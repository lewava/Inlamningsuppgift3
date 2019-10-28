package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Controller {

    public void swapButtons(Button button, Label empty) {
        Integer temp  = GridPane.getRowIndex(button);
        GridPane.setRowIndex(button, GridPane.getRowIndex(empty));
        GridPane.setRowIndex(empty, temp);

        temp = GridPane.getColumnIndex(button);
        GridPane.setColumnIndex(button, GridPane.getColumnIndex(empty));
        GridPane.setColumnIndex(empty, temp);
    }
}
