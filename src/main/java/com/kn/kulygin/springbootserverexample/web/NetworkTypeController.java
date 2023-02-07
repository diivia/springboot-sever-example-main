package com.kn.kulygin.springbootserverexample.web;

import com.kn.kulygin.springbootserverexample.service.DocumentsService;
import com.kn.kulygin.springbootserverexample.service.NetworkTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetworkTypeController {
    private NetworkTypeService service;

    public NetworkTypeController(NetworkTypeService service) {
        this.service = service;
    }

    @GetMapping("/api/networktypes")
    public ResponseEntity<?> findAllTypes() {
        return new ResponseEntity<>(service.findAllTypes(), HttpStatus.OK);
    }
}
