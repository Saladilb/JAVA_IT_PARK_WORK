package com.saladilb.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class SubmitController {

    @RequestMapping("/submit")
    public String submit(HttpServletRequest request) {
        request.setAttribute("mode", "Lol");
        return "index";
    }
}
