package app.bruner.customlistviewapp;

public class ProgrammingLanguageCourse {

    private String image;

    private String name;

    private String duration;

    private String fees;


    public ProgrammingLanguageCourse(String image, String name, String duration, String fees) {
        this.image = image;
        this.name = name;
        this.duration = duration;
        this.fees = fees;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public String getFees() {
        return fees;
    }
}
