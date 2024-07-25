package org.solid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Degree {

    @GetMapping("/getAllDegree")
    public String getAllDegree(){
        return "MCA with 8 CGPA";
    }


}
