package com.galvanize.grandfatherclock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ClockController {
    @GetMapping("/")
    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }
}
