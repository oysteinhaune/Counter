package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CounterController {

    Counter counter = null;

    @FXML
    TextField endInput;

    @FXML
    Label counterOutput;

    @FXML
    Button newCounterButton;

    @FXML
    Button countButton;

    @FXML
    Button resetButton;

    @FXML
    public void initialize() {
        counterOutput.setText("No counter");
        countButton.setDisable(true);
        resetButton.setDisable(true);
    }

    void updateCounterOutput() {
        counterOutput.setText("Current counter value: " + counter.getCounter());
    }

    @FXML
    void handleNewCounterAction() {
        if (this.isInteger(endInput.getText())) {
            int end = Integer.valueOf(endInput.getText());
            counter = new Counter(end);
            countButton.setDisable(false);
            updateCounterOutput();
        }
        else {
            newCounterButton.setDisable(true);
            countButton.setDisable(true);
            resetButton.setDisable(false);
        }
    }

    @FXML
    public void handleReset() {
        newCounterButton.setDisable(false);
        resetButton.setDisable(true);
    }

    @FXML
    public void handleCountAction(ActionEvent event) {
        counter.count();
        updateCounterOutput();
    }

    public boolean isInteger(String myString) {
        try {
            Integer.parseInt(myString);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
