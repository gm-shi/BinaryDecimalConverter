package controller;

import javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Calculator;

public class CalculatorController {
    private Calculator calculator;
    @FXML private TextField d1Tf;
    @FXML private TextField d2Tf;
    @FXML private TextField d3Tf;
    @FXML private TextField d4Tf;
    @FXML private TextField b1Tf;
    @FXML private TextField b2Tf;
    @FXML private TextField b3Tf;
    @FXML private TextField b4Tf;


    @FXML
    public void initialize (){
        calculator = new Calculator();
        reset();
    }

    public void toDecimalHandler(ActionEvent event) {
        String[] binary = new String[4];
        binary[0] = b1Tf.getText();
        binary[1] = b2Tf.getText();
        binary[2] = b3Tf.getText();
        binary[3] = b4Tf.getText();
        calculator.toDecimal(binary);
        d1Tf.setText(calculator.getAddress().get(0).getDecimal() + "");
        d2Tf.setText(calculator.getAddress().get(1).getDecimal() + "");
        d3Tf.setText(calculator.getAddress().get(2).getDecimal() + "");
        d4Tf.setText(calculator.getAddress().get(3).getDecimal() + "");

    }

    public void toBinaryHandler(ActionEvent event) {
        String[] decimal = new String[4];
        decimal[0] = d1Tf.getText();
        decimal[1] = d2Tf.getText();
        decimal[2] = d3Tf.getText();
        decimal[3] = d4Tf.getText();
        calculator.toBinary(decimal);
        b1Tf.setText(calculator.getAddress().get(0).getBinary());
        b2Tf.setText(calculator.getAddress().get(1).getBinary());
        b3Tf.setText(calculator.getAddress().get(2).getBinary());
        b4Tf.setText(calculator.getAddress().get(3).getBinary());

    }

    public void resetHandler(ActionEvent event) {
        reset();
    }
    private void reset(){
        d1Tf.setText("0");
        d2Tf.setText("0");
        d3Tf.setText("0");
        d4Tf.setText("0");
        b1Tf.setText("00000000");
        b2Tf.setText("00000000");
        b3Tf.setText("00000000");
        b4Tf.setText("00000000");

    }
}
