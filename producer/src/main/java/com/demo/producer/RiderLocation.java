package com.demo.producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class RiderLocation {

    private String riderId;
    private double latitude;
    private double longitude;

    @Override
    public String toString() {
        return "RiderLocation{" +
                "riderId='" + riderId + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
