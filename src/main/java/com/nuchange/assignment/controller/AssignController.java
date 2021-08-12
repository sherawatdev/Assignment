package com.nuchange.assignment.controller;

import com.nuchange.assignment.model.AssignModel;
import com.nuchange.assignment.service.AssignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AssignController {

    private final AssignService assignService;

    @Autowired
    public AssignController(AssignService assignService) {
        this.assignService = assignService;
    }

    @PostMapping("/storeurl")
    public AssignModel storeUrl(@RequestParam String url){
        return assignService.storeUrl(url);
    }

    @GetMapping("/get")
    public String getKey(@RequestParam String url){ return assignService.getKey(url); }

    @GetMapping("/count")
    public int getCount(@RequestParam String url){ return assignService.getCount(url); }
}