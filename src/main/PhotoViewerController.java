package main;

import app.MetaDataProperty;
import app.Photo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class PhotoViewerController {

    @FXML private ImageView photoImageView;

    @FXML private ListView<Photo> photoListView;

    @FXML private TextField shutterText;

    @FXML private TextField apertureText;

    @FXML private TextField isoText;

    @FXML private TextArea commentTextArea;

    @FXML private Button editButton;

    @FXML private Button saveButton;

    private final ObservableList<Photo> photos = FXCollections.observableArrayList();

    private ArrayList<TextField> editables = new ArrayList<>();

    private Photo currentSelection;

    /**
     *
     *
     * */
    public void initialize() {
        photos.add(new Photo("Valley", "res/image/cliffside.jpeg"));
        photos.add(new Photo("Forest", "res/image/forest.jpeg"));
        photos.add(new Photo("Meadow", "res/image/meadow.jpeg"));
        photos.add(new Photo("Mountains", "res/image/mountains.jpeg"));
        photos.add(new Photo("Sunset", "res/image/sunset.jpeg"));
        photos.add(new Photo("Valley", "res/image/valley.jpeg"));

        editables.add(shutterText);
        editables.add(apertureText);
        editables.add(isoText);

        photoListView.setItems(photos);

        photoListView.getSelectionModel().selectedItemProperty().addListener(
                ((observable, oldValue, newValue) -> {
                    currentSelection = newValue;
                    var currentMeta = currentSelection.getMetaData();

                    shutterText.setText(currentMeta.getShutterSpeed());
                    apertureText.setText(currentMeta.getAperture());
                    isoText.setText(currentMeta.getIso());
                    commentTextArea.setText(currentSelection.getComment());
                    photoImageView.setImage(new Image(currentSelection.getImagePath()));

                })
        );



        setDefaults();
    }

    private void setDefaults() {
        photoListView.getSelectionModel().select(0);
    }

    @FXML
    private void editClicked() {

        for (TextField textField: editables) {
            textField.setEditable(true);
        }

        saveButton.setVisible(true);
        editButton.setVisible(false);

    }

    @FXML
    private void saveClicked() {
        for (TextField textField: editables) {
            textField.setEditable(false);
        }

        saveComment();
        saveMetaData();

        saveButton.setVisible(false);
        editButton.setVisible(true);

    }

    private void saveMetaData() {
       currentSelection.setMetaData(new MetaDataProperty(shutterText.getText(), apertureText.getText(), isoText.getText()));
    }

    private void saveComment() {
        currentSelection.setComment(commentTextArea.getText());
    }

}
