package app;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class ImageTextCell extends ListCell<Photo> {
    private HBox hBox = new HBox(8.0);
    private ImageView thumbImage = new ImageView();
    private Label label = new Label();

    public ImageTextCell() {
        hBox.setAlignment(Pos.CENTER);
        thumbImage.setPreserveRatio(true);
        //thumbImage.setFitHeight(50);
        hBox.getChildren().add(label);
        hBox.getChildren().add(thumbImage);
    }

    @Override
    protected void updateItem(Photo item, boolean empty) {
        super.updateItem(item, empty);

        if (empty || item == null) {
            setGraphic(null);
        } else {
            thumbImage.setImage(new Image(item.getImagePath()));
            //label.setText(item.toString());
        }
    }
}
