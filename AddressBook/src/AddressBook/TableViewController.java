package AddressBook;

import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class TableViewController {
    @FXML private TableView<Student> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;

    @FXML
    protected void addStudent() {
        ObservableList<Student> data = tableView.getItems();
        data.add(new Student(firstNameField.getText(),
                lastNameField.getText(),
                emailField.getText()
        ));
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
    }

    @FXML
    protected void removeStudent() {
        ObservableList<Student> data = tableView.getItems();
        ObservableList<Student> student = tableView.getSelectionModel().getSelectedItems();
        student.forEach(data::remove);
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
    }
}
