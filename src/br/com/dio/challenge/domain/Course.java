package br.com.dio.challenge.domain;

public
class Course extends Content {
    private int trainingHours;

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
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", trainingHours=" + trainingHours +
                '}';
    }

    @Override
    public
    double calculateXp ( ) {
        return XP_PADRAO * getTrainingHours();
    }
}
