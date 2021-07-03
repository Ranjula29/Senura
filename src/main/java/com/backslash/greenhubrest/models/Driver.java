package com.backslash.greenhubrest.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document("driver")
public class Driver {

    @Id
    private String id;
    @Field(name = "driverName")
    private String driverName;
    @Field(name = "password")
    private String password;
    @Field(name = "mobile")
    private String mobile;
    @Field(name = "address")
    private String address;
    @Field(name = "nic")
    @Indexed(unique = true)
    private String nic;
    @Field(name = "licenseNo")
    @Indexed(unique = true)
    private String licenseNo;
    @Field(name = "age")
    private Integer age;
    @Field(name = "plateNo")
    @Indexed(unique = true)
    private String plateNo;
    @Field(name = "type")
    private VehicleType vehicleType;


    public Driver(String id, String driverName, String password, String mobile, String address, String nic, String licenseNo, Integer age, String plateNo, VehicleType vehicleType) {
        this.id = id;
        this.driverName = driverName;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
        this.nic = nic;
        this.licenseNo = licenseNo;
        this.age = age;
        this.plateNo = plateNo;
        this.vehicleType = vehicleType;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
