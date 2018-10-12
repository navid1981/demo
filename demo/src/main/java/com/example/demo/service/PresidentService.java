package com.example.demo.service;

import com.example.demo.dao.PresidentDao;
import com.example.demo.model.President;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/*
    Created By Navid Salehvaziri at 9/24/2018
*/
@Service
public class PresidentService {
    @Autowired
    private PresidentDao dao;

    public List<President> getPeredidents(){

        List<President> presidents;
        try {
            presidents=dao.getPresidents();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return presidents;
    }

    public List<President> getAlivePeredidents(){
        List<President> presidents=getPeredidents();
        return presidents.stream().filter(p->p.getDeath_year()==0).collect(Collectors.toList());
    }

}
