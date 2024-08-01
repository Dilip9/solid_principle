package org.solid.controller;

import org.solid.model.Users;
import org.solid.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/version/", produces = "application/json")
@CrossOrigin(origins = "*")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/create")
    public Users saveUsers(@RequestBody Users usr){
        System.out.println("::::: details::: "+usr);
        return usersService.save(usr);
    }
}
