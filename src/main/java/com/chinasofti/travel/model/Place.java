package com.chinasofti.travel.model;

import javax.persistence.*;

@Entity
@Table(name="PLACE")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    private long id;

    @Column(name="LOCATE")
    private String locate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public Place(long id, String locate) {
        this.id = id;
        this.locate = locate;
    }

    public Place() {
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", locate='" + locate + '\'' +
                '}';
    }

    public void setPlace(Place place){
        this.id=place.getId();
        this.locate=place.getLocate();
    }
}
