package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Controller {

    public void swapButtons(Button button, Label empty) {

        if (checkEmpty(button, empty)) {
        Integer temp = GridPane.getRowIndex(button);
        GridPane.setRowIndex(button, GridPane.getRowIndex(empty));
        GridPane.setRowIndex(empty, temp);

        temp = GridPane.getColumnIndex(button);
        GridPane.setColumnIndex(button, GridPane.getColumnIndex(empty));
        GridPane.setColumnIndex(empty, temp);
        }
    }

    public boolean checkEmpty(Button button, Label empty) {
        boolean check = false;
        Integer buttonRowIndex = GridPane.getRowIndex(button);
        Integer buttonColumnIndex = GridPane.getColumnIndex(button);
        Integer emptyRowIndex = GridPane.getRowIndex(empty);
        Integer emptyColumnIndex = GridPane.getColumnIndex(empty);

        if (buttonColumnIndex == emptyColumnIndex -1 && buttonRowIndex == emptyRowIndex ||
        buttonColumnIndex == emptyColumnIndex && buttonRowIndex == emptyRowIndex -1 ||
        buttonColumnIndex == emptyColumnIndex + 1 && buttonRowIndex == emptyRowIndex ||
        buttonColumnIndex == emptyColumnIndex && buttonRowIndex == emptyRowIndex + 1) {
            check = true;
        }
        return check;
    }
}
