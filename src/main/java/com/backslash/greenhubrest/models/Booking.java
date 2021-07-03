package com.backslash.greenhubrest.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("booking")
public class Booking {

    @Id
    private String id;
    @Field(name = "customerName")
    @Indexed(unique = true)
    private String customerName;
    @Field(name = "mobileNo")
    private String mobileNo;
    @Field(name = "pickUpLocation")
    private String pickUpLocation;
    @Field(name = "pickLat")
    private Double pickLat;
    @Field(name = "pickLon")
    private Double pickLon;
    @Field(name = "dropLocation")
    private String dropLocation;
    @Field(name = "dropLat")
    private Double dropLat;
    @Field(name = "dropLon")
    private Double dropLon;
    @Field(name = "quantity")
    private Integer quantity;


    public Booking(String id, String customerName, String mobileNo, String pickUpLocation, Double pickLat, Double pickLon, String dropLocation, Double dropLat, Double dropLon, Integer quantity) {
        this.id = id;
        this.customerName = customerName;
        this.mobileNo = mobileNo;
        this.pickUpLocation = pickUpLocation;
        this.pickLat = pickLat;
        this.pickLon = pickLon;
        this.dropLocation = dropLocation;
        this.dropLat = dropLat;
        this.dropLon = dropLon;
        this.quantity = quantity;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Double getPickLat() {
        return pickLat;
    }

    public void setPickLat(Double pickLat) {
        this.pickLat = pickLat;
    }

    public Double getPickLon() {
        return pickLon;
    }

    public void setPickLon(Double pickLon) {
        this.pickLon = pickLon;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public Double getDropLat() {
        return dropLat;
    }

    public void setDropLat(Double dropLat) {
        this.dropLat = dropLat;
    }

    public Double getDropLon() {
        return dropLon;
    }

    public void setDropLon(Double dropLon) {
        this.dropLon = dropLon;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
