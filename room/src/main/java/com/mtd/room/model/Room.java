package com.mtd.room.model;

import org.springframework.data.annotation.Id;
import  org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "rooms") // collection in MongoDB
public class Room {
    @Id // primary key
    private String id;
    private String roomNumber;
    private int numberOfPax;
    private double pricePerNight;
    private List<String> amenities;

    public int getNumberOfPax() {
        return numberOfPax;
    }

    public void setNumberOfPax(int numberOfPax) {
        this.numberOfPax = numberOfPax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

}
