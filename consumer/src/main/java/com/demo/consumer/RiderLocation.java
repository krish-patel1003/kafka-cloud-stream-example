package com.demo.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
