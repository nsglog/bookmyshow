package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;
@Entity
@Getter
@Setter
public class Theatre extends BaseModel  {
    private String name;
    private String address;
    private List<Auditorium> auditoriums;
    private List<UpcomingShow> upcomingShows;
    private City city;
}
