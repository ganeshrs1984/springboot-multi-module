package com.multimodule.controller;

import com.multimodule.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @RequestMapping(method = RequestMethod.GET, value = "/mesaage")
    public String getMessage(){
        return myService.message();

    }
}
