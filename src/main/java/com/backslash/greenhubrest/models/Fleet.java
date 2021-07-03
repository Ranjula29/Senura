package com.backslash.greenhubrest.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("fleet")
public class Fleet {

    @Id
    private String id;
    @Field(name = "licenseNo")
    private String licenseNo;
    @Field(name = "nic")
    private String nic;
    @Field(name = "plateNo")
    private String plateNo;
    @Field(name = "mobileNo")
    private String mobileNo;
    @Field(name = "lat")
    private Double lat;
    @Field(name = "lon")
    private Double lon;
    @Field(name = "vehicleStatus")
    private String vehicleStatus;
    @Field(name = "location")
    @GeoSpatialIndexed
    private double[] location;
    @Field(name = "vehicleCapacity")
    private Double vehicleCapacity;
    @Field(name = "currentCapacity")
    private Double currentCapacity;

    public Fleet() {


    }

    public Fleet(String id, String licenseNo, String nic, String plateNo, String mobileNo, Double lat, Double lon, String vehicleStatus, Double currentCapacity, Double vehicleCapacity) {
        this.id = id;
        this.licenseNo = licenseNo;
        this.nic = nic;
        this.plateNo = plateNo;
        this.mobileNo = mobileNo;
        this.lat = lat;
        this.lon = lon;
        this.vehicleStatus = vehicleStatus;
        this.location = new double[2];
        location[0] = lat;
        location[1] = lon;
        this.vehicleCapacity = vehicleCapacity;
        this.currentCapacity = currentCapacity;
    }



    public String getId() {
        return id;
    }

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public double[] getLocation() {
        return location;
    }

    public void setLocation(double[] location) {
        this.location = location;
    }

    public Double getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(Double vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    public Double getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(Double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
