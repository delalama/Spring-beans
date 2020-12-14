package com.delalama.AOP;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("aspects")
public class MethodController {

    @GetMapping
    public ResponseEntity<String> methodOne(){

        return new ResponseEntity<String>("foo", HttpStatus.OK);
    }
}
