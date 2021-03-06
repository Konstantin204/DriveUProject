package com.driveu.models.responses;

import java.sql.Driver;
import java.util.Optional;

public class OrderResponse extends BaseResponse{

    public Long Id;
    public String Description;
    public double Price;
    public Long CustomerId;
    public Long DriverId;
    public String Origin;
    public String Destination;

    public OrderResponse(String message){
        super(message);
    }
    public OrderResponse(String message, Long id, String origin, String destination, double price, Long customerId, String description, Long... driverId) {
        super(message);
        Id = id;
        Description = description;
        Price = price;
        CustomerId = customerId;
        Origin = origin;
        Destination = destination;
        if(driverId.length > 0)
            DriverId = driverId[0];

    }
}
