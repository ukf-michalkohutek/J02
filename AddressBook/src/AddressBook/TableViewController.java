package AddressBook;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

import java.util.Comparator;

public class TableViewController {
    @FXML private TableView<Student> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;

    @FXML
    protected void addStudent(ActionEvent event) {
        ObservableList<Student> data = tableView.getItems();
        // Pridaval sa aj prazdny riadok.
        if (this.firstNameField.getText().equals("")
                && this.emailField.getText().equals("")
                && this.lastNameField.getText().equals("")) return;

        data.add(new Student(firstNameField.getText(),
                lastNameField.getText(),
                emailField.getText()
        ));

        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");

    }

    @FXML
    public void removeStudent(ActionEvent actionEvent) {
        this.tableView.getItems().remove(this.tableView.getSelectionModel().getSelectedItem());
    }
}
