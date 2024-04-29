package lk.ijse.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DoctorController {
    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colContact;

    @FXML
    private TableColumn<?, ?> colSpeciality;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<?> tblDoctor;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSpeciality;

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
