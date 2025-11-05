package com.backend.gestion.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.backend.gestion.services.interfaces.CamionService;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import com.backend.gestion.entities.Camion;

@RestController
@RequestMapping("/api/v1/gestion/camion")
public class CamionController {
    
    private final CamionService service;

    public CamionController(CamionService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Camion>> getAllCamiones() {
        return ResponseEntity.ok(service.getAllCamiones());
    }
    
    @PostMapping
    public ResponseEntity<Camion> createCamion(Camion camion) {
        return ResponseEntity.ok(service.createCamion(camion));
    }


}