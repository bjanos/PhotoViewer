package app;

public class MetaDataProperty {

    private String shutterSpeed;
    private String aperture;
    private String iso;


    public MetaDataProperty(String shutterSpeed, String aperture) {
        this(shutterSpeed, aperture, "na");
    }

    public MetaDataProperty(String shutterSpeed, String aperture, String ISO) {
        this.shutterSpeed = shutterSpeed;
        this.aperture = aperture;
        this.iso = ISO;
    }

    public String getShutterSpeed() {
        return shutterSpeed;
    }

    public String getAperture() {
        return aperture;
    }

    public String getIso() {
        return iso;
    }
}
