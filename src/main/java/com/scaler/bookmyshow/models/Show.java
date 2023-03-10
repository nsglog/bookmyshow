package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Show extends BaseModel {
    private Movie movie;
    private Date startTime;
    private Date endTime;
    private Auditorium auditorium;
    private List<Feature> showFeatures;
}
