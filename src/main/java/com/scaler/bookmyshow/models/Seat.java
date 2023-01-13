package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel {
    private String name;
    private SeatType seatType;
    int row;
    int column;
    private SeatStatus seatStatus;
}
