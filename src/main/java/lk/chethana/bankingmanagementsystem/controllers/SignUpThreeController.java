package lk.chethana.bankingmanagementsystem.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class SignUpThreeController {
    @FXML
    private ToggleGroup accountType;

    @FXML
    private CheckBox checkATM;

    @FXML
    private CheckBox checkAgree;

    @FXML
    private CheckBox checkEStatment;

    @FXML
    private CheckBox checkEmailAlert;

    @FXML
    private CheckBox checkInternetBanking;

    @FXML
    private CheckBox checkMobileBanking;

    @FXML
    private CheckBox checkchequeBook;

    @FXML
    private RadioButton rBtnCurrent;

    @FXML
    private RadioButton rBtnFixedDeposit;

    @FXML
    private RadioButton rBtnRecurring;

    @FXML
    private RadioButton rBtnSaving;

    @FXML
    private AnchorPane root;

    @FXML
    private Label txtCardNumber;

    @FXML
    private Label txtFormNo;


    @FXML
    private Label txtPinNumber;

    @FXML
    void Cancel(ActionEvent event) {

    }

    @FXML
    void Submit(ActionEvent event) {

    }

    @FXML
    void agree(ActionEvent event) {

    }

    @FXML
    void checkService(ActionEvent event) {

    }

    @FXML
    void getAccountType(ActionEvent event) {

    }
}
