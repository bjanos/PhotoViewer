package app;

public class Photo {

    private String title;
    private String imagePath;
    private MetaDataProperty metaData;
    private String comment;

    public Photo(String title, String imagePath) {
        this(title, imagePath, new MetaDataProperty("na", "na", "na"), " ");
    }

    public Photo(String title, String imagePath, String comment) {
        this(title, imagePath, new MetaDataProperty("na", "na", "na"), comment);
    }

    public Photo(String title, String imagePath, MetaDataProperty metaData, String comment) {
        this.title = title;
        this.imagePath = imagePath;
        this.metaData = metaData;
        this.comment = comment;
    }

    public String getImagePath() {
        return imagePath;
    }

    public MetaDataProperty getMetaData() {
        return metaData;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setMetaData(MetaDataProperty metaData) {
        this.metaData = metaData;
    }

    @Override
    public String toString() {
        return title;
    }


}
