package com.backslash.greenhubrest.repository;

import com.backslash.greenhubrest.models.Fleet;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FleetMonitorRepository extends MongoRepository<Fleet,String> {

    @Query("{'licenseNo': ?0}")
    Fleet findByLicenseNo(String licenseNo);

//    @Query("{'location': ?0, 'distance': ?0 }")
    GeoResults<Fleet> findByLocationNear(Point location, Distance distance);

}
