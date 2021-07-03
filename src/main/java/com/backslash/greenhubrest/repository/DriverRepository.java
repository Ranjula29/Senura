package com.backslash.greenhubrest.repository;

import com.backslash.greenhubrest.models.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends MongoRepository<Driver,String> {


}
