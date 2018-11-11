package com.multimodule.service;


import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String message() {
        return "MyService multi Module";
    }
}