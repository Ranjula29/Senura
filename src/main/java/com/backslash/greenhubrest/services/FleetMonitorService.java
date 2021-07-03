package com.backslash.greenhubrest.services;

import com.backslash.greenhubrest.models.Fleet;
import com.backslash.greenhubrest.repository.FleetMonitorRepository;
import org.springframework.stereotype.Service;


@Service
public class FleetMonitorService {

    private final FleetMonitorRepository fleetMonitorRepository;


    public FleetMonitorService(FleetMonitorRepository fleetMonitorRepository) {
        this.fleetMonitorRepository = fleetMonitorRepository;

    }


    public void gpsChecker(Fleet fleet) {

        Fleet updateData = new Fleet();
        double[] locationArray = new double[2];

        Fleet isFleetDataAvailable = fleetMonitorRepository.findByLicenseNo(fleet.getLicenseNo());

        if(isFleetDataAvailable == null){

            System.out.println("Insert");
            fleetMonitorRepository.insert(fleet);
        } else {

            System.out.println("Update");

            updateData.setId(isFleetDataAvailable.getId());
            updateData.setLicenseNo(fleet.getLicenseNo());
            updateData.setNic(fleet.getNic());
            updateData.setPlateNo(fleet.getPlateNo());
            updateData.setMobileNo(fleet.getMobileNo());

            updateData.setLat(fleet.getLat());
            updateData.setLon(fleet.getLon());
            updateData.setVehicleStatus(fleet.getVehicleStatus());
            updateData.setVehicleCapacity(fleet.getVehicleCapacity());
            updateData.setCurrentCapacity(fleet.getCurrentCapacity());

            locationArray[0] = fleet.getLat();
            locationArray[1] = fleet.getLon();
            updateData.setLocation(locationArray);

            fleetMonitorRepository.save(updateData);
        }




    }


}
