package com.demo.springcloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping
public class Admin {
    @GetMapping("/get")
    public String getAdmin(@RequestParam("adminName") String adminName) {
        return adminName;
    }
}
