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
        firstNumber = currentNumber;
        currentNumber = "";
        savedNumbers.setText(firstNumber + " " + calculationType);
    }

    @FXML
    void EQE(ActionEvent event) {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationType) {
            case "+" -> {
                int calculatedNumber = firstNumberInt + secondNumberInt;
                savedNumbers.setText(firstNumber + " + " + currentNumber + " = " + calculatedNumber);
                text.setText(String.valueOf(calculatedNumber));

            }
            case "-" -> {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                savedNumbers.setText(firstNumber + " - " + currentNumber + " = " + calculatedNumber);
                text.setText(String.valueOf(calculatedNumber));
            }
            case "/" -> {
                double calculatedNumber = firstNumberInt / (double) secondNumberInt;
                savedNumbers.setText(firstNumber + " / " + currentNumber + " = " + calculatedNumber);
                text.setText(String.valueOf(calculatedNumber));
            }
            case "*" -> {
                int calculatedNumber = firstNumberInt * secondNumberInt;
                savedNumbers.setText(firstNumber + " * " + currentNumber + " = " + calculatedNumber);
                text.setText(String.valueOf(calculatedNumber));
            }

        }
    }

    @FXML
    void BS(ActionEvent event) {

    }

    @FXML
    void C(ActionEvent event) {
        currentNumber = "";
        text.setText("");
        savedNumbers.setText("");

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
