package com.my.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alive")
public class AliveTestController {

    @RequestMapping(value = "/isAlive", produces = "application/json; charset=utf-8")
    public @ResponseBody String isAlive() throws Exception {
        return "0000";
    }
}
