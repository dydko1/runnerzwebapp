package com.dydko.runnerzwebapp.old;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Miro";
    }

    @PostMapping("/post-order")
    public String post(@RequestBody Order order) {
        return "Order is accepted: " + order;
    }

    @PostMapping("/post-order-record")
    public String postRecord(@RequestBody OrderRecord order) {
        return "Order is accepted: " + order;
    }

    @GetMapping("/hello2/{name}")
    public String pathVariable(@PathVariable String name) {
        return "My name is: " + name;
    }

    @GetMapping("/hello2")
    public String requestPar(@RequestParam("n") String name, @RequestParam("s") String surname) {
        return "My name is: " + name + " " + surname;
    }
}
