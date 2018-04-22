package app;

public class Photo {

    private String title;
    private String imagePath;
    private MetaDataProperty metaData;

    public Photo(String title, String imagePath) {
        this.title = title;
        this.imagePath = imagePath;
        metaData = new MetaDataProperty("na", "na", "na");
    }

    public Photo(String title, String imagePath, MetaDataProperty metaData) {
        this.title = title;
        this.imagePath = imagePath;
        this.metaData = metaData;
    }

    public String getTitle() {
        return title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public MetaDataProperty getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataProperty metaData) {
        this.metaData = metaData;
    }

    @Override
    public String toString() {
        return title;
    }


}
