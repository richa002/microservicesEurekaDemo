package com.example.configclientvehicleservice;

import com.richa.microserviceDemo.commons.Customer;
import com.richa.microserviceDemo.commons.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleRepository vehicleRepository;

    @PostMapping(value="/vehicles",consumes = MediaType.APPLICATION_JSON_VALUE)

    public Vehicle save(@RequestBody Vehicle vehicle){

        return vehicleRepository.save(vehicle);
    }

    @RequestMapping("/vehicles")
    public List<Vehicle> getAll(){
        return vehicleRepository.findAll();
    }

}
