package com.example.demo.controller;

import com.example.demo.model.President;
import com.example.demo.service.PresidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
    Created By Navid Salehvaziri at 9/24/2018
*/
@RestController
@RequestMapping(value = "/demo",produces = "application/json")
public class PresidentController {
    @Autowired
    private PresidentService service;

    @RequestMapping(value="/presidents", method = RequestMethod.GET)
    public ResponseEntity<List<President>> getPresidents(){
        List<President> presidents= service.getPeredidents();
        if(presidents==null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(presidents,HttpStatus.OK);
    }

    @RequestMapping(value="/presidents/alive", method = RequestMethod.GET)
    public ResponseEntity<List<President>> getAlivePresidents(){
        List<President> presidents= service.getAlivePeredidents();
        if(presidents==null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(presidents,HttpStatus.OK);
    }
}
