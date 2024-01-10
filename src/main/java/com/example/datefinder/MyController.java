package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @GetMapping("/")
    public String getWelcomeText() {
        LocalDate todaydate = LocalDate.now();
        LocalDate result = todaydate.plusDays(100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String futureDate = result.format(formatter);
        return futureDate;
    }
}
