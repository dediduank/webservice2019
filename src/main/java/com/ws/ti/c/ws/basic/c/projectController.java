/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ws.ti.c.ws.basic.c;

import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Dedi Wardani
 */
@Controller
public class projectController {

    @RequestMapping(value="/data/mahasiswa", produces={
        MediaType.APPLICATION_XML_VALUE
    })
    @ResponseBody
    public ArrayList<String> getDataMhs() {
        ArrayList<String> kelas = new ArrayList<>();

        kelas.add("2019C");
        kelas.add("2020A");
        kelas.add("2021B");

        return kelas;
    }
    
    @GetMapping(value="/data/product", produces={
        MediaType.APPLICATION_JSON_VALUE
    })
    @ResponseBody
    public ArrayList<String> getDataBarang() {
        ArrayList<String> product = new ArrayList<>();

        product.add("Mouse");
        product.add("Keyboard");
        product.add("Monitor");

        return product;
    }

}
