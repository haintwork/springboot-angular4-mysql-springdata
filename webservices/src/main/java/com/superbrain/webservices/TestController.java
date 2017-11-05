package com.superbrain.webservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author haing
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping
    public String get() {
        return "Test success!";
    }
}
