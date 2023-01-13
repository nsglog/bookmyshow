package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
public class Payment extends BaseModel  {
    private PaymentMethod paymentMethod;
    private Date timeOfPayment;
    private Double amount;
    private String referenceId;
    private PaymentStatus paymentStatus;
    private Ticket ticket;
}
