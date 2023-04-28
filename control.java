import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class control {

    @FXML
    private TextField text;
    @FXML
    private Text savedNumbers;

    private String firstNumber = "";

    private String currentNumber = "";

    private String outputNumber = "";

    private String calculationType;

    @FXML
    void MULT(ActionEvent event) {
        calculationSetup("*");

    }

    @FXML
    void DIVI(ActionEvent event) {
        calculationSetup("/");

    }

    @FXML
    void SUB(ActionEvent event) {
        calculationSetup("-");

    }

    @FXML
    void PLUS(ActionEvent event) {
        calculationSetup("+");

    }

    public void calculationSetup(String calculationType) {
        this.calculationType = calculationType;
        if (outputNumber == "") {
            firstNumber = currentNumber;
            currentNumber = "";
            savedNumbers.setText(firstNumber + " " + calculationType);
        } else {
            firstNumber = outputNumber;
            currentNumber = "";
            savedNumbers.setText(firstNumber + "" + calculationType);
        }

    }

    @FXML
    public void EQE(ActionEvent event) {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationType) {
            case "+" -> {

                int calculatedNumber = firstNumberInt + secondNumberInt;
                savedNumbers.setText(firstNumber + " + " + currentNumber + " = ");
                text.setText(String.valueOf(calculatedNumber));
                outputNumber = Integer.toString(calculatedNumber);

            }
            case "-" -> {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                savedNumbers.setText(firstNumber + " - " + currentNumber + " = ");
                text.setText(String.valueOf(calculatedNumber));
                outputNumber = Integer.toString(calculatedNumber);
            }

            case "/" -> {
                double calculatedNumber = firstNumberInt / (double) secondNumberInt;
                savedNumbers.setText(firstNumber + " / " + currentNumber + " = ");
                text.setText(String.valueOf(calculatedNumber));
                outputNumber = Double.toString(calculatedNumber);

            }
            case "*" -> {
                int calculatedNumber = firstNumberInt * secondNumberInt;
                savedNumbers.setText(firstNumber + " * " + currentNumber + " = ");
                text.setText(String.valueOf(calculatedNumber));
                outputNumber = Integer.toString(calculatedNumber);

            }
        }

    }

    @FXML
    void BS(ActionEvent event) {
        String backspace = null;
        if (text.getText().length() > 0) {
            StringBuilder strBuilder = new StringBuilder(text.getText());
            strBuilder.deleteCharAt(text.getText().length() - 1);
            backspace = strBuilder.toString();
            currentNumber = backspace;
            updateTextField();
        }

    }

    @FXML
    void C(ActionEvent event) {
        currentNumber = "";
        text.setText("");
        savedNumbers.setText("");
        outputNumber = "";

    }

    @FXML
    void CE(ActionEvent event) {

    }

    @FXML
    void DOT(ActionEvent event) {

    }

    @FXML
    void FRAC(ActionEvent event) {

    }

    @FXML
    void M(ActionEvent event) {

    }

    @FXML
    void MC(ActionEvent event) {

    }

    @FXML
    void MR(ActionEvent event) {

    }

    @FXML
    void MS(ActionEvent event) {

    }

    @FXML
    void Mminus(ActionEvent event) {

    }

    @FXML
    void Mplus(ActionEvent event) {

    }

    @FXML
    void PEC(ActionEvent event) {
        String checktf = text.getText();
        int checktfint = Integer.parseInt(checktf);
        if (text.getText().length() > 0 && checktfint != 0) {
            if (outputNumber == "") {
                double percentageVal1 = Double.parseDouble(currentNumber);
                double percentageD = percentageVal1 / 100;
                currentNumber = Double.toString(percentageD);
                updateTextField();
            } else {
                double percentageVal1 = Double.parseDouble(outputNumber);
                double percentageD = percentageVal1 / 100;
                currentNumber = Double.toString(percentageD);
                updateTextField();
            }
        } else {
            text.setText("Error!");
        }

    }

    @FXML
    void PL0RMI(ActionEvent event) {

    }

    @FXML
    void ROOT(ActionEvent event) {

    }

    @FXML
    void SQU(ActionEvent event) {

    }

    @FXML
    void ZER(ActionEvent event) {
        if (!currentNumber.equals("")) {
            addNumber("0");
        }

    }

    @FXML
    void ONE(ActionEvent event) {
        addNumber("1");

    }

    @FXML
    void TWO(ActionEvent event) {
        addNumber("2");

    }

    @FXML
    void THR(ActionEvent event) {
        addNumber("3");

    }

    @FXML
    void FOU(ActionEvent event) {
        addNumber("4");

    }

    @FXML
    void FIV(ActionEvent event) {
        addNumber("5");

    }

    @FXML
    void SIX(ActionEvent event) {
        addNumber("6");

    }

    @FXML
    void SEV(ActionEvent event) {
        addNumber("7");

    }

    @FXML
    void EGH(ActionEvent event) {
        addNumber("8");

    }

    @FXML
    void NIN(ActionEvent event) {
        addNumber("9");

    }

    public void updateTextField() {
        text.setText(currentNumber);
    }

    public void addNumber(String number) {
        currentNumber += number;
        updateTextField();
    }

}
