package br.com.dio.challenge.domain;

import java.time.LocalDate;

public
class Mentoring extends Content {
    private LocalDate date;

    public
    LocalDate getData ( ) {
        return date;
    }

    public
    void setData (LocalDate date) {
        this.date = date;
    }

    @Override
    public
    String toString ( ) {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", data=" + date +
                '}';
    }

    @Override
    public
    double calculateXp ( ) {
        return XP_PADRAO + 20d;
    }
}
