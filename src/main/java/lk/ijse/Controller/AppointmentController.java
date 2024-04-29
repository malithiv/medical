package lk.ijse.Controller;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AppointmentController {
    @FXML
    private TextField txtDId;

    @FXML
    private TextField txtPId;

    @FXML
    private TextField txtAId;

    @FXML
    private JFXDatePicker txtDate;

    @FXML
    private JFXTimePicker txtTime;


    @FXML
    void btnClearOnAction(){}

    @FXML
    void btnSaveOnAction(){}

    @FXML
    void btnUpdateOnAction(){}

    @FXML
    void btnDeleteOnAction(){}

    @FXML
    void txtSearchOnAction(){}

    @FXML
    void btnBackOnAction(){}
}
