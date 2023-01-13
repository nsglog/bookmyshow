package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Movie extends BaseModel    {
    private String name;
    private List<Actor> actors;
    private List<Feature> movieFeatures;
    private List<Genre> genres;

}
