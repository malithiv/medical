package lk.ijse.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SupplierController {
    @FXML
    private TableColumn<?, ?> colAddress;
    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colContact;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<?> tblSupplier;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtContact;

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
