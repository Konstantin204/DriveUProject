package com.driveu.controllers;

import com.driveu.entities.Client;
import com.driveu.services.HttpRouteService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/test")
    public String test(@RequestAttribute Client client)
    {
        var directions = HttpRouteService.GetDirections("Illuzion", "Club 33");
        return String.format("Hello, %s!", client.getUsername());
    }



}
