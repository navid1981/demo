package com.example.demo.dao;

import com.example.demo.model.President;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/*
    Created By Navid Salehvaziri at 9/24/2018
*/
@Repository
public class PresidentDao {

public static final String path=".\\src\\main\\resources\\presidents.json";

public List<President> getPresidents() throws IOException {
    String json=readFile(path);

    ObjectMapper om=new ObjectMapper();
    JsonNode jn=om.readTree(json);
    json=jn.findPath("presidents").toString();

    List<President> presidents=om.readValue(json,new TypeReference<List<President>>(){});

    return presidents;
}

    private String readFile(String path){
        StringBuilder sb=new StringBuilder();
        try(FileReader fr=new FileReader(path)){
            int value=0;
            while(true){
                value=fr.read();
                if(value!=-1){
                    char c=(char)value;
                    sb.append(c);
                }else{
                    break;
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return sb.toString();
    }
}
