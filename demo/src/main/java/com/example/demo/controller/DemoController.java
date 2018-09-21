package com.example.demo.controller;

import com.example.demo.model.President;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
    Created By Navid Salehvaziri at 9/21/2018
*/
@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping(value = "/presidents",produces = "application/json")
    public ResponseEntity<List<President>> getPresident(){
        List<President> presidents=new ArrayList<>();
        President president=new President();
        president.setName("navid");
        presidents.add(president);
        return new ResponseEntity<List<President>>(presidents, HttpStatus.OK) ;
    }
}
