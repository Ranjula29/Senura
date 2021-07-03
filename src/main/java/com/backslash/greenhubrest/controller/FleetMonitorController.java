package com.backslash.greenhubrest.controller;


import com.backslash.greenhubrest.models.Fleet;
import com.backslash.greenhubrest.services.FleetMonitorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fleet")
public class FleetMonitorController {

    private final FleetMonitorService fleetMonitorService;

    public FleetMonitorController(FleetMonitorService fleetMonitorService) {
        this.fleetMonitorService = fleetMonitorService;
    }

    @PostMapping
    public ResponseEntity addFleetGPS(@RequestBody Fleet fleet) {
        fleetMonitorService.gpsChecker(fleet);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
