package cput;

import cput.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    /* These are the names of the components in the login.fxml that we will use */
    @FXML
    private Button btnCancel,btnTestCreateClerk,btnTestRegisterClerk,btnTestComplete,btnTestDash,btnTestDevice,btnTestFurn,btnTestOrders,btnTestStock,btnTestUni;
    @FXML
    private Label lblLoginStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField ptxtPassword;
    @FXML
    private ComboBox cmbChoice;

    /* Default initialization function. It's supposed to initialize the images but they already are? */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    /* This function is called when the login button is clicked */
    public void btnLoginOnAction(ActionEvent e) {
//        if (txtUsername.getText().isBlank() == false && ptxtPassword.getText().isBlank() == false && cmbChoice.getSelectionModel().isSelected(0)) {
//            validateLogin();
//        } else {
//            lblLoginStatus.setText("Invalid username or password!");
//        }
    }

    /* This function is called when the cancel button is clicked */
    public void btnCancelOnAction(ActionEvent e) {
        // Select the current stage, login.fxml
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        // close the stage
        stage.close();
    }

    public void validateLogin() {
        // Connect to the database using mysql
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConection();

        //Remove this later and uncomment the other code
//        createControlClerkForm();
//        String verifyLogin = "SELECT count(1) FROM user_account WHERE username = '" + txtUsername.getText() + "' AND password = '" + ptxtPassword.getText() + "'";
//
//        try {
//            Statement statement = connectDB.createStatement();
//            ResultSet queryResult = statement.executeQuery(verifyLogin);
//
//            while(queryResult.next()) {
//                if (queryResult.getInt(1) == 1) {
//                    lblLoginStatus.setText("Success!");
//                    createControlClerkForm();
//                } else {
//                    lblLoginStatus.setText("Invalid login!");
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            e.getCause();
//        }
    }

    /* Creates and shows the createclerk.fxml form */
    public void createControlClerkForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("createclerk.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.setScene(new Scene(root,520,729));
            registerStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /*
        THESE ARE TEST METHODS TO VIEW THE FORMS. THEY WILL BE REMOVED LATER
     */

    public void btnTestCreateClerkOnAction(ActionEvent e){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("createclerk.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,600,489));
            registerStage.show();
        } catch (Exception cc) {
            cc.printStackTrace();
            cc.getCause();
        }
    }

    public void btnTestRegisterClerkOnAction(ActionEvent e){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("registerclerk.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,600,489));
            registerStage.show();
        } catch (Exception rc) {
            rc.printStackTrace();
            rc.getCause();
        }
    }

    public void btnTestCompleteOnAction(ActionEvent e){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("completeprofile.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,600,489));
            registerStage.show();
        } catch (Exception cp) {
            cp.printStackTrace();
            cp.getCause();
        }
    }

    public void btnTestDashOnAction(ActionEvent e){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,921,600));
            registerStage.show();
        } catch (Exception d) {
            d.printStackTrace();
            d.getCause();
        }
    }

    public void btnTestDeviceOnAction(ActionEvent e){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("devicetype.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,921,600));
            registerStage.show();
        } catch (Exception de) {
            de.printStackTrace();
            de.getCause();
        }
    }

    public void btnTestFurnOnAction(ActionEvent e){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("furnituretype.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,921,600));
            registerStage.show();
        } catch (Exception f) {
            f.printStackTrace();
            f.getCause();
        }
    }

    public void btnTestOrdersOnAction(ActionEvent e){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("orders.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,921,600));
            registerStage.show();
        } catch (Exception o) {
            o.printStackTrace();
            o.getCause();
        }
    }

    public void btnTestStockOnAction(ActionEvent e){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("stock.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,921,600));
            registerStage.show();
        } catch (Exception s) {
            s.printStackTrace();
            s.getCause();
        }
    }

    public void btnTestUniOnAction(ActionEvent e){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("university.fxml"));
            // We must initialize a new stage
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(root,921,600));
            registerStage.show();
        } catch (Exception u) {
            u.printStackTrace();
            u.getCause();
        }
    }

}
