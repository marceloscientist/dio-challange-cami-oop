package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public
class Dev {
    private String nome;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public
    String getNome ( ) {
        return nome;
    }

    public
    void setNome (String nome) {
        this.nome = nome;
    }

    public
    Set<Content> getSubscribedContents ( ) {
        return subscribedContents;
    }

    public
    void setSubscribedContents (Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public
    Set<Content> getFinishedContents ( ) {
        return finishedContents;
    }

    public
    void setFinishedContents (Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public
    boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(subscribedContents, dev.subscribedContents) && Objects.equals(finishedContents, dev.finishedContents);
    }

    @Override
    public
    int hashCode ( ) {
        return Objects.hash(nome, subscribedContents, finishedContents);
    }

    public void bootcampSubscribed(Bootcamp bootcamp) {}
    public void progress() {}
    public void totalXpAmount() {}


}
