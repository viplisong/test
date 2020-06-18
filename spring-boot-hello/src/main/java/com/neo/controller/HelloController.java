package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public List index() {
        List list = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        return list;
    }
}