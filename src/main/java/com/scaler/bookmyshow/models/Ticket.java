package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
public class Ticket extends BaseModel   {
    private User bookedBy;
    private Show show;
    private List<ShowSeat> showSeats;
    private Double totalAmount;
    private TicketStatus ticketStatus;
    private Date timeOfBooking;

}
