module lk.chethana.bankingmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.chethana.bankingmanagementsystem to javafx.fxml;
    exports lk.chethana.bankingmanagementsystem;
    exports lk.chethana.bankingmanagementsystem.controllers;
    opens lk.chethana.bankingmanagementsystem.controllers to javafx.fxml;
}