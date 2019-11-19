/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.computacion.ejercicioclase.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chalimbu
 */
@RestController
public class StatusController {
    @GetMapping
    public String status(){
        return "runnig server";
    }
    
}
