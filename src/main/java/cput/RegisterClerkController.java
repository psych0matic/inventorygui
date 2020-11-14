package cput;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class RegisterClerkController implements Initializable {

    /* Component names */
    @FXML
    private Button btnClose;

    @FXML
    private Label lblClerkRegistered, lblConfirmPasswordError,lblSelectUniversity;

    @FXML
    private PasswordField pwdPassword,pwdConfirmPassword;

    @FXML
    private TextField txtEmail,txtName,txtSurname,txtPhone;

    @FXML
    private ComboBox cmbUniversity;

    /* Default initialization function. It's supposed to initialize the images but they already are? */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    /* This function is called when the register button is clicked */
    public void btnRegisterOnAction(ActionEvent e) {
        // Confirm that the passwords match
        if (pwdPassword.getText().equals(pwdConfirmPassword.getText())) {
            // if they match, register the clerk
            registerClerk();
            lblConfirmPasswordError.setText("");
        } else {
            // If they do not match, display error
            lblConfirmPasswordError.setText("Passwords do not match!");
        }
    }

    /* This function is called when the close button is clicked */
    public void btnCloseOnAction(ActionEvent e) {
        // get the stage the close button is on, createclerk.fxml
        Stage stage = (Stage) btnClose.getScene().getWindow();
        //close it
        stage.close();
        // Close the login form too
        Platform.exit();
    }

    /* This function is called when clerk will be registered */
    public void registerClerk() {
        // Connect to the database
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConection();

        // Get the variables from the text fields
        String email = txtEmail.getText();
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String phone = txtPhone.getText();
        String password = pwdPassword.getText();
        String universityId = "";

        // If no university is selected from the combobox display an error
        if (cmbUniversity.getValue() == null) {
            lblSelectUniversity.setText("Please select a university");
        } else {
            // Select the index of the selection. if you select CPUT, the index will be 0
            universityId = cmbUniversity.getSelectionModel().getSelectedIndex() +"";

            // SQL statement to insert into the control clerk table
            String query = String.format("INSERT INTO control_clerk (clerk_id,email_address,first_name, password,phone_num,surname,university_id) VALUES ('ABC','%s','%s','%s','%s','%s','%s')",email,name,password,phone,surname,universityId);


            try {
                Statement statement = connectDB.createStatement();
                statement.executeUpdate(query);

                lblClerkRegistered.setText("Clerk Registered!");
            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }
        }



    }

}
