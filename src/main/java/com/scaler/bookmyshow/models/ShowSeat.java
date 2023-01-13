package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel {
    private Show show;
    private Seat seat;
    private ShowSeatState showSeatState;
}
