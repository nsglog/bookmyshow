package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Auditorium extends BaseModel   {
    private String name;
    private List<Seat> seats;
    private List<Feature> auditoriumFeatures;
}
