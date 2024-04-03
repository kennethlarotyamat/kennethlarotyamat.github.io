package edu.unlv.mis768.labwork15;

import java.text.DecimalFormat;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MetricConverterController {

    @FXML
    private TextField kiloTextField;

    @FXML
    private RadioButton inchesRadioButton;

    @FXML
    private ToggleGroup unit;

    @FXML
    private RadioButton milesRadioButton;

    @FXML
    private RadioButton feetRadioButton;

    @FXML
    private Label resultLabel;
    
    /**
     * Event listener for the radio buttons.
     * The three radio buttons shared the same action
     */

    public void radioButtonListener() {
    	// declaring variables
    	double kilo=0; // to be entered by the user 
    	String convertTo=""; // the unit of the result
    	double result = 0; // the resulting value to be calculated
    	
    	// formatter
    	DecimalFormat ft = new DecimalFormat("###,##0.00");
    	
    	// get user input
    	kilo = Double.parseDouble(kiloTextField.getText()); 
    			
    	// determine which radio button is selected
    	// convert the distance accordingly
    	
    	
    	// show the output
    	resultLabel.setText("it is "+ft.format(result)+" "+convertTo);
    	
    }
}
