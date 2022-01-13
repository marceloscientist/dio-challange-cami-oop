package br.com.dio.challenge.domain;

public
class Course {
    private String title;
    private String description;
    private int trainingHours;

    public
    Course (String title, String description, int trainingHours) {
        this.title = title;
        this.description = description;
        this.trainingHours = trainingHours;
    }

    public
    String getTitle ( ) {
        return title;
    }

    public
    void setTitle (String title) {
        this.title = title;
    }

    public
    String getDescription ( ) {
        return description;
    }

    public
    void setDescription (String description) {
        this.description = description;
    }

    public
    int getTrainingHours ( ) {
        return trainingHours;
    }

    public
    void setTrainingHours (int trainingHours) {
        this.trainingHours = trainingHours;
    }

    @Override
    public
    String toString ( ) {
        return "Curso{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", trainingHours=" + trainingHours +
                '}';
    }
}
