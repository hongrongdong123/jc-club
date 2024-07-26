package com.hrd.interview.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 */
@RestController
@RequestMapping("/interview/")
public class demo {


    @RequestMapping("test")
    public String test() {
        return "hello word";
    }
}
